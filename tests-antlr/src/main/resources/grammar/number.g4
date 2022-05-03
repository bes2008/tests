grammar number;

DIGIT: [0-9];
INT: DIGIT+;
FLOAT: ('0.'|'.')INT;
DOUBLE: FLOAT
    | INT'.'INT
    ;