grammar Json;
import basic, number, boolean;

STRING_START: '"';
STRING_END: STRING_START;

// 字符串
fragment HEX_CHAR: [0-9A-Fa-f];
fragment UNICODE: '\\u' HEX_CHAR HEX_CHAR HEX_CHAR HEX_CHAR;
fragment ESCAPE_CHAR
    : '\\"'
    | '\\'
    | '\\/'
    | '\b'
    | '\f'
    | '\n'
    | '\r'
    | '\t'
    ;

STRING: STRING_START (ESCAPE_CHAR | UNICODE | ~["\\])* STRING_END;

// 空
NULL: 'null';

value
    : object
    | array
    | STRING
    | NUMBER
    | BOOL
    | NULL
    ;


pair: STRING ':' value;

// 对象
OBJ_START: '{';
OBJ_END: '}';
object
    : OBJ_START OBJ_END // empty object
    | OBJ_START pair (',' pair)* OBJ_END
    ;

// 数组
ARRAY_START: '[';
ARRAY_END: ']';
array
    : ARRAY_START ARRAY_END // []
    | ARRAY_START value (',' value ) * ARRAY_END
    ;

json
    : object
    | array
    ;

