grammar myChecker;

options {
   language = Java;
}

@header {
    // import packages here.
    import java.util.HashMap;
}

@members {
    boolean TRACEON = false;
    HashMap<String,Integer> symtab = new HashMap<String,Integer>();

	/*
    public enum TypeInfo {
        Integer,
		Short,
		Long,
		Float,
		Double,
		Char,
		Unknown,
		No_Exist,
		Error
    }
    */

    /* attr_type:
       1 => integer,
       2 => short,
	   3 => long,
	   4 => float,
	   5 => double,
	   6 => char,
	   7 => boolean,
       -1 => do not exist,
       -2 => error
     */	   
}

program
	: header_file prog ;

header_file
	: '#' INCLUDE '<' ID '.h' '>' header_file
    | ;

prog
	: VOID_TYPE MAIN '(' ')' '{' declarations statements '}' {if (TRACEON) System.out.println("VOID MAIN () {declarations statements}");}
    | INT_TYPE MAIN '(' ')' '{' declarations statements '}'  {if (TRACEON) System.out.println("INT MAIN () {declarations statements}");}
	;

declarations
	: type ID ';'
		{
			if (TRACEON) System.out.println("declarations: type ID : declarations");

			if (symtab.containsKey($ID.text))
			{
				System.out.println("Type Error: " + $ID.getLine() + ": Redeclared identifier.");
			}
			else
			{
				symtab.put($ID.text, $type.attr_type);
			}
		}
	declarations

	| type ID '=' pre_logic_exprsssion ';'
		{
			if (TRACEON) System.out.println("declarations: type ID : declarations");

			if (symtab.containsKey($ID.text))
			{
				System.out.println("Type Error: " + $ID.getLine() + ": Redeclared identifier.");
			}
			else
			{
				symtab.put($ID.text, $type.attr_type);
			}

			if ($type.attr_type != $pre_logic_exprsssion.attr_type)
			{
				System.out.println("Type Error: " + $ID.getLine() + ": Type mismatch for the two silde operands in an assignment statement.");
			}
		}
	declarations
	
	| type ID '[' DEC_NUM ']' ';' declarations {if (TRACEON) System.out.println("declarations: type ID[INT] : declarations");}
    | {if (TRACEON) System.out.println("declarations: ");}
	;

type returns [int attr_type]
	: INT_TYPE {if (TRACEON) System.out.println("type: INT");  $attr_type = 1;}
	| SHORT_TYPE {if (TRACEON) System.out.println("type: SHORT");  $attr_type = 2;}
	| LONG_TYPE {if (TRACEON) System.out.println("type: LONG");  $attr_type = 3;}
	| FLOAT_TYPE {if (TRACEON) System.out.println("type: FLOAT");  $attr_type = 4;}
	| DOUBLE_TYPE {if (TRACEON) System.out.println("type: DOUBLE");  $attr_type = 5;}
	| CHAR_TYPE {if (TRACEON) System.out.println("type: CHAR");  $attr_type = 6;}
	;

statements
	: statement statements
	| ;

pre_logic_exprsssion returns [int attr_type]
	: a = pre_logic_2_exprsssion {$attr_type = $a.attr_type;}
		( '||' b = pre_logic_2_exprsssion
		  	{
				if ($a.attr_type != $b.attr_type)
				{
					System.out.println("Type Error: " + $a.start.getLine() + ": Type mismatch for the operator || in an expression.");
					$attr_type = -2;
				}
				else
				{
					$attr_type = 7;
				}
			}
		)*
	;

pre_logic_2_exprsssion returns [int attr_type]
	: a = pre_compare_exprsssion {$attr_type = $a.attr_type;}
		( '&&' b = pre_compare_exprsssion
			{
				if ($a.attr_type != $b.attr_type)
				{
					System.out.println("Type Error: " + $a.start.getLine() + ": Type mismatch for the operator && in an expression.");
					$attr_type = -2;	
				}
				else
				{
					$attr_type = 7;
				}
			}
		)*
	;

pre_compare_exprsssion returns [int attr_type]
	: a = pre_arith_expression {$attr_type = $a.attr_type;}
		( '==' b = pre_arith_expression
			{
				if ($a.attr_type != $b.attr_type)
				{
					System.out.println("Type Error: " + $a.start.getLine() + ": Type mismatch for the operator == in an expression.");
					$attr_type = -2;	
				}
				else
				{
					$attr_type = 7;
				}
			}
		| '!=' c = pre_arith_expression
			{
				if ($a.attr_type != $c.attr_type)
				{
					System.out.println("Type Error: " + $a.start.getLine() + ": Type mismatch for the operator != in an expression.");
					$attr_type = -2;	
				}
				else
				{
					$attr_type = 7;
				}
			}
		)*
	;

pre_arith_expression returns [int attr_type]
	: a = arith_expression {$attr_type = $a.attr_type;}
		( '>' b = arith_expression
			{
				if ($a.attr_type != $b.attr_type)
				{
					System.out.println("Type Error: " + $a.start.getLine() + ": Type mismatch for the operator > in an expression.");
					$attr_type = -2;	
				}
				else
				{
					$attr_type = 7;
				}
			}
		| '<' c = arith_expression
			{
				if ($a.attr_type != $c.attr_type)
				{
					System.out.println("Type Error: " + $a.start.getLine() + ": Type mismatch for the operator < in an expression.");
					$attr_type = -2;	
				}
				else
				{
					$attr_type = 7;
				}
			}
		| '>=' d = arith_expression
			{
				if ($a.attr_type != $d.attr_type)
				{
					System.out.println("Type Error: " + $a.start.getLine() + ": Type mismatch for the operator >= in an expression.");
					$attr_type = -2;	
				}
				else
				{
					$attr_type = 7;
				}
			}
		| '<=' e = arith_expression
			{
				if ($a.attr_type != $e.attr_type)
				{
					System.out.println("Type Error: " + $a.start.getLine() + ": Type mismatch for the operator <= in an expression.");
					$attr_type = -2;	
				}
				else
				{
					$attr_type = 7;
				}
			}
		)*
	;

arith_expression returns [int attr_type]
	: a = multExpr {$attr_type = $a.attr_type;}
		( '+' b = multExpr
			{
				if ($a.attr_type != $b.attr_type)
				{
					System.out.println("Type Error: " + $a.start.getLine() + ": Type mismatch for the operator + in an expression.");
					$attr_type = -2;	
				}
			}
		| '-' c = multExpr
			{
				if ($a.attr_type != $c.attr_type)
				{
					System.out.println("Type Error: " + $a.start.getLine() + ": Type mismatch for the operator - in an expression.");
					$attr_type = -2;	
				}
			}
		)*
	;

multExpr returns [int attr_type]
	: a = signExpr {$attr_type = $a.attr_type;}
		( '*' b = signExpr
			{
				if ($a.attr_type != $b.attr_type)
				{
					System.out.println("Type Error: " + $a.start.getLine() + ": Type mismatch for the operator * in an expression.");
					$attr_type = -2;	
				}
			}
		| '/' c = signExpr
			{
				if ($a.attr_type != $c.attr_type)
				{
					System.out.println("Type Error: " + $a.start.getLine() + ": Type mismatch for the operator / in an expression.");
					$attr_type = -2;	
				}
			}
		| '%' d = signExpr
			{
				if ($a.attr_type != $d.attr_type)
				{
					System.out.println("Type Error: " + $a.start.getLine() + ": Type mismatch for the operator mod in an expression.");
					$attr_type = -2;	
				}
			}
		)*
	;

signExpr returns [int attr_type]
	: a = primaryExpr {$attr_type = $a.attr_type;}
	| '-' b = primaryExpr {$attr_type = $b.attr_type;}
	;

primaryExpr returns [int attr_type]
	: DEC_NUM {$attr_type = 1;}
	| DEC_NUM '++' {$attr_type = 1;}
	| DEC_NUM '--' {$attr_type = 1;}
	| '++' DEC_NUM {$attr_type = 1;}
	| '--' DEC_NUM {$attr_type = 1;}
	| FLOAT_NUM {$attr_type = 4;}
	| ID
		{
			if (symtab.containsKey($ID.text))
			{
				$attr_type = symtab.get($ID.text);
			}
			else
			{
				System.out.println("Type Error: " + $ID.getLine() + ": Do not exist.");
				$attr_type = -1;
				return $attr_type;
			}
		}
	| ID '++'
		{
			if (symtab.containsKey($ID.text))
			{
				$attr_type = symtab.get($ID.text);
			}
			else
			{
				System.out.println("Type Error: " + $ID.getLine() + ": Do not exist.");
				$attr_type = -1;
				return $attr_type;
			}

			if ($attr_type != 1)
			{
				System.out.println("Type Error: " + $ID.getLine() + ": Type mismatch for the operator ++ in an expression.");
				$attr_type = -2;
			}
		}
	| ID '--'
		{
			if (symtab.containsKey($ID.text))
			{
				$attr_type = symtab.get($ID.text);
			}
			else
			{
				System.out.println("Type Error: " + $ID.getLine() + ": Do not exist.");
				$attr_type = -1;
				return $attr_type;
			}

			if ($attr_type != 1)
			{
				System.out.println("Type Error: " + $ID.getLine() + ": Type mismatch for the operator -- in an expression.");
				$attr_type = -2;
			}
		}
	| '++' ID
		{
			if (symtab.containsKey($ID.text))
			{
				$attr_type = symtab.get($ID.text);
			}
			else
			{
				System.out.println("Type Error: " + $ID.getLine() + ": Do not exist.");
				$attr_type = -1;
				return $attr_type;
			}

			if ($attr_type != 1)
			{
				System.out.println("Type Error: " + $ID.getLine() + ": Type mismatch for the operator ++ in an expression.");
				$attr_type = -2;
			}
		}
	| '--' ID
		{
			if (symtab.containsKey($ID.text))
			{
				$attr_type = symtab.get($ID.text);
			}
			else
			{
				System.out.println("Type Error: " + $ID.getLine() + ": Do not exist.");
				$attr_type = -1;
				return $attr_type;
			}

			if ($attr_type != 1)
			{
				System.out.println("Type Error: " + $ID.getLine() + ": Type mismatch for the operator -- in an expression.");
				$attr_type = -2;
			}
		}
	| '(' pre_logic_exprsssion ')' {$attr_type = $pre_logic_exprsssion.attr_type;}
	| SIZEOF '(' ID ')'
		{
			if (symtab.containsKey($ID.text))
			{
				$attr_type = 1;
			}
			else
			{
				System.out.println("Type Error: " + $ID.getLine() + ": Do not exist.");
				$attr_type = -1;
				return $attr_type;
			}
		}
	;

statement returns [int attr_type]
	: ID '=' a = pre_logic_exprsssion ';'
		{
			if (symtab.containsKey($ID.text))
			{
				$attr_type = symtab.get($ID.text);
			}
			else
			{
				System.out.println("Type Error: " + $ID.getLine() + ": Do not exist.");
				$attr_type = -1;
				return $attr_type;
			}

			if ($attr_type != $a.attr_type)
			{
				System.out.println("Type Error: " + $a.start.getLine() + ": Type mismatch for the two silde operands in an assignment statement.");
				$attr_type = -2;
			}
		}
	| PRINTF '(' LITERAL (',' pre_logic_exprsssion)* ')' ';'
	| SCANF '(' LITERAL (',' ('&')? pre_logic_exprsssion)* ')' ';'
	| x = ID '=' STRLEN '(' (LITERAL | ID) ')' ';'
		{
			if (symtab.containsKey($x.text))
			{
				$attr_type = symtab.get($x.text);
			}
			else
			{
				System.out.println("Type Error: " + $x.getLine() + ": Do not exist.");
				$attr_type = -1;
				return $attr_type;
			}

			if ($attr_type != 1)
			{
				System.out.println("Type Error: " + $x.getLine() + ": Type mismatch for the two silde operands in an assignment statement in STRLEN.");
				$attr_type = -2;
			}
		}
	| IF '(' b = pre_logic_exprsssion ')' if_statements (options{greedy=true;}: (ELSE if_statements))?
		{
			if ($b.attr_type != 7)
			{
				System.out.println("Type Error: " + $IF.getLine() +  ": Type mismatch for the logical expression in IF.");
			}
		}
	| FOR '(' y = ID '=' z = pre_logic_exprsssion ';' c = pre_logic_exprsssion ';' arith_expression ')' if_statements
		{
			if ($c.attr_type != 7)
			{
				System.out.println("Type Error: " + $FOR.getLine() +  ": Type mismatch for the logical expression in FOR.");
			}

			if (symtab.containsKey($y.text))
			{
				$attr_type = symtab.get($y.text);
			}
			else
			{
				System.out.println("Type Error: " + $y.getLine() + ": Do not exist.");
				$attr_type = -1;
				return $attr_type;
			}

			if ($attr_type != $z.attr_type)
			{
				System.out.println("Type Error: " + $y.getLine() + ": Type mismatch for the two silde operands in an assignment statement in FOR.");
				$attr_type = -2;
			}
		}
	| WHILE '(' d = pre_logic_exprsssion ')' if_statements
		{
			if ($d.attr_type != 7)
			{
				System.out.println("Type Error: " + $WHILE.getLine() +  ": Type mismatch for the logical expression in WHILE.");
			}
		}
	| SWITCH '(' pre_logic_exprsssion ')' '{' (CASE DEC_NUM ':' statements BREAK ';')* DEFAULT ':' statements (BREAK ';')? '}'
	| ID '++' ';'
		{
			if (symtab.containsKey($ID.text))
			{
				$attr_type = symtab.get($ID.text);
			}
			else
			{
				System.out.println("Type Error: " + $ID.getLine() + ": Do not exist.");
				$attr_type = -1;
				return $attr_type;
			}

			if ($attr_type != 1)
			{
				System.out.println("Type Error: " + $ID.getLine() + ": Type mismatch for the operator ++ in an expression.");
				$attr_type = -2;
			}
		}
	| ID '--' ';'
		{
			if (symtab.containsKey($ID.text))
			{
				$attr_type = symtab.get($ID.text);
			}
			else
			{
				System.out.println("Type Error: " + $ID.getLine() + ": Do not exist.");
				$attr_type = -1;
				return $attr_type;
			}

			if ($attr_type != 1)
			{
				System.out.println("Type Error: " + $ID.getLine() + ": Type mismatch for the operator -- in an expression.");
				$attr_type = -2;
			}
		}
    | '++' ID ';'
		{
			if (symtab.containsKey($ID.text))
			{
				$attr_type = symtab.get($ID.text);
			}
			else
			{
				System.out.println("Type Error: " + $ID.getLine() + ": Do not exist.");
				$attr_type = -1;
				return $attr_type;
			}

			if ($attr_type != 1)
			{
				System.out.println("Type Error: " + $ID.getLine() + ": Type mismatch for the operator ++ in an expression.");
				$attr_type = -2;
			}
		}
    | '--' ID ';'
		{
			if (symtab.containsKey($ID.text))
			{
				$attr_type = symtab.get($ID.text);
			}
			else
			{
				System.out.println("Type Error: " + $ID.getLine() + ": Do not exist.");
				$attr_type = -1;
				return $attr_type;
			}

			if ($attr_type != 1)
			{
				System.out.println("Type Error: " + $ID.getLine() + ": Type mismatch for the operator -- in an expression.");
				$attr_type = -2;
			}
		}
	| RETURN pre_logic_exprsssion ';'
	;

if_statements
	: statement
	| '{' statements '}'
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
