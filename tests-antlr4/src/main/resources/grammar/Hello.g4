grammar Hello;

import basic, operation;

program: statement+ ;
statement: expr NEWLINE
    | ID '=' expr NEWLINE
    | NEWLINE
    ;

expr: ID
    | INT
    | '(' expr ')'
    | expr UNARY_OPERATION
    | expr BINARY_OPERATION expr
    ;


