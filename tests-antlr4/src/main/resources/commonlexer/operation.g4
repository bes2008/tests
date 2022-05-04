grammar operation;

// 算术运算符
DADD: '++';
DSUB: '--';
UNARY_ARITHMETIC: (DADD|DSUB);

MUL: '*';
DIV: '/';
ADD: '+';
SUB: '-';
BINARY_ARITHMETIC: (MUL | DIV | ADD | SUB);

// 比较运算符
GT: '>';
GE: '>=';
LT: '<';
LE: '<=';
EQ: '=';
NE: ('!=' | '<>');
BINARY_COMPARISION: (GT|GE|LT|LE|EQ|NE);

// 逻辑运算符
AND0: [Aa][Nn][Dd]; // and
AND: (AND0 | '&&');
OR0: [Oo][Rr]; // or
OR: (OR0 | '|');
NOT0: [Nn][Oo][Tt]; // not
NOT: (NOT0 | '!');

UNARY_LOGIC: NOT;
BINARY_LOGIC: (AND | OR);

UNARY_OPERATION: (UNARY_LOGIC | UNARY_ARITHMETIC);
BINARY_OPERATION: ( BINARY_LOGIC |BINARY_COMPARISION| BINARY_ARITHMETIC);

