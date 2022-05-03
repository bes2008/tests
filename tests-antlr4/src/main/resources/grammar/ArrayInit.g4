grammar ArrayInit;
import basic;

expr : '{' value (',' value)* '}' ;

value : expr | INT;

