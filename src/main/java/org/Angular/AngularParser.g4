parser grammar AngularParser;

options { tokenVocab=AngularLexer; }

program: statement+ EOF;

statement
    : block                               # BlockSt
    | decorator                            #DecoratorSt
    | printStatement                      # PrintStatementSt
    | arrayAccess                         # ArrayAccessSt
    | variableStatement                   # VariableStatementSt
    | importStatement                     # ImportStatementSt
    | exportStatement                     # ExportStatementSt
    | classDeclaration                    # ClassDeclarationSt
    | ifStatement                         # IfStatementSt
    | iterationStatement                  # IterationStatementSt
    | switchStatement                     # SwitchStatementSt
    | functionDeclartion                  # FunctionDeclartionSt
    | functionCall                        # FunctionCallSt
    | expression SEMI_COLON?              # ExpressionSt
    ;

block: OPEN_BRACE statement* CLOSE_BRACE SEMI_COLON?
;

printStatement
    : CONSOLE DOT LOG OPEN_PAREN (expression)? CLOSE_PAREN SEMI_COLON?
    ;

arrayAccess
    : IDENTIFIER OPEN_BRACKET expression CLOSE_BRACKET
    ;

////////////////////////////////////////////////////////////////////////////////
// import

importStatement : IMPORT importDeclaration (FROM STRING)? SEMI_COLON?;

importDeclaration
    :  importDefaultSpecifier         #ImportDefaultSpecifier_L
    | importNamespaceSpecifier       #ImportNamespaceSpecifier_L
    | importNamedSpecifier           #ImportNamedSpecifier_L
    ;

importDefaultSpecifier : IDENTIFIER | STRING;

importNamespaceSpecifier: MULTIPLY AS IDENTIFIER;

importNamedSpecifier
    : (importSpecifier COMMA)* OPEN_BRACE (importSpecifier (COMMA importSpecifier)* COMMA?)? CLOSE_BRACE;

importSpecifier
    : IDENTIFIER
    | angularDecoratorName
    | IDENTIFIER AS IDENTIFIER
    ;

////////////////////////////////////////////////////////////////////////////////
// export

exportStatement
    :  exportDefaultDeclaration                      #ExportDefaultDeclaration_L
    | exportDeclaration                              #ExportDeclaration_L
    | exportListDeclaration                          #ExportListDeclaration_L
    ;

exportDefaultDeclaration
    : EXPORT DEFAULT_CASE expression SEMI_COLON?
    ;

exportDeclaration
    : EXPORT (variableStatement | classDeclaration | functionDeclartion) SEMI_COLON?
    ;

exportListDeclaration
    : EXPORT (CLASS IDENTIFIER)? OPEN_BRACE (  exportSpecifier (COMMA exportSpecifier)* COMMA?)? CLOSE_BRACE (FROM STRING)? SEMI_COLON?
    ;

exportSpecifier
    : IDENTIFIER
    | IDENTIFIER AS IDENTIFIER
    | AT? angularDecoratorName (OPEN_PAREN CLOSE_PAREN IDENTIFIER COLON type SEMI_COLON)?
    ;

////////////////////////////////////////////////////////////////////////////////
// class

classDeclaration
    : decorator? EXPORT? DEFAULT_CASE? CLASS IDENTIFIER (EXTENDS expression)?(IMPLEMENTS IDENTIFIER(COMMA IDENTIFIER)*)? OPEN_BRACE classMember* CLOSE_BRACE
    ;



classMember
    : decorator* variableDeclaration SEMI_COLON?   # DecoratedProperty
    | decorator* classMethodDeclaration                     # DecoratedMethod
    | constructorDeclaration                                # ConstructorMember
    ;

classMethodDeclaration
    : accessModifier? IDENTIFIER OPEN_PAREN parameterList? CLOSE_PAREN block
    ;

constructorDeclaration
    : CONSTRUCTOR OPEN_PAREN parameterList? CLOSE_PAREN block
    ;

parameterList
    : parameter (COMMA parameter)* ;

parameter
    : accessModifier? IDENTIFIER COLON typeAnnotation (ASSING expression)?
    ;

accessModifier
    : PUBLIC | PRIVATE | PROTECTED
    ;

////////////////////////////////////////////////////////////////////////////////
// variable

variableStatement
    : varHelpers variableDeclaration (COMMA variableDeclaration)* SEMI_COLON              # VariableDeclarationVr
    | CONST variableDeclarationConst (COMMA variableDeclarationConst)* SEMI_COLON?         # VariableDeclarationConstVr
    ;

variableDeclarationConst
    : variableType COLON? typeAnnotation ASSING value                                 # VariableTypedAndAssignedConst
    | variableType ASSING expression                                                       # VariableAssignedConstOnly
    ;

variableDeclaration
    : variableType COLON? typeAnnotation (ASSING expression)?                              # VariableTypedAndMaybeAssigned
    | variableType (ASSING expression)?                                                    # VariableUntyped
    ;

variableType
    : IDENTIFIER                      # IdentifierVt
    | arrayDeclaration                # ArrayDeclarationVt
    | objectDeclaration               # ObjectDeclarationVt
    ;

typeAnnotation
    : type arraySuffix?                                                                                                                      # TypeWithArray
    |OPEN_BRACE (IDENTIFIER  COLON type COMMA?)* CLOSE_BRACE ASSING OPEN_BRACE (IDENTIFIER  COLON value COMMA?)* CLOSE_BRACE SEMI_COLON      #TypeWithObject
    |inlineObjectType arraySuffix?                                                                                                                 #InlineObjectArray
    ;

inlineObjectType
    : OPEN_BRACE typeMember (COMMA typeMember)* CLOSE_BRACE (OR1  value)?
    ;

typeMember
    : IDENTIFIER COLON type
    ;


arraySuffix
    : OPEN_BRACKET CLOSE_BRACKET
    ;

////////////////////////////////////////////////////////////////////////////////
// object & array literals

objectDeclaration
    : OPEN_BRACE (objectProperty (COMMA objectProperty)* COMMA?)? CLOSE_BRACE
    ;

objectProperty
    : IDENTIFIER COLON expression                  # NamedObjectProperty
    | expression                                   # ShorthandOrDynamicProperty
    ;

arrayDeclaration
    : OPEN_BRACKET COMMA* (expression COMMA)* expression? COMMA? CLOSE_BRACKET
    ;

////////////////////////////////////////////////////////////////////////////////
// expression

expression
    : functionDeclartion                     # FunctionExpression
    | functionCall                           # FunctionCallExpression
    | arrayAccess                            # ArrayAccessExpression
    | expression QUESTION_MARK? DOT HASH_TAG? expression        # MemberDotExpression
    | expression PLUS_PLUS                   # PostIncrementExpression
    | expression MINUS_MINUS                 # PostDecreaseExpression
    | PLUS_PLUS expression                   # PreIncrementExpression
    | MINUS_MINUS expression                 # PreDecreaseExpression
    | NOT expression                         # NotExpression
    | expression (MULTIPLY | DIV | MODULUS) expression           # MultiplicativeExpression
    | expression (PLUS | MINUS) expression                       # AdditiveExpression
    | expression (LESS_THAN | GREATER_THAN | LESS_THAN_EQUALS | GREATER_THAN_EQUALS) expression # RelationalExpression
    | expression (EQUALS | NOT_EQUALS | IDENTITY_EQUALS | IDENTITY_NOT_EQUALS | ASSING) expression # EqualityExpression
    | expression AND expression              # LogicalAndExpression
    | expression OR expression               # LogicalOrExpression
    | expression QUESTION_MARK expression  COLON expression       # TernaryExpression
    | value                                  # ValueExpression
    | arrayDeclaration                       # ArrayExpression
    | objectDeclaration                      # ObjectExpression
    | htmlBody                                                       # HtmlBodyExpression
    | return                                 # ReturnExpression
    | breakStatement                         # BreakExpression
    | OPEN_PAREN expression CLOSE_PAREN      # ParenthesizedExpression
    ;

////////////////////////////////////////////////////////////////////////////////
// if - else

ifStatement
    : IF OPEN_PAREN expression CLOSE_PAREN statement elseIfStatement* elseStatement? SEMI_COLON?
    ;

elseIfStatement
    : ELSE IF OPEN_PAREN expression CLOSE_PAREN block?
    ;

elseStatement
    : ELSE block?
    ;

////////////////////////////////////////////////////////////////////////////////
// iteration

iterationStatement
    : DO statement WHILE OPEN_PAREN expression CLOSE_PAREN SEMI_COLON?         # DoStatement
    | WHILE OPEN_PAREN expression CLOSE_PAREN statement                        # WhileStatement
    | FOR OPEN_PAREN (expression | variableStatement)? SEMI_COLON expression? SEMI_COLON expression? CLOSE_PAREN statement # ForStatement
    | FOR OPEN_PAREN (expression | variableStatement) IN expression CLOSE_PAREN statement # ForInStatement
    ;

////////////////////////////////////////////////////////////////////////////////
// switch

switchStatement
    : SWITCH OPEN_PAREN expression CLOSE_PAREN OPEN_BRACE caseClause* defaultClause? CLOSE_BRACE SEMI_COLON?
    ;

caseClause
    : CASE expression COLON statement*
    ;

defaultClause
    : DEFAULT_CASE COLON statement*
    ;

////////////////////////////////////////////////////////////////////////////////
// return & break

breakStatement
    : BREAK SEMI_COLON?
    ;

return
    :RETURN OPEN_PAREN htmlBody CLOSE_PAREN SEMI_COLON       #ReturnHtmlBody
    |RETURN expression SEMI_COLON?                          # ReturnExpressionOnly
    ;

////////////////////////////////////////////////////////////////////////////////
// functions

functionCall
    : IDENTIFIER OPEN_PAREN (expression (COMMA expression)*)? CLOSE_PAREN SEMI_COLON?
    ;

functionDeclartion
    : normalFunction                        #Normal_Function
    | anoymousFunction                      #Anoymous_Function
    | arrowFunction                         #Arrow_Function
    | decorator? accessModifier? FUNCTION? IDENTIFIER OPEN_PAREN expression* CLOSE_PAREN block   #Decorator_Function
    ;

normalFunction
    : ASYNC? FUNCTION MULTIPLY? IDENTIFIER OPEN_PAREN (expression COMMA?)* CLOSE_PAREN(COLON type)? block
    ;

anoymousFunction
    : ASYNC? FUNCTION MULTIPLY? OPEN_PAREN (expression COMMA?)* CLOSE_PAREN block
    ;

arrowFunction
    : arrowParameters ARROW (block | expression)
    ;

arrowParameters
    : value                               # ValueArrow
    | OPEN_PAREN (expression COMMA?)* CLOSE_PAREN  # ExpressionArrow
    ;

////////////////////////////////////////////////////////////////////////////////
// decorators

decorator
    : AT angularDecoratorName OPEN_PAREN  decoratorArguments  CLOSE_PAREN
    ;

decoratorArguments: OPEN_BRACE (decoratorArgument COMMA?)+ CLOSE_BRACE;

decoratorArgument:
 SELECTOR COLON STRING                                             #SelectorArgument
|TEMPLATE_URL COLON STRING                                         #Template_UrlArgument
|TEMPLATE COLON BACTICK htmlBody BACTICK                           #TemplateArgument
;


htmlBody : htmlBodyWithDiv                 #HtmlBodyWithDiv_L
         | htmlBodyNestedDiv               #HtmlBodyNestedDiv_L
         | htmlBodyDivAlone                #HtmlBodyDivAlone_L
         | htmlBodyNoDiv                   #HtmlBodyNoDiv_L
         ;

// <div classname = "key">jsxContent</div>
htmlBodyWithDiv: LESS_THAN (IDENTIFIER htmlAttributes*)? GREATER_THAN htmlContent LESS_THAN DIV IDENTIFIER? GREATER_THAN;

// <div classname = "key" jsxContent/>
htmlBodyNestedDiv : LESS_THAN IDENTIFIER htmlAttributes* htmlContent DIV GREATER_THAN
                  ;
// <div classname = "key"/> | <div/>
htmlBodyDivAlone : LESS_THAN IDENTIFIER htmlAttributes* DIV GREATER_THAN
                 ;
// <sidebar>
htmlBodyNoDiv : LESS_THAN IDENTIFIER htmlAttributes* GREATER_THAN
              ;



// HTML Content
htmlContent : htmlBody  # HtmlContent_Element
           | interpolation # HtmlContent_Interpolation
           | IDENTIFIER # HtmlContent_ID
           | htmlText? ((htmlBody | htmlExpression) htmlText?)*  #HtmlContents
           ;

htmlExpression:OPEN_BRACE expression* CLOSE_BRACE;

htmlText: ~(LESS_THAN | OPEN_BRACE)+
                 ;
// Interpolation
interpolation :  DOUBLE_OPEN_BRACE expression DOUBLE_CLOSE_BRACE;

// HTML Attributes
htmlAttributes : (angularDirective | htmlAttribute | htmlEvent | htmlBinding | htmlClass)+ COMMA? ;

// Angular Directive
angularDirective : MULTIPLY directive ASSING STRING ;

directive : NG_IF # Directive_NgIf
          | NG_SWITCH # Directive_NgSwitch
          | NG_FOR # Directive_NgFor
          | NG_STYLE # Directive_NgStyle
          | NG_CLASS # Directive_NgClass
          ;

// HTML Attribute
htmlAttribute :
               IDENTIFIER ASSING objectDeclaration  #HtmlAtteibute_Object
              | IDENTIFIER ASSING STRING             #HtmlAtteibute_String
              | IDENTIFIER                           #HtmlAtteibute_Identifier
              ;

// HTML Event
htmlEvent : OPEN_PAREN IDENTIFIER CLOSE_PAREN ASSING STRING ;

// HTML Binding
htmlBinding : OPEN_BRACKET IDENTIFIER CLOSE_BRACKET ASSING (STRING | interpolation) ;

// HTML Class
htmlClass : CLASS ASSING STRING ;


angularDecoratorName
    : COMPONENT
    | DIRECTIVE
    | PIPE
    | INJECTABLE
    | INPUT
    | OUTPUT
    | HOST_LISTENER
    | NG_MODULE
    | VIEW_CHILD
    | ON_INIT
    ;

////////////////////////////////////////////////////////////////////////////////
// helpers & values

varHelpers
    : VAR
    | LET
    ;

value
    : STRING
    | NUMBER
    | BOOLEAN
    | NULL
    | UNDEFINED
    | IDENTIFIER
    ;

type
    : STRING_TYPE
    | NUMBER_TYPE
    | BOOLEAN_TYPE
    | ANY_TYPE
    | VOID_TYPE
    ;


