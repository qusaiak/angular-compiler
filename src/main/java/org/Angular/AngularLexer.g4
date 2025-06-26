lexer grammar AngularLexer;

//////////////////////////////////////////////////////////////////
// الكلمات المفتاحية (Keywords)
IMPORT: 'import';
EXPORT: 'export';
FROM: 'from';
AS: 'as';
DEFAULT_CASE: 'default';
SELECTOR: 'selector';
TEMPLATE_URL: 'templateUrl';
TEMPLATE: 'template';
DECLERATIONS:'declerations';
IMPORTS:'imports';
CLASS: 'class';
EXTENDS: 'extends';
IMPLEMENTS: 'implements';
CONSTRUCTOR: 'constructor';
FUNCTION: 'function';
RETURN: 'return';
BREAK: 'break';
IF: 'if';
ELSE: 'else';
FOR: 'for';
WHILE: 'while';
DO: 'do';
SWITCH: 'switch';
CASE: 'case';
THIS: 'this';

VAR: 'var';
LET: 'let';
CONST: 'const';

PUBLIC: 'public';
PRIVATE: 'private';
PROTECTED: 'protected';

NULL: 'null';
UNDEFINED: 'undefined';

CONSOLE: 'console';
LOG: 'log';
IN: 'in';
ASYNC: 'async';
ARROW: '=>';

//////////////////////////////////////////////////////////////////
// Angular Decorators
COMPONENT: 'Component';
DIRECTIVE: 'Directive';
PIPE: 'Pipe';
INJECTABLE: 'Injectable';
INPUT: 'Input';
OUTPUT: 'Output';
HOST_LISTENER: 'HostListener';
NG_MODULE: 'NgModule';
VIEW_CHILD: 'ViewChild';
ON_INIT: 'OnInit';

//////////////////////////////////////////////////////////////////
// Angular structural directive names
NG_IF: 'ngIf';
NG_FOR: 'ngFor';
NG_SWITCH: 'ngSwitch';
NG_SWITCH_CASE: 'ngSwitchCase';
NG_SWITCH_DEFAULT: 'ngSwitchDefault';
NG_TEMPLATE_OUTLET: 'ngTemplateOutlet';
NG_CLASS: 'ngClass';
NG_STYLE: 'ngStyle';

//////////////////////////////////////////////////////////////////
// أنواع البيانات (Types)
STRING_TYPE: 'string';
NUMBER_TYPE: 'int'|'double'|'long'|'short'|'float'|'number';
BOOLEAN_TYPE: 'boolean';
ANY_TYPE: 'any';
VOID_TYPE: 'void';

//////////////////////////////////////////////////////////////////
// الرموز (Symbols)
AT: '@';
DOT: '.';
COMMA: ',';
COLON: ':';
SEMI_COLON: ';';
QUESTION_MARK: '?';
HASH_TAG: '#';
BACTICK:'`';
ASSING: '=';
PLUS: '+';
MINUS: '-';
MULTIPLY: '*';
DIV: '/';
MODULUS: '%';

PLUS_PLUS: '++';
MINUS_MINUS: '--';

LESS_THAN: '<';
GREATER_THAN: '>';
LESS_THAN_EQUALS: '<=';
GREATER_THAN_EQUALS: '>=';

EQUALS: '==';
NOT_EQUALS: '!=';
IDENTITY_EQUALS: '===';
IDENTITY_NOT_EQUALS: '!==';

NOT: '!';
AND: '&&';
OR: '||';
OR1:'|';

OPEN_BRACE: '{';
CLOSE_BRACE: '}';
OPEN_PAREN: '(';
CLOSE_PAREN: ')';
OPEN_BRACKET: '[';
CLOSE_BRACKET: ']';

DOUBLE_OPEN_BRACE: '{{';
DOUBLE_CLOSE_BRACE: '}}';


//////////////////////////////////////////////////////////////////
// القيم (Literals)
STRING
    : '"' ( ~["\r\n] )* '"'
    | '\'' ( ~['\r\n] )* '\''
    ;

NUMBER: [0-9]+ ( '.' [0-9]+ )?;

BOOLEAN: 'true' | 'false';


IDENTIFIER: [a-zA-Z_:][a-zA-Z0-9._-]*;

//////////////////////////////////////////////////////////////////
// Whitespace and Comments
WS: [ \t\r\n]+ -> skip;
COMMENT: '//' ~[\r\n]* -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;
