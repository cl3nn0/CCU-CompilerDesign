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

program:VOID_TYPE MAIN '(' ')' '{' declarations statements '}' {if (TRACEON) System.out.println("VOID MAIN () {declarations statements}");}
    |   INT_TYPE MAIN '(' ')' '{' declarations statements '}'  {if (TRACEON) System.out.println("INT MAIN () {declarations statements}");};

declarations: type ID ';' declarations {if (TRACEON) System.out.println("declarations: type ID : declarations");}
            | type ID '=' arith_expression ';' declarations {if (TRACEON) System.out.println("declarations: type ID = digit : declarations");}
            | type ID '[' DEC_NUM ']' ';' declarations {if (TRACEON) System.out.println("declarations: type ID[array_size] : declarations");}
            | {if (TRACEON) System.out.println("declarations: ");};

type: INT_TYPE {if (TRACEON) System.out.println("type: INT");}
    | SHORT_TYPE {if (TRACEON) System.out.println("type: SHORT");}
    | LONG_TYPE {if (TRACEON) System.out.println("type: LONG");}
    | FLOAT_TYPE {if (TRACEON) System.out.println("type: FLOAT");}
    | DOUBLE_TYPE {if (TRACEON) System.out.println("type: DOUBLE");}
    | CHAR_TYPE {if (TRACEON) System.out.println("type: CHAR");};

statements:statement statements | ;

pre_logic_exprsssion: pre_arith_expression ('!' pre_arith_expression | '&&' pre_arith_expression | '||' pre_arith_expression)*;

pre_arith_expression: arith_expression ('>' arith_expression | '<' arith_expression | '==' arith_expression | '<=' arith_expression | '>=' arith_expression | '!=' arith_expression)*;

arith_expression: multExpr ('+' multExpr | '-' multExpr | '%' multExpr | '^' multExpr)*;

multExpr: signExpr ('*' signExpr | '/' signExpr)*;

signExpr: primaryExpr | '-' primaryExpr;
		  
primaryExpr: DEC_NUM
           | DEC_NUM '++'
           | DEC_NUM '--'
           | FLOAT_NUM
           | ID
           | ID '++'
           | ID '--'
           | '(' pre_arith_expression ')'
           | SIZEOF '(' ID ')' ;

statement: ID '=' pre_arith_expression ';'
         | PRINTF '(' LITERAL (',' pre_arith_expression)* ')' ';' {if (TRACEON) System.out.println("function: printf");}
         | SCANF '(' LITERAL (',' ('&')? pre_arith_expression)* ')' ';' {if (TRACEON) System.out.println("function: scanf");}
         | STRCPY '(' ID ',' (LITERAL|ID) ')' ';' {if (TRACEON) System.out.println("function: strcpy");}
         | ID '=' STRLEN '(' (LITERAL|ID) ')' ';' {if (TRACEON) System.out.println("function: strlen");}
         | IF '(' pre_logic_exprsssion ')' if_statements (options{greedy=true;}: (ELSE if_statements))?
         | FOR '(' ID '=' arith_expression ';' pre_arith_expression ';' arith_expression ')' if_statements {if (TRACEON) System.out.println("for loop");}
         | WHILE '(' pre_logic_exprsssion ')' if_statements {if (TRACEON) System.out.println("while loop");}
         | SWITCH '(' pre_logic_exprsssion ')' '{' (CASE DEC_NUM ':' statements BREAK ';')* DEFAULT ':' statements (BREAK ';')? '}' {if (TRACEON) System.out.println("switch case");}
         | RETURN pre_logic_exprsssion ';'
		 ;

if_statements: statement
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
