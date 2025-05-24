parser grammar AngularParser ;

options {tokenVocab=AngularLexer;}

// Program
program :(importStatement)* (variableDeclaration | classDeclaration | functionDeclaration | componentDeclaration)* exportStatement? EOF;

// Main Parts
importStatement
    : IMPORT (ID | LEFTCURLY (ID (COMMA ID)*)? RIGHTCURLY) FROM STRING SEMI
    ;

exportStatement
    : EXPORT (DEFAULT? (classDeclaration | variableDeclaration | functionDeclaration | componentDeclaration | object) | LEFTCURLY (ID (COMMA ID)*)? RIGHTCURLY)
    ;

variableDeclaration
    : (VAR | LET | CONST)? ID (EQUAL | COLON) (value | array | object | functionDeclaration) (SEMI | COMMA)
    | (VAR | LET | CONST)? ID COLON type (LEFTBRACKET RIGHTBRACKET)? value? EQUAL (value | array | object | functionDeclaration) (SEMI | COMMA)
    ;

classDeclaration
    : CLASS ID (EXTENDS ID)? (IMPLEMENTS ID (COMMA ID)*)? LEFTCURLY classBody RIGHTCURLY
    ;

functionDeclaration
    : FUNCTION? ID LEFTPAREN parameters? RIGHTPAREN (COLON type)? LEFTCURLY functionBody RIGHTCURLY
    ;

componentDeclaration
    : decorator
    | LEFTCURLY componentBody RIGHTCURLY
    ;

// Values
value
    : type
    | array
    | object
    | jsxElement
    | angularDirective
    | interpolation
    ;

array
    : LEFTBRACKET (value (COMMA value)*)? RIGHTBRACKET
    ;

object
    : LEFTCURLY (ID COLON value (COMMA ID COLON value)*)? RIGHTCURLY
    ;

// Classes
classBody
   : (decorator | constructorDeclaration | variableDeclaration | functionDeclaration)*
   ;

assignment
   : (ID COLON type SEMI)+
   | THIS DOT ID EQUAL (value | THIS DOT ID (DOT callFunction)?)? SEMI?
   ;

// Decorators
decorator
    : AT ID LEFTPAREN decoratorArguments* RIGHTPAREN
    | AT ID
    ;

decoratorArguments:
    LEFTCURLY argumentContent* RIGHTCURLY
    ;

argumentContent
    : exportStatement
    | functionDeclaration
    | variableDeclaration
    | classDeclaration
    | LEFTCURLY (statement)* RIGHTCURLY
    | SELECTOR COLON STRING COMMA
    | TEMPLATE COLON HTMLSTRING jsxElement HTMLSTRING COMMA
    ;

constructorDeclaration
    : CONSTRUCTOR LEFTPAREN parameters? RIGHTPAREN LEFTCURLY (functionBody | assignment) RIGHTCURLY
    ;

// Functions
parameters
    : (PUBLIC | PRIVATE)? ID (COLON type (EQUAL value)?)? (COMMA (PUBLIC | PRIVATE)? ID (COLON type (EQUAL value)?)?)*
    | LEFTCURLY ID (COMMA ID)* RIGHTCURLY
    ;

functionBody
    : statement* returnStatement?
    ;

returnStatement
    : RETURN (value (operation value)? | jsxElement)? SEMI
    ;

operation
    : PLUS
    | MINUS
    | STAR
    | DIVISION
    | EQ
    | NEQ
    | GREATERTHAN
    | GREATEREQUAL
    | LESSTHAN
    | LESSEQUAL
    ;

statement
    : variableDeclaration
    | ifStatement
    | forStatement
    | whileStatement
    | callFunction
    | printStatement
    | jsxElement
    | angularDirective
    | returnStatement
    | assignment
    ;

// Component
componentBody
    : variableDeclaration* functionDeclaration*
    ;

// Conditionals And Loops
ifStatement
    : IF LEFTPAREN condition RIGHTPAREN LEFTCURLY statement* RIGHTCURLY (ELSE LEFTCURLY statement* RIGHTCURLY)?
    ;

condition
    : expression (AND | OR) expression
    | expression
    ;

forStatement
    : FOR LEFTPAREN variableDeclaration? condition? SEMI? statement? RIGHTPAREN LEFTCURLY statement* RIGHTCURLY
    ;

whileStatement
    : WHILE LEFTPAREN condition RIGHTPAREN LEFTCURLY statement* RIGHTCURLY
    ;

// Function Calls
callFunction
    : ID LEFTPAREN (expression (COMMA expression)*)? RIGHTPAREN SEMI
    ;

// Jsx Element
jsxElement
    : openingTag jsxContent* closingTag
    | selfClosingTag
    ;

// Opening Tag
openingTag
    : LESSTHAN ID jsxAttributes? GREATERTHAN
    ;

// Closing Tag
closingTag
    : LESSTHAN DIVISION ID GREATERTHAN
    ;

// Self-Closing Tag
selfClosingTag
    : LESSTHAN ID jsxAttributes? SLASHGREATERTHAN
    ;

// jsx Content
jsxContent
    : jsxElement
    | interpolation
    | ID
    ;

// Interpolation
interpolation
    : DOUBLELEFTCURLY expression DOUBLERIGHTCURLY
    ;

// jsx Attributes
jsxAttributes
    : (angularDirective | jsxAttribute | jsxEvent | jsxBinding | jsxClass)+
    ;

// Angular Directive
angularDirective
    : STAR directive EQUAL STRING
    ;

directive
    : NGIF
    | NGSWITCH
    | NGFOR
    | NGSTYLE
    | NGCLASS
    ;

// jsx Attribute
jsxAttribute
    : ID EQUAL STRING
    ;

// jsx Event
jsxEvent
    : LEFTPAREN ID RIGHTPAREN EQUAL STRING
    ;

// jsx Binding
jsxBinding
    : LEFTBRACKET ID RIGHTBRACKET EQUAL (STRING | interpolation)
    ;

// jsx Class
jsxClass
    : CLASS EQUAL STRING
    ;

// Expression
expression
    : ID
    | ID DOT ID
    | STRING
    | INT
    | DOUBLE
    | BOOLEAN
    | value
    | callFunction
    | array
    | object
    | expression operation expression
    ;

// Types
type
    : ID
    | STRING
    | INT
    | DOUBLE
    | BOOLEAN
    | ANY
    | PUBLIC
    | PRIVATE
    | VOID
    | NUMBER
    | NULL
    ;

// Print
printStatement
    : CONSOLE DOT LOG LEFTPAREN expression RIGHTPAREN SEMI;