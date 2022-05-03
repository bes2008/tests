grammar number;

fragment INT: '0' | [1-9][0-9]*; // no leading zeros
fragment SIC: [Ee][+\-]?INT;
NUMBER
    : '-'? INT
    | '-'? INT SIC
    | '-'? INT '.' INT SIC?
    ;
