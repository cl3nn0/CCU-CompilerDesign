grammar myC_hw2;

options {
   language = Java;
}

@header {
    // import packages here.
}

@members {
    boolean TRACEON = true;
}

program:VOID_TYPE MAIN L_PAREN R_PAREN L_BRACE declarations statements R_BRACE {if (TRACEON) System.out.println("VOID MAIN () {declarations statements}");}
    |   INT_TYPE MAIN L_PAREN R_PAREN L_BRACE declarations statements R_BRACE  {if (TRACEON) System.out.println("INT MAIN () {declarations statements}");};

declarations: type ID SEMICOLON declarations {if (TRACEON) System.out.println("declarations: type ID : declarations");}
            | type ID ASSIGN_OP arith_expression SEMICOLON declarations {if (TRACEON) System.out.println("declarations: type ID = digit : declarations");}
            | type ID L_BRACKET DEC_NUM R_BRACKET SEMICOLON declarations {if (TRACEON) System.out.println("declarations: type ID[array_size] : declarations");}
            | {if (TRACEON) System.out.println("declarations: ");};

type: INT_TYPE {if (TRACEON) System.out.println("type: INT");}
    | SHORT_TYPE {if (TRACEON) System.out.println("type: SHORT");}
    | LONG_TYPE {if (TRACEON) System.out.println("type: LONG");}
    | FLOAT_TYPE {if (TRACEON) System.out.println("type: FLOAT");}
    | DOUBLE_TYPE {if (TRACEON) System.out.println("type: DOUBLE");}
    | CHAR_TYPE {if (TRACEON) System.out.println("type: CHAR");};

statements:statement statements | ;

pre_logic_exprsssion: pre_arith_expression (NOT_LOGICAL pre_arith_expression | AND_LOGICAL pre_arith_expression | OR_LOGICAL pre_arith_expression)*;

pre_arith_expression: arith_expression (GREATER_THAN arith_expression | LESS_THAN arith_expression | EQ_OP arith_expression | LT_OP arith_expression | GT_OP arith_expression | NE_OP arith_expression)*;

arith_expression: multExpr (PLUS_OP multExpr | MINUS_OP multExpr | MOD_OP multExpr | XOR_OP multExpr)*;

multExpr: signExpr (MULTIPLIED_OP signExpr | DIVIDED_OP signExpr)*;

signExpr: primaryExpr | MINUS_OP primaryExpr;
		  
primaryExpr: DEC_NUM
           | DEC_NUM PP_OP
           | DEC_NUM MM_OP
           | FLOAT_NUM
           | ID
           | ID PP_OP
           | ID MM_OP
           | L_PAREN pre_arith_expression R_PAREN
           | SIZEOF L_PAREN ID R_PAREN ;

statement: ID ASSIGN_OP pre_arith_expression SEMICOLON
         | PRINTF L_PAREN LITERAL (COMMA pre_arith_expression)* R_PAREN SEMICOLON {if (TRACEON) System.out.println("function: printf");}
         | SCANF L_PAREN LITERAL (COMMA ('&')? pre_arith_expression)* R_PAREN SEMICOLON {if (TRACEON) System.out.println("function: scanf");}
         | STRCPY L_PAREN ID COMMA (LITERAL|ID) R_PAREN SEMICOLON {if (TRACEON) System.out.println("function: strcpy");}
         | ID ASSIGN_OP STRLEN L_PAREN (LITERAL|ID) R_PAREN SEMICOLON {if (TRACEON) System.out.println("function: strlen");}
         | IF L_PAREN pre_logic_exprsssion R_PAREN if_statements (options{greedy=true;}: (ELSE if_statements))?
         | FOR L_PAREN ID ASSIGN_OP arith_expression SEMICOLON pre_arith_expression SEMICOLON arith_expression R_PAREN if_statements {if (TRACEON) System.out.println("for loop");}
         | WHILE L_PAREN pre_logic_exprsssion R_PAREN if_statements {if (TRACEON) System.out.println("while loop");}
         | SWITCH L_PAREN pre_logic_exprsssion R_PAREN L_BRACE (CASE DEC_NUM COLON statements BREAK SEMICOLON)* DEFAULT COLON statements (BREAK SEMICOLON)? R_BRACE {if (TRACEON) System.out.println("switch case");}
         | RETURN pre_logic_exprsssion SEMICOLON
		 ;

if_statements: statement
            | L_BRACE statements R_BRACE
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
STRCPY : 'strcpy';
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
CONTINUE : 'continue';
RETURN : 'return';
SWITCH  : 'switch';
CASE    : 'case';
DEFAULT : 'default';
SIZEOF  : 'sizeof';


/*----------------------*/
/*       Operators      */
/*----------------------*/
ASSIGN_OP : '=';
PLUS_OP   : '+';
MINUS_OP  : '-';
MOD_OP    : '%';
XOR_OP    : '^';
MULTIPLIED_OP : '*';
DIVIDED_OP    : '/';
GREATER_THAN  : '>';
LESS_THAN     : '<';
AND_LOGICAL   : '&&';
OR_LOGICAL    : '||';
NOT_LOGICAL   : '!';


/*----------------------*/
/*  Compound Operators  */
/*----------------------*/
EQ_OP : '==';
LT_OP : '<=';
GT_OP : '>=';
NE_OP : '!=';
PP_OP : '++';
MM_OP : '--'; 
RSHIFT_OP : '<<';
LSHIFT_OP : '>>';


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
