lexer grammar mylexer;

options {
  language = Java;
}

/*----------------------*/
/*      Functions       */
/*----------------------*/
MAIN   : 'main';
PRINTF : 'printf';
SCANF  : 'scanf';
STRCPY : 'strcpy';
STRLEN : 'strlen';
STRCAT : 'strcat';
STRCMP : 'strcmp';


/*----------------------*/
/*   Reserved Keywords  */
/*----------------------*/
INT_TYPE   : 'int';
LONG_TYPE  : 'long';
SHORT_TYPE : 'short';
FLOAT_TYPE : 'float';
DOUBLE_TYPE: 'double';
CHAR_TYPE  : 'char';
VOID_TYPE  : 'void';
STRUCT_TYPE: 'struct';

RETURN : 'return';
WHILE  : 'while';
FOR    : 'for';
IF     : 'if';
ELSE   : 'else';
BREAK  : 'break';
CONTINUE : 'continue';

INCLUDE : 'include';
SWITCH  : 'switch';
CASE    : 'case';
CONST   : 'const';
STATIC  : 'static';
VOLATILE: 'volatile';
DO      : 'do';
GOTO    : 'goto';
SIZEOF  : 'sizeof';
TYPEDEF : 'typedef';


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
WHITE_SPACE : (' '|'\r'|'\t')+;
NEW_LINE    : '\n';

SEMICOLON : ';';
COLON     : ':';
COMMA     : ',';
HASHTAG   : '#';

R_PAREN   : ')';
L_PAREN   : '(';
R_BRACE   : '}';
L_BRACE   : '{';
R_BRACKET : ']';
L_BRACKET : '[';


/*----------------------*/
/*       Comments       */
/*----------------------*/
COMMENT_1 : '//'(.)*'\n';
COMMENT_2 : '/*' (options{greedy=false;}: .)* '*/';


/*----------------------*/
/*        Others        */
/*----------------------*/
ID : (LETTER)(LETTER | DIGIT)*;

DEC_NUM   : ('0' | ('1'..'9')(DIGIT)*);
FLOAT_NUM : FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3;

LITERAL : '"'(.)*'"';

HEADER_FILE : (LETTER)(LETTER | DIGIT)*(HEADER);


/*----------------------*/
/*       fragment       */
/*----------------------*/
fragment LETTER : 'a'..'z' | 'A'..'Z' | '_';
fragment DIGIT  : '0'..'9';

fragment FLOAT_NUM1 : (DIGIT)+'.'(DIGIT)*;
fragment FLOAT_NUM2 : '.'(DIGIT)+;
fragment FLOAT_NUM3 : (DIGIT)+;
fragment HEADER     : '.h';
