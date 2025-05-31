parser grammar AngularParser;

options {tokenVocab=AngularLexer;}

// Program
program : (importStatement)* (variableDeclaration | classDeclaration | functionDeclaration | componentDeclaration)* exportStatement? EOF # ProgramSt;

// Main Parts
importStatement : IMPORT importType FROM STRING SEMI # ImportStatementSt;
importType      : ID # ImportType_ID
                | LEFTCURLY (ID (COMMA ID)*)? RIGHTCURLY # ImportType_Multiple
                ;

exportStatement : EXPORT exportType # ExportStatementSt;
exportType      : DEFAULT? (classDeclaration | variableDeclaration | functionDeclaration | componentDeclaration | object) # ExportType_Object
                | LEFTCURLY (ID (COMMA ID)*)? RIGHTCURLY # ExportType_Multiple
                ;

// Variable Declaration
variableDeclaration : (VAR | LET | CONST)? ID (EQUAL | COLON) variableValue (SEMI | COMMA) # VariableDeclarationSt;
variableValue       : value # VariableValue_Value
                    | array # VariableValue_Array
                    | object # VariableValue_Object
                    | functionDeclaration # VariableValue_Function
                    ;

classDeclaration : CLASS ID (EXTENDS ID)? (IMPLEMENTS ID (COMMA ID)*)? LEFTCURLY classBody RIGHTCURLY # ClassDeclarationSt;

functionDeclaration : FUNCTION? ID LEFTPAREN parameters? RIGHTPAREN (COLON type)? LEFTCURLY functionBody RIGHTCURLY # FunctionDeclarationSt;

componentDeclaration : decorator # ComponentDeclaration_Decorator
                     | LEFTCURLY componentBody RIGHTCURLY # ComponentDeclaration_Body
                     ;

// Values
value : type # Value_Type
      | array # Value_Array
      | object # Value_Object
      | jsxElement # Value_JsxElement
      | angularDirective # Value_AngularDirective
      | interpolation # Value_Interpolation
      ;

array : LEFTBRACKET (value (COMMA value)*)? RIGHTBRACKET # ArraySt;

object : LEFTCURLY (ID COLON value (COMMA ID COLON value)*)? RIGHTCURLY # ObjectSt;

// Classes
classBody : (decorator | constructorDeclaration | variableDeclaration | functionDeclaration)* # ClassBodySt;

assignment : (ID COLON type SEMI)+ (EQUAL value)? # Assignment_Type
           | THIS DOT ID EQUAL (value | THIS DOT ID (DOT callFunction)?)? SEMI? # Assignment_Value
           | ID EQUAL value SEMI             # Assignment_Value2
           ;

// Decorators
decorator : AT ID LEFTPAREN decoratorArguments* RIGHTPAREN # Decorator_WithArguments
          | AT ID # Decorator_Simple
          ;
decoratorArguments : LEFTCURLY argumentContent* RIGHTCURLY # DecoratorArgumentsSt;

argumentContent : exportStatement # ArgumentContent_Export
                | functionDeclaration # ArgumentContent_Function
                | variableDeclaration # ArgumentContent_Variable
                | classDeclaration # ArgumentContent_Class
                | LEFTCURLY statement* RIGHTCURLY # ArgumentContent_Block
                | SELECTOR COLON STRING COMMA # ArgumentContent_Selector
                | TEMPLATE COLON HTMLSTRING jsxElement HTMLSTRING COMMA # ArgumentContent_Template
                ;

constructorDeclaration : CONSTRUCTOR LEFTPAREN parameters? RIGHTPAREN LEFTCURLY (functionBody | assignment) RIGHTCURLY # ConstructorDeclarationSt;

// Functions
parameters
    : (PUBLIC | PRIVATE)? ID (COLON type (EQUAL value)?)? (COMMA (PUBLIC | PRIVATE)? ID (COLON type (EQUAL value)?)?)* # Parameters_Standard
    | LEFTCURLY ID (COMMA ID)* RIGHTCURLY # Parameters_ObjectDestructuring
    ;

functionBody : statement* returnStatement? # FunctionBodySt;

returnStatement : RETURN (value (operation value)? | jsxElement)? SEMI # ReturnStatementSt;

operation : PLUS # Operation_Plus
          | MINUS # Operation_Minus
          | STAR # Operation_Multiply
          | DIVISION # Operation_Divide
          | EQ # Operation_Equals
          | NEQ # Operation_NotEquals
          | GREATERTHAN # Operation_GreaterThan
          | GREATEREQUAL # Operation_GreaterEqual
          | LESSTHAN # Operation_LessThan
          | LESSEQUAL # Operation_LessEqual
          ;

// Statements
statement : variableDeclaration # Statement_VariableDeclaration
          | ifStatement # Statement_IfStatement
          | forStatement # Statement_ForStatement
          | whileStatement # Statement_WhileStatement
          | callFunction # Statement_FunctionCall
          | printStatement # Statement_Print
          | jsxElement # Statement_JsxElement
          | angularDirective # Statement_AngularDirective
          | returnStatement # Statement_Return
          | assignment # Statement_Assignment
          ;

// Component
componentBody : variableDeclaration* functionDeclaration* # ComponentBodySt;

// Conditionals And Loops
ifStatement : IF LEFTPAREN condition RIGHTPAREN LEFTCURLY statement* RIGHTCURLY (ELSE LEFTCURLY statement* RIGHTCURLY)? # IfStatementSt;

condition : expression (AND | OR) expression # Condition_Boolean
          | expression # Condition_Simple
          ;

forStatement : FOR LEFTPAREN variableDeclaration? condition? SEMI? statement? RIGHTPAREN LEFTCURLY statement* RIGHTCURLY # ForStatementSt;

whileStatement : WHILE LEFTPAREN condition RIGHTPAREN LEFTCURLY statement* RIGHTCURLY # WhileStatementSt;

// Function Calls
callFunction : ID LEFTPAREN (expression (COMMA expression)*)? RIGHTPAREN SEMI # CallFunctionSt;

// Jsx Element
jsxElement : openingTag jsxContent* closingTag # JsxElement_Tagged
           | selfClosingTag # JsxElement_SelfClosing
           ;

// Opening Tag
openingTag : LESSTHAN ID jsxAttributes? GREATERTHAN # OpeningTagSt;

// Closing Tag
closingTag : LESSTHAN DIVISION ID GREATERTHAN # ClosingTagSt;

// Self-Closing Tag
selfClosingTag : LESSTHAN ID jsxAttributes? SLASHGREATERTHAN # SelfClosingTagSt;

// Jsx Content
jsxContent : jsxElement # JsxContent_Element
           | interpolation # JsxContent_Interpolation
           | ID # JsxContent_ID
           ;

// Interpolation
interpolation : DOUBLELEFTCURLY expression DOUBLERIGHTCURLY # InterpolationSt;

// Jsx Attributes
jsxAttributes : (angularDirective | jsxAttribute | jsxEvent | jsxBinding | jsxClass)+ # JsxAttributesSt;

// Angular Directive
angularDirective : STAR directive EQUAL STRING # AngularDirectiveSt;

directive : NGIF # Directive_NgIf
          | NGSWITCH # Directive_NgSwitch
          | NGFOR # Directive_NgFor
          | NGSTYLE # Directive_NgStyle
          | NGCLASS # Directive_NgClass
          ;

// Jsx Attribute
jsxAttribute : ID EQUAL STRING # JsxAttributeSt;

// Jsx Event
jsxEvent : LEFTPAREN ID RIGHTPAREN EQUAL STRING # JsxEventSt;

// Jsx Binding
jsxBinding : LEFTBRACKET ID RIGHTBRACKET EQUAL (STRING | interpolation) # JsxBindingSt;

// Jsx Class
jsxClass : CLASS EQUAL STRING # JsxClassSt;

// Expression
expression : ID # Expression_ID
           | ID DOT ID # Expression_MemberAccess
           | STRING # Expression_String
           | INT # Expression_Int
           | DOUBLE # Expression_Double
           | BOOLEAN # Expression_Boolean
           | value # Expression_Value
           | callFunction # Expression_FunctionCall
           | array # Expression_Array
           | object # Expression_Object
           | expression operation expression # Expression_Operation
           ;

// Types
type : ID # Type_ID
     | STRING # Type_String
     | INT # Type_Int
     | DOUBLE # Type_Double
     | BOOLEAN # Type_Boolean
     | ANY # Type_Any
     | PUBLIC # Type_Public
     | PRIVATE # Type_Private
     | VOID # Type_Void
     | NUMBER # Type_Number
     | NULL # Type_Null
     ;

// Print
printStatement : CONSOLE DOT LOG LEFTPAREN expression RIGHTPAREN SEMI # PrintStatementSt;
