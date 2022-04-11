grammar myCompiler;

options {
    language = Java;
}

@header {
    // import packages here.
    import java.util.Map;
    import java.util.HashMap;
    import java.util.ArrayList;
    import java.util.AbstractMap;
}

@members {
    boolean TRACEON = false;

    // =============================================
    // Create a symbol table.
    // ArrayList is easy to extend to add more info. into symbol table.
    //
    // The structure of symbol table:
    // <variable ID, type, memory location>
    //    - type: the variable type   (please check "enum Type")
    //    - memory location: the location (locals in VM) the variable will be stored at.
    //
    // We use "AbstractMap.SimpleEntry"
    // type and memory location are stored as a AbstractMap.SimpleEntry<Type, Integer>.
    //
    // =============================================
    HashMap<String, AbstractMap.SimpleEntry> symtab = new HashMap<String, AbstractMap.SimpleEntry>();
    HashMap<String, String> switch_tab = new HashMap<String, String>();

    int labelCount = 0;
    int condition_label = -1;
    int do_label = -1;
    int end_label = -1;
    int for_do_label = -1;
    int arith_to_assign = -1;
    int parameter_cnt = 0;
	
    // storageIndex is used to represent/index the location (locals) in VM.
    // The first index is 0.
    int storageIndex = 0;

    // Record all assembly instructions.
    List<String> TextCode = new ArrayList<String>();
    List<String> tmpTextCode = new ArrayList<String>();
    List<String> tmpTextCode2 = new ArrayList<String>();

    // Type information.
    public enum Type{
        INT,
        SHORT,
        LONG,
        FLOAT,
        DOUBLE,
        CHAR,
        BOOL;
    }

    // Output prologue.
    void prologue()
    {
        TextCode.add(";.source");
        TextCode.add(".class public static myResult");
        TextCode.add(".super java/lang/Object");
        TextCode.add(".method public static main([Ljava/lang/String;)V");

        /* The size of stack and locals should be properly set. */
        TextCode.add(".limit stack 100");
        TextCode.add(".limit locals 100");
    }

    // Output epilogue.
    void epilogue()
    {
        /* handle epilogue */
        TextCode.add("return");
        TextCode.add(".end method");
    }

    // Generate a new label
    String newLabel()
    {
        labelCount ++;
        return (new String("L")) + Integer.toString(labelCount);
    }

    String getLabel(int t)
    {
        return (new String("L")) + Integer.toString(t);
    }
   
    public List<String> getTextCode()
    {
        return TextCode;
    }
}

program
	: header_file prog ;

header_file
	: '#' INCLUDE '<' ID '.h' '>' header_file
    | ;

prog
    : VOID_TYPE MAIN '(' ')' { prologue(); } '{' declarations statements '}' { epilogue(); }
    | INT_TYPE MAIN '(' ')' { prologue(); } '{' declarations statements '}' { epilogue(); }
    ;

declarations
	: type ID ';'
		{
			if (symtab.containsKey($ID.text))
			{
				System.out.println("Type Error: " + $ID.getLine() + ": Redeclared identifier.");
                System.exit(0);
			}
			
            /* Add ID and its attr_type into the symbol table. */
            AbstractMap.SimpleEntry<Type, Integer> the_entry = new AbstractMap.SimpleEntry<Type, Integer>($type.attr_type, Integer.valueOf(storageIndex));
            storageIndex = storageIndex + 1;
            symtab.put($ID.text, the_entry);
		}
	declarations

    | type ID '=' pre_logic_exprsssion ';'
        {
            if (symtab.containsKey($ID.text))
			{
				System.out.println("Type Error: " + $ID.getLine() + ": Redeclared identifier.");
                System.exit(0);
			}

            /* Add ID and its attr_type into the symbol table. */
            AbstractMap.SimpleEntry<Type, Integer> the_entry = new AbstractMap.SimpleEntry<Type, Integer>($type.attr_type, Integer.valueOf(storageIndex));
            storageIndex = storageIndex + 1;
            symtab.put($ID.text, the_entry);

            Type the_type;
            int the_mem;
            the_type = (Type) symtab.get($ID.text).getKey();
			the_mem = ((Integer) ((AbstractMap.SimpleEntry) symtab.get($ID.text)).getValue()).intValue();
            if (the_type != $pre_logic_exprsssion.attr_type)
            {
                System.out.println("Type error!\n");
                System.exit(0);
			}
            switch (the_type)
            {
			    case INT:
                    TextCode.add("istore " + the_mem);
                    break;
                case SHORT:
                    TextCode.add("istore " + the_mem);
                    break;
                case LONG:
                    TextCode.add("istore " + the_mem);
                    break;
			    case FLOAT:
                    TextCode.add("fstore " + the_mem);
			        break;
                case DOUBLE:
                    TextCode.add("dstore " + the_mem);
                    break;
			    case CHAR:
                    TextCode.add("istore " + the_mem);
			        break;
			}
        }
    declarations
    | ;

type returns [Type attr_type]
    : INT_TYPE { $attr_type=Type.INT; }
    | SHORT_TYPE { $attr_type=Type.SHORT; }
    | LONG_TYPE { $attr_type=Type.LONG; }
    | FLOAT_TYPE { $attr_type=Type.FLOAT; }
    | DOUBLE_TYPE { $attr_type=Type.DOUBLE; }
    | CHAR_TYPE { $attr_type=Type.CHAR; }
    ;

statements
	: statement statements
	| ;

pre_logic_exprsssion returns [Type attr_type]
    : a = pre_logic_2_exprsssion {$attr_type = $a.attr_type;}
        (
            {
                TextCode.add("ifeq " + newLabel());
                TextCode.add("ldc 1");
                TextCode.add("goto " + newLabel());
                labelCount = labelCount - 2;
                TextCode.add(newLabel() + " :");
                TextCode.add("ldc 0");
                TextCode.add(newLabel() + " :");
            }
            '||' b = pre_logic_2_exprsssion
            {
                if ($a.attr_type != $b.attr_type)
                {
                    System.out.println("Type Error: " + $a.start.getLine() + ": Type mismatch for the operator || in an expression.");
                    System.exit(0);
                }
                $attr_type = Type.BOOL;
                
                TextCode.add("ifeq " + newLabel());
                TextCode.add("ldc 1");
                TextCode.add("goto " + newLabel());
                labelCount = labelCount - 2;
                TextCode.add(newLabel() + " :");
                TextCode.add("ldc 0");
                TextCode.add(newLabel() + " :");

                TextCode.add("ior");
            }
        )*
    ;

pre_logic_2_exprsssion returns [Type attr_type]
    : a = pre_compare_exprsssion {$attr_type = $a.attr_type;}
        (
            {
                TextCode.add("ifeq " + newLabel());
                TextCode.add("ldc 1");
                TextCode.add("goto " + newLabel());
                labelCount = labelCount - 2;
                TextCode.add(newLabel() + " :");
                TextCode.add("ldc 0");
                TextCode.add(newLabel() + " :");
            }
            '&&' b = pre_compare_exprsssion
            {
                if ($a.attr_type != $b.attr_type)
                {
                    System.out.println("Type Error: " + $a.start.getLine() + ": Type mismatch for the operator && in an expression.");
                    System.exit(0);
                }
                $attr_type = Type.BOOL;
                
                TextCode.add("ifeq " + newLabel());
                TextCode.add("ldc 1");
                TextCode.add("goto " + newLabel());
                labelCount = labelCount - 2;
                TextCode.add(newLabel() + " :");
                TextCode.add("ldc 0");
                TextCode.add(newLabel() + " :");

                TextCode.add("iand");
            }
        )*
    ;

pre_compare_exprsssion returns [Type attr_type]
    : a = pre_arith_expression {$attr_type = $a.attr_type;}
        ( '==' b = pre_arith_expression
            {
                if ($a.attr_type != $b.attr_type)
                {
                    System.out.println("Type Error: " + $a.start.getLine() + ": Type mismatch for the operator == in an expression.");
                    System.exit(0);
                }
                $attr_type = Type.BOOL;
                
                if (($a.attr_type == Type.INT) && ($b.attr_type == Type.INT))
                {
                    TextCode.add("if_icmpeq " + newLabel());
                    TextCode.add("ldc 0");
                    TextCode.add("goto " + newLabel());
                    labelCount = labelCount - 2;
                    TextCode.add(newLabel() + " :");
                    TextCode.add("ldc 1");
                    TextCode.add(newLabel() + " :");
                }
                if (($a.attr_type == Type.SHORT) && ($b.attr_type == Type.SHORT))
                {
                    TextCode.add("if_icmpeq " + newLabel());
                    TextCode.add("ldc 0");
                    TextCode.add("goto " + newLabel());
                    labelCount = labelCount - 2;
                    TextCode.add(newLabel() + " :");
                    TextCode.add("ldc 1");
                    TextCode.add(newLabel() + " :");
                }
                if (($a.attr_type == Type.LONG) && ($b.attr_type == Type.LONG))
                {
                    TextCode.add("if_icmpeq " + newLabel());
                    TextCode.add("ldc 0");
                    TextCode.add("goto " + newLabel());
                    labelCount = labelCount - 2;
                    TextCode.add(newLabel() + " :");
                    TextCode.add("ldc 1");
                    TextCode.add(newLabel() + " :");
                }
                if (($a.attr_type == Type.FLOAT) && ($b.attr_type == Type.FLOAT))
                {
                    TextCode.add("fcmpl");
                    TextCode.add("ifeq " + newLabel());
                    TextCode.add("ldc 0");
                    TextCode.add("goto " + newLabel());
                    labelCount = labelCount - 2;
                    TextCode.add(newLabel() + " :");
                    TextCode.add("ldc 1");
                    TextCode.add(newLabel() + " :");
                }
                if (($a.attr_type == Type.DOUBLE) && ($b.attr_type == Type.DOUBLE))
                {
                    TextCode.add("dcmpl");
                    TextCode.add("ifeq " + newLabel());
                    TextCode.add("ldc 0");
                    TextCode.add("goto " + newLabel());
                    labelCount = labelCount - 2;
                    TextCode.add(newLabel() + " :");
                    TextCode.add("ldc 1");
                    TextCode.add(newLabel() + " :");
                }
                if (($a.attr_type == Type.CHAR) && ($b.attr_type == Type.CHAR))
                {
                    TextCode.add("if_icmpeq " + newLabel());
                    TextCode.add("ldc 0");
                    TextCode.add("goto " + newLabel());
                    labelCount = labelCount - 2;
                    TextCode.add(newLabel() + " :");
                    TextCode.add("ldc 1");
                    TextCode.add(newLabel() + " :");
                }
            }
        | '!=' c = pre_arith_expression
            {
                if ($a.attr_type != $c.attr_type)
                {
                    System.out.println("Type Error: " + $a.start.getLine() + ": Type mismatch for the operator != in an expression.");
                    System.exit(0);
                }
                $attr_type = Type.BOOL;
                
                if (($a.attr_type == Type.INT) && ($c.attr_type == Type.INT))
                {
                    TextCode.add("if_icmpne " + newLabel());
                    TextCode.add("ldc 0");
                    TextCode.add("goto " + newLabel());
                    labelCount = labelCount - 2;
                    TextCode.add(newLabel() + " :");
                    TextCode.add("ldc 1");
                    TextCode.add(newLabel() + " :");
                }
                if (($a.attr_type == Type.SHORT) && ($c.attr_type == Type.SHORT))
                {
                    TextCode.add("if_icmpne " + newLabel());
                    TextCode.add("ldc 0");
                    TextCode.add("goto " + newLabel());
                    labelCount = labelCount - 2;
                    TextCode.add(newLabel() + " :");
                    TextCode.add("ldc 1");
                    TextCode.add(newLabel() + " :");
                }
                if (($a.attr_type == Type.LONG) && ($c.attr_type == Type.LONG))
                {
                    TextCode.add("if_icmpne " + newLabel());
                    TextCode.add("ldc 0");
                    TextCode.add("goto " + newLabel());
                    labelCount = labelCount - 2;
                    TextCode.add(newLabel() + " :");
                    TextCode.add("ldc 1");
                    TextCode.add(newLabel() + " :");
                }
                if (($a.attr_type == Type.FLOAT) && ($c.attr_type == Type.FLOAT))
                {
                    TextCode.add("fcmpl");
                    TextCode.add("ifne " + newLabel());
                    TextCode.add("ldc 0");
                    TextCode.add("goto " + newLabel());
                    labelCount = labelCount - 2;
                    TextCode.add(newLabel() + " :");
                    TextCode.add("ldc 1");
                    TextCode.add(newLabel() + " :");
                }
                if (($a.attr_type == Type.DOUBLE) && ($c.attr_type == Type.DOUBLE))
                {
                    TextCode.add("dcmpl");
                    TextCode.add("ifne " + newLabel());
                    TextCode.add("ldc 0");
                    TextCode.add("goto " + newLabel());
                    labelCount = labelCount - 2;
                    TextCode.add(newLabel() + " :");
                    TextCode.add("ldc 1");
                    TextCode.add(newLabel() + " :");
                }
                if (($a.attr_type == Type.CHAR) && ($c.attr_type == Type.CHAR))
                {
                    TextCode.add("if_icmpne " + newLabel());
                    TextCode.add("ldc 0");
                    TextCode.add("goto " + newLabel());
                    labelCount = labelCount - 2;
                    TextCode.add(newLabel() + " :");
                    TextCode.add("ldc 1");
                    TextCode.add(newLabel() + " :");
                }
            }
        )*
    ;

pre_arith_expression returns [Type attr_type]
    : a = arith_expression {$attr_type = $a.attr_type;}
        ( '>' b = arith_expression
            {
                if ($a.attr_type != $b.attr_type)
                {
                    System.out.println("Type Error: " + $a.start.getLine() + ": Type mismatch for the operator > in an expression.");
                    System.exit(0);
                }
                $attr_type = Type.BOOL;
                
                if (($a.attr_type == Type.INT) && ($b.attr_type == Type.INT))
                {
                    TextCode.add("if_icmpgt " + newLabel());
                    TextCode.add("ldc 0");
                    TextCode.add("goto " + newLabel());
                    labelCount = labelCount - 2;
                    TextCode.add(newLabel() + " :");
                    TextCode.add("ldc 1");
                    TextCode.add(newLabel() + " :");
                }
                if (($a.attr_type == Type.SHORT) && ($b.attr_type == Type.SHORT))
                {
                    TextCode.add("if_icmpgt " + newLabel());
                    TextCode.add("ldc 0");
                    TextCode.add("goto " + newLabel());
                    labelCount = labelCount - 2;
                    TextCode.add(newLabel() + " :");
                    TextCode.add("ldc 1");
                    TextCode.add(newLabel() + " :");
                }
                if (($a.attr_type == Type.LONG) && ($b.attr_type == Type.LONG))
                {
                    TextCode.add("if_icmpgt " + newLabel());
                    TextCode.add("ldc 0");
                    TextCode.add("goto " + newLabel());
                    labelCount = labelCount - 2;
                    TextCode.add(newLabel() + " :");
                    TextCode.add("ldc 1");
                    TextCode.add(newLabel() + " :");
                }
                if (($a.attr_type == Type.FLOAT) && ($b.attr_type == Type.FLOAT))
                {
                    TextCode.add("fcmpl");
                    TextCode.add("ifgt " + newLabel());
                    TextCode.add("ldc 0");
                    TextCode.add("goto " + newLabel());
                    labelCount = labelCount - 2;
                    TextCode.add(newLabel() + " :");
                    TextCode.add("ldc 1");
                    TextCode.add(newLabel() + " :");
                }
                if (($a.attr_type == Type.DOUBLE) && ($b.attr_type == Type.DOUBLE))
                {
                    TextCode.add("dcmpl");
                    TextCode.add("ifgt " + newLabel());
                    TextCode.add("ldc 0");
                    TextCode.add("goto " + newLabel());
                    labelCount = labelCount - 2;
                    TextCode.add(newLabel() + " :");
                    TextCode.add("ldc 1");
                    TextCode.add(newLabel() + " :");
                }
                if (($a.attr_type == Type.CHAR) && ($b.attr_type == Type.CHAR))
                {
                    TextCode.add("if_icmpgt " + newLabel());
                    TextCode.add("ldc 0");
                    TextCode.add("goto " + newLabel());
                    labelCount = labelCount - 2;
                    TextCode.add(newLabel() + " :");
                    TextCode.add("ldc 1");
                    TextCode.add(newLabel() + " :");
                }
            }
        | '<' c = arith_expression
            {
                if ($a.attr_type != $c.attr_type)
                {
                    System.out.println("Type Error: " + $a.start.getLine() + ": Type mismatch for the operator < in an expression.");
                    System.exit(0);
                }
                $attr_type = Type.BOOL;
                
                if (($a.attr_type == Type.INT) && ($c.attr_type == Type.INT))
                {
                    TextCode.add("if_icmplt " + newLabel());
                    TextCode.add("ldc 0");
                    TextCode.add("goto " + newLabel());
                    labelCount = labelCount - 2;
                    TextCode.add(newLabel() + " :");
                    TextCode.add("ldc 1");
                    TextCode.add(newLabel() + " :");
                }
                if (($a.attr_type == Type.SHORT) && ($c.attr_type == Type.SHORT))
                {
                    TextCode.add("if_icmplt " + newLabel());
                    TextCode.add("ldc 0");
                    TextCode.add("goto " + newLabel());
                    labelCount = labelCount - 2;
                    TextCode.add(newLabel() + " :");
                    TextCode.add("ldc 1");
                    TextCode.add(newLabel() + " :");
                }
                if (($a.attr_type == Type.LONG) && ($c.attr_type == Type.LONG))
                {
                    TextCode.add("if_icmplt " + newLabel());
                    TextCode.add("ldc 0");
                    TextCode.add("goto " + newLabel());
                    labelCount = labelCount - 2;
                    TextCode.add(newLabel() + " :");
                    TextCode.add("ldc 1");
                    TextCode.add(newLabel() + " :");
                }
                if (($a.attr_type == Type.FLOAT) && ($c.attr_type == Type.FLOAT))
                {
                    TextCode.add("fcmpl");
                    TextCode.add("iflt " + newLabel());
                    TextCode.add("ldc 0");
                    TextCode.add("goto " + newLabel());
                    labelCount = labelCount - 2;
                    TextCode.add(newLabel() + " :");
                    TextCode.add("ldc 1");
                    TextCode.add(newLabel() + " :");
                }
                if (($a.attr_type == Type.DOUBLE) && ($c.attr_type == Type.DOUBLE))
                {
                    TextCode.add("dcmpl");
                    TextCode.add("iflt " + newLabel());
                    TextCode.add("ldc 0");
                    TextCode.add("goto " + newLabel());
                    labelCount = labelCount - 2;
                    TextCode.add(newLabel() + " :");
                    TextCode.add("ldc 1");
                    TextCode.add(newLabel() + " :");
                }
                if (($a.attr_type == Type.CHAR) && ($c.attr_type == Type.CHAR))
                {
                    TextCode.add("if_icmplt " + newLabel());
                    TextCode.add("ldc 0");
                    TextCode.add("goto " + newLabel());
                    labelCount = labelCount - 2;
                    TextCode.add(newLabel() + " :");
                    TextCode.add("ldc 1");
                    TextCode.add(newLabel() + " :");
                }
            }
        | '>=' d = arith_expression
            {
                if ($a.attr_type != $d.attr_type)
                {
                    System.out.println("Type Error: " + $a.start.getLine() + ": Type mismatch for the operator >= in an expression.");
                    System.exit(0);
                }
                $attr_type = Type.BOOL;
                
                if (($a.attr_type == Type.INT) && ($d.attr_type == Type.INT))
                {
                    TextCode.add("if_icmpge " + newLabel());
                    TextCode.add("ldc 0");
                    TextCode.add("goto " + newLabel());
                    labelCount = labelCount - 2;
                    TextCode.add(newLabel() + " :");
                    TextCode.add("ldc 1");
                    TextCode.add(newLabel() + " :");
                }
                if (($a.attr_type == Type.SHORT) && ($d.attr_type == Type.SHORT))
                {
                    TextCode.add("if_icmpge " + newLabel());
                    TextCode.add("ldc 0");
                    TextCode.add("goto " + newLabel());
                    labelCount = labelCount - 2;
                    TextCode.add(newLabel() + " :");
                    TextCode.add("ldc 1");
                    TextCode.add(newLabel() + " :");
                }
                if (($a.attr_type == Type.LONG) && ($d.attr_type == Type.LONG))
                {
                    TextCode.add("if_icmpge " + newLabel());
                    TextCode.add("ldc 0");
                    TextCode.add("goto " + newLabel());
                    labelCount = labelCount - 2;
                    TextCode.add(newLabel() + " :");
                    TextCode.add("ldc 1");
                    TextCode.add(newLabel() + " :");
                }
                if (($a.attr_type == Type.FLOAT) && ($d.attr_type == Type.FLOAT))
                {
                    TextCode.add("fcmpl");
                    TextCode.add("ifge " + newLabel());
                    TextCode.add("ldc 0");
                    TextCode.add("goto " + newLabel());
                    labelCount = labelCount - 2;
                    TextCode.add(newLabel() + " :");
                    TextCode.add("ldc 1");
                    TextCode.add(newLabel() + " :");
                }
                if (($a.attr_type == Type.DOUBLE) && ($d.attr_type == Type.DOUBLE))
                {
                    TextCode.add("dcmpl");
                    TextCode.add("ifge " + newLabel());
                    TextCode.add("ldc 0");
                    TextCode.add("goto " + newLabel());
                    labelCount = labelCount - 2;
                    TextCode.add(newLabel() + " :");
                    TextCode.add("ldc 1");
                    TextCode.add(newLabel() + " :");
                }
                if (($a.attr_type == Type.CHAR) && ($d.attr_type == Type.CHAR))
                {
                    TextCode.add("if_icmpge " + newLabel());
                    TextCode.add("ldc 0");
                    TextCode.add("goto " + newLabel());
                    labelCount = labelCount - 2;
                    TextCode.add(newLabel() + " :");
                    TextCode.add("ldc 1");
                    TextCode.add(newLabel() + " :");
                }
            }
        | '<=' e = arith_expression
            {
                if ($a.attr_type != $e.attr_type)
                {
                    System.out.println("Type Error: " + $a.start.getLine() + ": Type mismatch for the operator <= in an expression.");
                    System.exit(0);
                }
                $attr_type = Type.BOOL;
                
                if (($a.attr_type == Type.INT) && ($e.attr_type == Type.INT))
                {
                    TextCode.add("if_icmple " + newLabel());
                    TextCode.add("ldc 0");
                    TextCode.add("goto " + newLabel());
                    labelCount = labelCount - 2;
                    TextCode.add(newLabel() + " :");
                    TextCode.add("ldc 1");
                    TextCode.add(newLabel() + " :");
                }
                if (($a.attr_type == Type.SHORT) && ($e.attr_type == Type.SHORT))
                {
                    TextCode.add("if_icmple " + newLabel());
                    TextCode.add("ldc 0");
                    TextCode.add("goto " + newLabel());
                    labelCount = labelCount - 2;
                    TextCode.add(newLabel() + " :");
                    TextCode.add("ldc 1");
                    TextCode.add(newLabel() + " :");
                }
                if (($a.attr_type == Type.LONG) && ($e.attr_type == Type.LONG))
                {
                    TextCode.add("if_icmple " + newLabel());
                    TextCode.add("ldc 0");
                    TextCode.add("goto " + newLabel());
                    labelCount = labelCount - 2;
                    TextCode.add(newLabel() + " :");
                    TextCode.add("ldc 1");
                    TextCode.add(newLabel() + " :");
                }
                if (($a.attr_type == Type.FLOAT) && ($e.attr_type == Type.FLOAT))
                {
                    TextCode.add("fcmpl");
                    TextCode.add("ifle " + newLabel());
                    TextCode.add("ldc 0");
                    TextCode.add("goto " + newLabel());
                    labelCount = labelCount - 2;
                    TextCode.add(newLabel() + " :");
                    TextCode.add("ldc 1");
                    TextCode.add(newLabel() + " :");
                }
                if (($a.attr_type == Type.DOUBLE) && ($e.attr_type == Type.DOUBLE))
                {
                    TextCode.add("dcmpl");
                    TextCode.add("ifle " + newLabel());
                    TextCode.add("ldc 0");
                    TextCode.add("goto " + newLabel());
                    labelCount = labelCount - 2;
                    TextCode.add(newLabel() + " :");
                    TextCode.add("ldc 1");
                    TextCode.add(newLabel() + " :");
                }
                if (($a.attr_type == Type.CHAR) && ($e.attr_type == Type.CHAR))
                {
                    TextCode.add("if_icmple " + newLabel());
                    TextCode.add("ldc 0");
                    TextCode.add("goto " + newLabel());
                    labelCount = labelCount - 2;
                    TextCode.add(newLabel() + " :");
                    TextCode.add("ldc 1");
                    TextCode.add(newLabel() + " :");
                }
            }
        )*
    ;

arith_expression returns [Type attr_type]
    : a = multExpr {$attr_type = $a.attr_type;}
        ( '+' b = multExpr
            {
                if ($a.attr_type != $b.attr_type)
                {
                    System.out.println("Type Error: " + $a.start.getLine() + ": Type mismatch for the operator + in an expression.");
                    System.exit(0);
                }
                
                if (($a.attr_type == Type.INT) && ($b.attr_type == Type.INT))
                    TextCode.add("iadd");
                if (($a.attr_type == Type.SHORT) && ($b.attr_type == Type.SHORT))
                    TextCode.add("iadd");
                if (($a.attr_type == Type.LONG) && ($b.attr_type == Type.LONG))
                    TextCode.add("iadd");
                if (($a.attr_type == Type.FLOAT) && ($b.attr_type == Type.FLOAT))
                    TextCode.add("fadd");
                if (($a.attr_type == Type.DOUBLE) && ($b.attr_type == Type.DOUBLE))
                    TextCode.add("dadd");
                if (($a.attr_type == Type.CHAR) && ($b.attr_type == Type.CHAR))
                    TextCode.add("iadd");
            }
        | '-' c = multExpr
            {
                if ($a.attr_type != $c.attr_type)
                {
                    System.out.println("Type Error: " + $a.start.getLine() + ": Type mismatch for the operator - in an expression.");
                    System.exit(0);
                }

                if (($a.attr_type == Type.INT) && ($c.attr_type == Type.INT))
                    TextCode.add("isub");
                if (($a.attr_type == Type.SHORT) && ($c.attr_type == Type.SHORT))
                    TextCode.add("isub");
                if (($a.attr_type == Type.LONG) && ($c.attr_type == Type.LONG))
                    TextCode.add("isub");
                if (($a.attr_type == Type.FLOAT) && ($c.attr_type == Type.FLOAT))
                    TextCode.add("fsub");
                if (($a.attr_type == Type.DOUBLE) && ($c.attr_type == Type.DOUBLE))
                    TextCode.add("dsub");
                if (($a.attr_type == Type.CHAR) && ($c.attr_type == Type.CHAR))
                    TextCode.add("isub");
            }
        )*
    ;

multExpr returns [Type attr_type]
    : a = signExpr {$attr_type = $a.attr_type;}
        ( '*' b = signExpr
            {
                if ($a.attr_type != $b.attr_type)
                {
                    System.out.println("Type Error: " + $a.start.getLine() + ": Type mismatch for the operator * in an expression.");
                    System.exit(0);
                }

                if (($a.attr_type == Type.INT) && ($b.attr_type == Type.INT))
                    TextCode.add("imul");
                if (($a.attr_type == Type.SHORT) && ($b.attr_type == Type.SHORT))
                    TextCode.add("imul");
                if (($a.attr_type == Type.LONG) && ($b.attr_type == Type.LONG))
                    TextCode.add("imul");
                if (($a.attr_type == Type.FLOAT) && ($b.attr_type == Type.FLOAT))
                    TextCode.add("fmul");
                if (($a.attr_type == Type.DOUBLE) && ($b.attr_type == Type.DOUBLE))
                    TextCode.add("dmul");
                if (($a.attr_type == Type.CHAR) && ($b.attr_type == Type.CHAR))
                    TextCode.add("imul");
            }
        | '/' c = signExpr
            {
               if ($a.attr_type != $c.attr_type)
                {
                    System.out.println("Type Error: " + $a.start.getLine() + ": Type mismatch for the operator / in an expression.");
                    System.exit(0);
                }

                if (($a.attr_type == Type.INT) && ($c.attr_type == Type.INT))
                    TextCode.add("idiv");
                if (($a.attr_type == Type.SHORT) && ($c.attr_type == Type.SHORT))
                    TextCode.add("idiv");
                if (($a.attr_type == Type.LONG) && ($c.attr_type == Type.LONG))
                    TextCode.add("idiv");
                if (($a.attr_type == Type.FLOAT) && ($c.attr_type == Type.FLOAT))
                    TextCode.add("fdiv");
                if (($a.attr_type == Type.DOUBLE) && ($c.attr_type == Type.DOUBLE))
                    TextCode.add("ddiv");
                if (($a.attr_type == Type.CHAR) && ($c.attr_type == Type.CHAR))
                    TextCode.add("idiv");
            }
        | '%' d = signExpr
            {
                if ($a.attr_type != $d.attr_type)
                {
                    System.out.println("Type Error: " + $a.start.getLine() + ": Type mismatch for the operator mod in an expression.");
                    System.exit(0);
                }

                if (($a.attr_type == Type.INT) && ($d.attr_type == Type.INT))
                    TextCode.add("irem");
                if (($a.attr_type == Type.SHORT) && ($d.attr_type == Type.SHORT))
                    TextCode.add("irem");
                if (($a.attr_type == Type.LONG) && ($d.attr_type == Type.LONG))
                    TextCode.add("irem");
                if (($a.attr_type == Type.FLOAT) && ($d.attr_type == Type.FLOAT))
                    TextCode.add("frem");
                if (($a.attr_type == Type.DOUBLE) && ($d.attr_type == Type.DOUBLE))
                    TextCode.add("drem");
                if (($a.attr_type == Type.CHAR) && ($d.attr_type == Type.CHAR))
                    TextCode.add("irem");
            }
        )*
    ;

signExpr returns [Type attr_type]
    : a = primaryExpr {$attr_type = $a.attr_type;}
	| '-' b = primaryExpr
        {
            $attr_type = $b.attr_type;
            switch ($attr_type)
            {
                case INT: 
                    TextCode.add("ineg");
                    break;
                case SHORT: 
                    TextCode.add("ineg");
                    break;
                case LONG: 
                    TextCode.add("ineg");
                    break;
                case FLOAT:
                    TextCode.add("fneg");
                    break;
                case DOUBLE: 
                    TextCode.add("dneg");
                    break;
                case CHAR:
                    TextCode.add("ineg");
                    break;
            }
        }
	;

primaryExpr returns [Type attr_type]
    : DEC_NUM
        {
            $attr_type = Type.INT;
            TextCode.add("ldc " + $DEC_NUM.text);
        }
    | FLOAT_NUM
        {
            $attr_type = Type.FLOAT;
            TextCode.add("ldc " + $FLOAT_NUM.text);
        }
    | ID
        {
            if (symtab.containsKey($ID.text))
            {
                $attr_type = (Type) ((AbstractMap.SimpleEntry) symtab.get($ID.text)).getKey();
                switch ($attr_type)
                {
                    case INT: 
				        TextCode.add("iload " + ((Integer) ((AbstractMap.SimpleEntry) symtab.get($ID.text)).getValue()).intValue());
				        break;
                    case SHORT: 
				        TextCode.add("iload " + ((Integer) ((AbstractMap.SimpleEntry) symtab.get($ID.text)).getValue()).intValue());
				        break;
                    case LONG: 
				        TextCode.add("iload " + ((Integer) ((AbstractMap.SimpleEntry) symtab.get($ID.text)).getValue()).intValue());
				        break;
				    case FLOAT:
                        TextCode.add("fload " + ((Integer) ((AbstractMap.SimpleEntry) symtab.get($ID.text)).getValue()).intValue());
				        break;
                    case DOUBLE: 
				        TextCode.add("dload " + ((Integer) ((AbstractMap.SimpleEntry) symtab.get($ID.text)).getValue()).intValue());
				        break;
				    case CHAR:
                        TextCode.add("iload " + ((Integer) ((AbstractMap.SimpleEntry) symtab.get($ID.text)).getValue()).intValue());
				        break;
                }
            }
            else
            {
                System.out.println("Type Error: " + $ID.getLine() + ": Do not exist.");
                System.exit(0);
            }
        }
    | ID '++'
        {
            if (symtab.containsKey($ID.text))
            {
                $attr_type = (Type) ((AbstractMap.SimpleEntry) symtab.get($ID.text)).getKey();
                switch ($attr_type)
                {
                    case INT: 
				        TextCode.add("iload " + ((Integer) ((AbstractMap.SimpleEntry) symtab.get($ID.text)).getValue()).intValue());
                        TextCode.add("ldc 1");
                        TextCode.add("iadd");
                        if (arith_to_assign == 1)
                            TextCode.add("istore " + ((Integer) ((AbstractMap.SimpleEntry) symtab.get($ID.text)).getValue()).intValue());
				        break;
                    case SHORT: 
				        TextCode.add("iload " + ((Integer) ((AbstractMap.SimpleEntry) symtab.get($ID.text)).getValue()).intValue());
                        TextCode.add("ldc 1");
                        TextCode.add("iadd");
                        if (arith_to_assign == 1)
                            TextCode.add("istore " + ((Integer) ((AbstractMap.SimpleEntry) symtab.get($ID.text)).getValue()).intValue());
				        break;
                    case LONG: 
				        TextCode.add("iload " + ((Integer) ((AbstractMap.SimpleEntry) symtab.get($ID.text)).getValue()).intValue());
                        TextCode.add("ldc 1");
                        TextCode.add("iadd");
                        if (arith_to_assign == 1)
                            TextCode.add("istore " + ((Integer) ((AbstractMap.SimpleEntry) symtab.get($ID.text)).getValue()).intValue());
				        break;
				    case CHAR:
				        TextCode.add("iload " + ((Integer) ((AbstractMap.SimpleEntry) symtab.get($ID.text)).getValue()).intValue());
                        TextCode.add("ldc 1");
                        TextCode.add("iadd");
                        if (arith_to_assign == 1)
                            TextCode.add("istore " + ((Integer) ((AbstractMap.SimpleEntry) symtab.get($ID.text)).getValue()).intValue());
				        break;
                    default:
                        System.out.println("TYPE ERROR");
                        System.exit(0);
                }
            }
            else
            {
                System.out.println("Type Error: " + $ID.getLine() + ": Do not exist.");
                System.exit(0);
            }
        }
    | ID '--'
        {
            if (symtab.containsKey($ID.text))
            {
                $attr_type = (Type) ((AbstractMap.SimpleEntry) symtab.get($ID.text)).getKey();
                switch ($attr_type)
                {
                    case INT: 
				        TextCode.add("iload " + ((Integer) ((AbstractMap.SimpleEntry) symtab.get($ID.text)).getValue()).intValue());
                        TextCode.add("ldc 1");
                        TextCode.add("isub");
                        if (arith_to_assign == 1)
                            TextCode.add("istore " + ((Integer) ((AbstractMap.SimpleEntry) symtab.get($ID.text)).getValue()).intValue());
				        break;
                    case SHORT: 
				        TextCode.add("iload " + ((Integer) ((AbstractMap.SimpleEntry) symtab.get($ID.text)).getValue()).intValue());
                        TextCode.add("ldc 1");
                        TextCode.add("isub");
                        if (arith_to_assign == 1)
                            TextCode.add("istore " + ((Integer) ((AbstractMap.SimpleEntry) symtab.get($ID.text)).getValue()).intValue());
				        break;
                    case LONG: 
				        TextCode.add("iload " + ((Integer) ((AbstractMap.SimpleEntry) symtab.get($ID.text)).getValue()).intValue());
                        TextCode.add("ldc 1");
                        TextCode.add("isub");
                        if (arith_to_assign == 1)
                            TextCode.add("istore " + ((Integer) ((AbstractMap.SimpleEntry) symtab.get($ID.text)).getValue()).intValue());
				        break;
				    case CHAR:
				        TextCode.add("iload " + ((Integer) ((AbstractMap.SimpleEntry) symtab.get($ID.text)).getValue()).intValue());
                        TextCode.add("ldc 1");
                        TextCode.add("isub");
                        if (arith_to_assign == 1)
                            TextCode.add("istore " + ((Integer) ((AbstractMap.SimpleEntry) symtab.get($ID.text)).getValue()).intValue());
				        break;
                    default:
                        System.out.println("TYPE ERROR");
                        System.exit(0);
                }
            }
            else
            {
                System.out.println("Type Error: " + $ID.getLine() + ": Do not exist.");
                System.exit(0);
            }
        }
    | '(' pre_logic_exprsssion ')' {$attr_type = $pre_logic_exprsssion.attr_type;}
    ;

statement
    : assign_statement
    | if_statement
    | while_statement
    | for_statement
    | switch_statement
    | return_statement
    ;

assign_statement
    : ID '=' a = pre_logic_exprsssion ';'
        {
            Type the_type;
			int the_mem;
            the_type = (Type) symtab.get($ID.text).getKey();
			the_mem = ((Integer) ((AbstractMap.SimpleEntry) symtab.get($ID.text)).getValue()).intValue();
            if (the_type != $pre_logic_exprsssion.attr_type)
            {
                System.out.println("Type error!\n");
                System.exit(0);
			}
            switch (the_type)
            {
			    case INT:
                    TextCode.add("istore " + the_mem);
                    break;
                case SHORT:
                    TextCode.add("istore " + the_mem);
                    break;
                case LONG:
                    TextCode.add("istore " + the_mem);
                    break;
			    case FLOAT:
                    TextCode.add("fstore " + the_mem);
			        break;
                case DOUBLE:
                    TextCode.add("dstore " + the_mem);
                    break;
			    case CHAR:
                    TextCode.add("istore " + the_mem);
			        break;
			}
        }
    | ID '++' ';'
        {
            Type the_type;
			int the_mem;
            the_type = (Type) symtab.get($ID.text).getKey();
			the_mem = ((Integer) ((AbstractMap.SimpleEntry) symtab.get($ID.text)).getValue()).intValue();
            switch (the_type)
            {
                case INT:
                    TextCode.add("iload " + the_mem);
                    TextCode.add("ldc 1");
                    TextCode.add("iadd");
                    TextCode.add("istore " + the_mem);
                    break;
                case SHORT:
                    TextCode.add("iload " + the_mem);
                    TextCode.add("ldc 1");
                    TextCode.add("iadd");
                    TextCode.add("istore " + the_mem);
                    break;
                case LONG:
                    TextCode.add("iload " + the_mem);
                    TextCode.add("ldc 1");
                    TextCode.add("iadd");
                    TextCode.add("istore " + the_mem);
                    break;
                case CHAR:
                    TextCode.add("iload " + the_mem);
                    TextCode.add("ldc 1");
                    TextCode.add("iadd");
                    TextCode.add("istore " + the_mem);
                    break;
                default:
                    System.out.println("TYPE ERROR");
                    System.exit(0);
            }
        }
    | ID '--' ';'
        {
            Type the_type;
			int the_mem;
            the_type = (Type) symtab.get($ID.text).getKey();
			the_mem = ((Integer) ((AbstractMap.SimpleEntry) symtab.get($ID.text)).getValue()).intValue();
            switch (the_type)
            {
                case INT:
                    TextCode.add("iload " + the_mem);
                    TextCode.add("ldc 1");
                    TextCode.add("isub");
                    TextCode.add("istore " + the_mem);
                    break;
                case SHORT:
                    TextCode.add("iload " + the_mem);
                    TextCode.add("ldc 1");
                    TextCode.add("isub");
                    TextCode.add("istore " + the_mem);
                    break;
                case LONG:
                    TextCode.add("iload " + the_mem);
                    TextCode.add("ldc 1");
                    TextCode.add("isub");
                    TextCode.add("istore " + the_mem);
                    break;
                case CHAR:  
                    TextCode.add("iload " + the_mem);
                    TextCode.add("ldc 1");
                    TextCode.add("isub");
                    TextCode.add("istore " + the_mem);
                    break;
                default:
                    System.out.println("TYPE ERROR");
                    System.exit(0);
            }
        }
    | PRINTF 
        {
            TextCode.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
        }

        '('

        LITERAL
        {
            TextCode.add("ldc " + $LITERAL.text);

            // move TextCode to tmp
            tmpTextCode.addAll(TextCode);
            TextCode = new ArrayList<String>();

            TextCode.add("anewarray java/lang/Object");
        }

        (
            ','
            {
                TextCode.add("dup");
                TextCode.add("ldc " + Integer.toString(parameter_cnt));
                parameter_cnt ++;
            }
            arith_expression
            {
                if ($arith_expression.attr_type == Type.INT)
                    TextCode.add("invokestatic java/lang/Integer.valueOf(I)Ljava/lang/Integer;");
                if ($arith_expression.attr_type == Type.SHORT)
                    TextCode.add("invokestatic java/lang/Integer.valueOf(I)Ljava/lang/Integer;");
                if ($arith_expression.attr_type == Type.LONG)
                    TextCode.add("invokestatic java/lang/Integer.valueOf(I)Ljava/lang/Integer;");
                if ($arith_expression.attr_type == Type.FLOAT)
                    TextCode.add("invokestatic java/lang/Float.valueOf(F)Ljava/lang/Float;");
                if ($arith_expression.attr_type == Type.DOUBLE)
                    TextCode.add("invokestatic java/lang/Double.valueOf(D)Ljava/lang/Double;");
                if ($arith_expression.attr_type == Type.CHAR)
                {
                    TextCode.add("i2c");
                    TextCode.add("invokestatic java/lang/Character.valueOf(C)Ljava/lang/Character;");
                }
                TextCode.add("aastore");
            }
        
        )*

        ')'
        {
            TextCode.add("invokevirtual java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;");
            TextCode.add("pop");

            // add parameter_cnt and others
            tmpTextCode.add("ldc " + Integer.toString(parameter_cnt));
            tmpTextCode.addAll(TextCode);

            TextCode = new ArrayList<String>();
            TextCode.addAll(tmpTextCode);
            tmpTextCode = new ArrayList<String>();
            parameter_cnt = 0;
        }
        ';'
    ;

if_statement
    : if_block (options{greedy=true;}: else_block)?
        {
            // finish if-else
            TextCode.add($if_block.end_label + " :");
        }
    ;

if_block returns [String end_label]
    : IF '(' pre_logic_exprsssion
            {
                if ($pre_logic_exprsssion.attr_type != Type.BOOL)
                {
                    System.out.println("Type Error: " + $pre_logic_exprsssion.start.getLine() + ": type error in IF");
                    System.exit(0);
                }
            }
         ')'
        {
            // goto else_block
            TextCode.add("ifeq " + newLabel());
        }
        block_statement
        {
            // finish if_block , goto end_label
            TextCode.add("goto " + newLabel());

            labelCount = labelCount - 2;
            
            // else_block label
            TextCode.add(newLabel() + " :");
            $end_label = newLabel();
        }
    ;

else_block
    : ELSE block_statement ;

while_statement
    : WHILE '(' 
                {
                    labelCount ++;
                    condition_label = labelCount;
                    labelCount ++;
                    end_label = labelCount;
                    TextCode.add(getLabel(condition_label) + " :");
                }
            pre_logic_exprsssion
                {
                    if ($pre_logic_exprsssion.attr_type != Type.BOOL)
                    {
                        System.out.println("Type Error: " + $pre_logic_exprsssion.start.getLine() + ": type error in WHILE");
                        System.exit(0);
                    }
                    TextCode.add("ifeq " + getLabel(end_label));
                }
            ')'
            block_statement
                {
                    TextCode.add("goto " + getLabel(condition_label));
                    TextCode.add(getLabel(end_label) + " :");
                    condition_label = -1;
                    end_label = -1;
                }
    ;

for_statement
    : FOR '('
            assign_statement
                {
                    labelCount ++;
                    condition_label = labelCount;
                    labelCount ++;
                    do_label = labelCount;
                    labelCount ++;
                    for_do_label = labelCount;
                    labelCount ++;
                    end_label = labelCount;
                    TextCode.add(getLabel(condition_label) + " :");
                }
            pre_logic_exprsssion ';'
                {
                    if ($pre_logic_exprsssion.attr_type != Type.BOOL)
                    {
                        System.out.println("Type Error: " + $pre_logic_exprsssion.start.getLine() + ": type error in FOR");
                        System.exit(0);
                    }
                    TextCode.add("ifeq " + getLabel(end_label));
                    TextCode.add("goto " + getLabel(do_label));
                    TextCode.add(getLabel(for_do_label) + " :");
                    arith_to_assign = 1;
                }
            arith_expression
                {
                    arith_to_assign = -1;
                    TextCode.add("goto " + getLabel(condition_label));
                    TextCode.add(getLabel(do_label) + " :");
                }
          ')'
          block_statement
                {
                    TextCode.add("goto " + getLabel(for_do_label));
                    TextCode.add(getLabel(end_label) + " :");
                    condition_label = -1;
                    do_label = -1;
                    end_label = -1;
                }
    ;

switch_statement
    : SWITCH '(' ID ')'
        {
            if (symtab.containsKey($ID.text))
            {
                Type the_type;
                int the_mem;
                the_type = (Type) symtab.get($ID.text).getKey();
                the_mem = ((Integer) ((AbstractMap.SimpleEntry) symtab.get($ID.text)).getValue()).intValue();
                if (the_type == Type.FLOAT || the_type == Type.DOUBLE)
                {
                    System.out.println("Type Error: " + $ID.getLine() + ": type error in SWITCH.");
                    System.exit(0);
                }
                TextCode.add("iload " + the_mem);
                labelCount ++;
                end_label = labelCount;

                // move TextCode to tmp
                tmpTextCode2.addAll(TextCode);
                TextCode = new ArrayList<String>();
            }
            else
            {
                System.out.println("Type Error: " + $ID.getLine() + ": Do not exist.");
                System.exit(0);
            }
        }
        '{' case_statement* '}'
        {
            tmpTextCode2.add("lookupswitch");
            for (Map.Entry<String,String> tmp_case : switch_tab.entrySet())
            {
                if (tmp_case.getKey().matches("default"))
                    continue;
                tmpTextCode2.add("\t" + tmp_case.getKey() + "\t:\t" + tmp_case.getValue());
            }
            for (Map.Entry<String,String> tmp_case : switch_tab.entrySet())
            {
                if (tmp_case.getKey().matches("default"))
                    tmpTextCode2.add("\t" + tmp_case.getKey() + "\t:\t" + tmp_case.getValue());
            }

            tmpTextCode2.addAll(TextCode);
            TextCode = new ArrayList<String>();
            TextCode.addAll(tmpTextCode2);
            TextCode.add(getLabel(end_label) + " :");

            tmpTextCode2 = new ArrayList<String>();
            end_label = -1;
        }
    ;

case_statement
    :   (
            CASE DEC_NUM ':'
            {
                if (!switch_tab.containsKey($DEC_NUM.text))
                {
                    TextCode.add(newLabel() + " :");
                    labelCount --;
                    switch_tab.put($DEC_NUM.text, newLabel());
                }
                else
                    System.exit(0);
            }
            assign_statement*
            BREAK ';'
            {
                TextCode.add("goto " + getLabel(end_label));
            }
            | DEFAULT ':'
            {
                if (!switch_tab.containsKey($DEFAULT.text))
                {
                    TextCode.add(newLabel() + " :");
                    labelCount --;
                    switch_tab.put($DEFAULT.text, newLabel());
                }
                else
                    System.exit(0);
            }
            assign_statement*
            BREAK ';'
            {
                TextCode.add("goto " + getLabel(end_label));
            }
        )
    ;

return_statement
    : RETURN arith_expression ';'
        {
            TextCode.add("return");
        }
    ;

block_statement
    : assign_statement
    | '{' assign_statement* '}'
    ;



/*-------------------------------*/
/*   description of the tokens   */
/*-------------------------------*/

/*----------------------*/
/*      Functions       */
/*----------------------*/
MAIN   : 'main';
PRINTF : 'printf';
SCANF  : 'scanf';
STRLEN : 'strlen';


/*----------------------*/
/*   Reserved Keywords  */
/*----------------------*/
INT_TYPE   : 'int';
SHORT_TYPE : 'short';
LONG_TYPE  : 'long';
FLOAT_TYPE : 'float';
DOUBLE_TYPE: 'double';
CHAR_TYPE  : 'char';
VOID_TYPE  : 'void';
IF     : 'if';
ELSE   : 'else';
FOR    : 'for';
WHILE  : 'while';
BREAK  : 'break';
RETURN : 'return';
SWITCH  : 'switch';
CASE    : 'case';
DEFAULT : 'default';
SIZEOF  : 'sizeof';
INCLUDE : 'include';


/*----------------------*/
/*       Operators      */
/*----------------------*/
ASSIGN_OP : '=';
PLUS_OP   : '+';
MINUS_OP  : '-';
MOD_OP    : '%';
MULTIPLIED_OP : '*';
DIVIDED_OP    : '/';
GREATER_THAN  : '>';
LESS_THAN     : '<';
AND_LOGICAL   : '&&';
OR_LOGICAL    : '||';


/*----------------------*/
/*  Compound Operators  */
/*----------------------*/
EQ_OP : '==';
NE_OP : '!=';
LT_OP : '<=';
GT_OP : '>=';
PP_OP : '++';
MM_OP : '--'; 


/*----------------------*/
/*       Symbols        */
/*----------------------*/
WHITE_SPACE : (' '|'\r'|'\t')+ {$channel=HIDDEN;};
NEW_LINE    : '\n' {$channel=HIDDEN;};

SEMICOLON : ';';
COLON     : ':';
COMMA     : ',';

R_PAREN   : ')';
L_PAREN   : '(';
R_BRACE   : '}';
L_BRACE   : '{';
R_BRACKET : ']';
L_BRACKET : '[';


/*----------------------*/
/*       Comments       */
/*----------------------*/
COMMENT_1 : '//'(.)*'\n' {$channel=HIDDEN;};
COMMENT_2 : '/*' (options{greedy=false;}: .)* '*/' {$channel=HIDDEN;};


/*----------------------*/
/*        Others        */
/*----------------------*/
ID : (LETTER)(LETTER | DIGIT)*;
DEC_NUM   : ('0' | ('1'..'9')(DIGIT)*);
FLOAT_NUM : (DIGIT)+ '.' (DIGIT)+;
LITERAL : '"'(.)*'"';


/*----------------------*/
/*       fragment       */
/*----------------------*/
fragment LETTER : 'a'..'z' | 'A'..'Z' | '_';
fragment DIGIT  : '0'..'9';
