package Visitor;

import AST.*;

import SymbolTable.Row;
import SymbolTable.SymbolTable;
import SymbolTable.SymbolTable2;
import org.Angular.AngularParser;
import org.Angular.AngularParserBaseVisitor;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

public class BaseVisitor extends AngularParserBaseVisitor<Object> {

    SymbolTable symbolTable = new SymbolTable();
    SymbolTable2 symbolTable2 = new SymbolTable2();
    public SymbolTable getSymbolTable() {
        return symbolTable;
    }


    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }
    public void setSymbolTable2(SymbolTable2 symbolTable2) {
        this.symbolTable2 = symbolTable2;
    }


    // Program

    @Override
    public Object visitProgram(AngularParser.ProgramContext ctx) {
        List<ImportStatement> importStatements = new ArrayList<>();
        List<VariableDeclaration> variableDeclarations = new ArrayList<>();
        List<ClassDeclaration> classDeclarations = new ArrayList<>();
        List<FunctionDeclaration> functionDeclarations = new ArrayList<>();
        List<ComponentDeclaration> componentDeclarations = new ArrayList<>();
        ExportStatement exportStatement = null;

        for (AngularParser.ImportStatementContext importCtx : ctx.importStatement()) {
            importStatements.add((ImportStatement) visit(importCtx));
        }
        for (AngularParser.VariableDeclarationContext varCtx : ctx.variableDeclaration()) {
            variableDeclarations.add((VariableDeclaration) visit(varCtx));
        }
        for (AngularParser.ClassDeclarationContext classCtx : ctx.classDeclaration()) {
            classDeclarations.add((ClassDeclaration) visit(classCtx));
        }
        for (AngularParser.FunctionDeclarationContext funcCtx : ctx.functionDeclaration()) {
            functionDeclarations.add((FunctionDeclaration) visit(funcCtx));
        }
        for (AngularParser.ComponentDeclarationContext compCtx : ctx.componentDeclaration()) {
            componentDeclarations.add((ComponentDeclaration) visit(compCtx));
        }
        if (ctx.exportStatement() != null) {
            exportStatement = (ExportStatement) visit(ctx.exportStatement());
        }
        System.out.println("\n");
        System.out.println(symbolTable.toString());
        return new Program(importStatements, variableDeclarations, classDeclarations, functionDeclarations, componentDeclarations, exportStatement);
    }

    //Import Statement

    @Override
    public Object visitImportStatement(AngularParser.ImportStatementContext ctx) {
        ImportStatement importStatement = new ImportStatement();

        if (ctx.ID() != null && !ctx.ID().isEmpty()) {
            importStatement.setId(ctx.ID(0).getText());
        } else if (ctx.LEFTCURLY() != null) {
            List<String> ids = new ArrayList<>();
            for (int i = 0; i < ctx.ID().size(); i++) {
                if (ctx.ID(i) != null) {
                    ids.add(ctx.ID(i).getText());
                }
            }
            importStatement.setIds(ids);
        }

        importStatement.setFrom(ctx.STRING().getText());

        Row row = new Row(ctx.getStart().getLine(),
                importStatement.getId() != null ? importStatement.getId() : "Multiple Imports",
                "Import",
                importStatement.getFrom(),
                symbolTable.getScopeId());

        symbolTable.addVariable(row);
        symbolTable2.addVariable(row.getLine(), row.getVariableName(), row.getType(), row.getValue());

        return importStatement;
    }

    // Export Statement

    @Override
    public Object visitExportStatement(AngularParser.ExportStatementContext ctx) {
        boolean isDefault = ctx.DEFAULT() != null;
        ClassDeclaration classDeclaration = null;
        VariableDeclaration variableDeclaration = null;
        FunctionDeclaration functionDeclaration = null;
        ComponentDeclaration componentDeclaration = null;
        object customObject = null;
        List<String> ids = new ArrayList<>();

        if (ctx.classDeclaration() != null) {
            classDeclaration = (ClassDeclaration) visit(ctx.classDeclaration());
        } else if (ctx.variableDeclaration() != null) {
            variableDeclaration = (VariableDeclaration) visit(ctx.variableDeclaration());
        } else if (ctx.functionDeclaration() != null) {
            functionDeclaration = (FunctionDeclaration) visit(ctx.functionDeclaration());
        } else if (ctx.componentDeclaration() != null) {
            componentDeclaration = (ComponentDeclaration) visit(ctx.componentDeclaration());
        } else if (ctx.object() != null) {
            customObject = (object) visit(ctx.object());
        } else if (ctx.LEFTCURLY() != null) {
            for (int i = 0; i < ctx.ID().size(); i++) {
                ids.add(ctx.ID(i).getText());
            }
        }

        if (isDefault) {
            return new ExportStatement(true, classDeclaration);
        } else if (!ids.isEmpty()) {
            return new ExportStatement(ids);
        } else {
            return new ExportStatement(classDeclaration, variableDeclaration, functionDeclaration, componentDeclaration, customObject);
        }
    }


    // Variable Declaration

    @Override
    public Object visitVariableDeclaration(AngularParser.VariableDeclarationContext ctx) {
        String varType = null;
        if (ctx.VAR() != null) {
            varType = ctx.VAR().getText();
        } else if (ctx.LET() != null) {
            varType = ctx.LET().getText();
        } else if (ctx.CONST() != null) {
            varType = ctx.CONST().getText();
        }

        String id = ctx.ID() != null ? ctx.ID().getText() : "undefined_var";
        if ("undefined_var".equals(id)) {
            System.err.println("Semantic Error: Variable declaration is missing an identifier.");
            return null;
        }

        Type type = null;
        Value value = null;
        Array array = null;
        Object object = null;
        FunctionDeclaration functionDeclaration = null;

        if (ctx.type() != null) {
            type = (Type) visit(ctx.type());
        }

        if (ctx.value() != null) {
            value = (Value) visit(ctx.value(0));
        } else if (ctx.array() != null) {
            array = (Array) visit(ctx.array());
        } else if (ctx.object() != null) {
            object = visit(ctx.object());
        } else if (ctx.functionDeclaration() != null) {
            functionDeclaration = (FunctionDeclaration) visit(ctx.functionDeclaration());
        }




        Row row = new Row(ctx.getStart().getLine(), id, type != null ? type.getTypeName() : "unknown",
                value != null ? value.toString() : "undefined", symbolTable.getScopeId());

        symbolTable.addVariable(row);
        symbolTable2.addVariable(row.getLine(), row.getVariableName(), row.getType(), row.getValue());

        if (type != null) {
            return new VariableDeclaration(varType, id, type, value);
        } else {
            return new VariableDeclaration(varType, id, object != null ? object : functionDeclaration);
        }
    }


    // Class Declaration

    @Override
    public Object visitClassDeclaration(AngularParser.ClassDeclarationContext ctx) {
        String className = ctx.ID(0).getText();
        String extendsClassName = ctx.EXTENDS() != null ? ctx.ID(1).getText() : null;
        List<String> implementsList = new ArrayList<>();
        List<ClassBody> classBodyList = new ArrayList<>();

        if (ctx.IMPLEMENTS() != null) {
            for (int i = ctx.EXTENDS() != null ? 2 : 1; i < ctx.ID().size(); i++) {
                implementsList.add(ctx.ID(i).getText());
            }
        }

        symbolTable.enterScope();

        if (ctx.classBody() != null) {
            classBodyList.add((ClassBody) visit(ctx.classBody()));
        }





        Row row = new Row(ctx.getStart().getLine(), className, "Class", "Defined", symbolTable.getScopeId());

        symbolTable.addVariable(row);
        symbolTable2.addVariable(row.getLine(), row.getVariableName(), row.getType(), row.getValue());

        symbolTable.exitScope();

        return new ClassDeclaration(className, extendsClassName, implementsList, classBodyList);
    }


    // Function Declaration
    @Override
    public Object visitFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx) {
        String id = ctx.ID().getText();
        List<Parameter> parameters = new ArrayList<>();

        if (ctx.parameters() != null) {
            Parameters params = (Parameters) visit(ctx.parameters());
            parameters = params.getParameterList();
        }

        Type returnType = null;
        if (ctx.type() != null) {
            returnType = (Type) visit(ctx.type());
        }

        symbolTable.enterScope();

        FunctionBody functionBody = (FunctionBody) visit(ctx.functionBody());




        Row row = new Row(ctx.getStart().getLine(), id, "Function", "Defined", symbolTable.getScopeId());

        symbolTable.addVariable(row);
        symbolTable2.addVariable(row.getLine(), row.getVariableName(), row.getType(), row.getValue());

        symbolTable.exitScope();

        return new FunctionDeclaration(id, parameters, returnType, functionBody);
    }

// component declaration

    @Override
    public Object visitComponentDeclaration(AngularParser.ComponentDeclarationContext ctx) {
        Decorator decorator = null;
        ComponentBody componentBody = null;

        if (ctx.decorator() != null) {
            decorator = (Decorator) visit(ctx.decorator());

            symbolTable.enterScope();

            Row row = new Row(ctx.getStart().getLine(), decorator.getId(), "Decorator", "Defined", symbolTable.getScopeId());
            symbolTable.addVariable(row);
            symbolTable2.addVariable(row.getLine(), row.getVariableName(), row.getType(), row.getValue());

        }

        if (ctx.componentBody() != null) {
            componentBody = (ComponentBody) visit(ctx.componentBody());

            Row row = new Row(ctx.getStart().getLine(), "ComponentBody", "Component", componentBody.getVariableDeclarations().toString(), symbolTable.getScopeId());
            symbolTable.addVariable(row);
            symbolTable2.addVariable(row.getLine(), row.getVariableName(), row.getType(), row.getValue());
        }

        symbolTable.exitScope();

        return new ComponentDeclaration(decorator, componentBody);
    }



    // Value

    @Override
    public Object visitValue(AngularParser.ValueContext ctx) {
        if (ctx.type() != null) {
            return new Value(String.valueOf(visit(ctx.type())));
        } else if (ctx.array() != null) {
            return new Value(String.valueOf(visit(ctx.array())));
        } else if (ctx.object() != null) {
            return new Value(String.valueOf(visit(ctx.object())));
        } else if (ctx.jsxElement() != null) {
            return new Value(String.valueOf(visit(ctx.jsxElement())));
        } else if (ctx.angularDirective() != null) {
            return new Value(String.valueOf(visit(ctx.angularDirective())));
        } else if (ctx.interpolation() != null) {
            return new Value(String.valueOf(visit(ctx.interpolation())));
        }

        return null;
    }


    // Array

    @Override
    public Object visitArray(AngularParser.ArrayContext ctx) {
        Array array = new Array();

        for (int i = 0; i < ctx.value().size(); i++) {
            Value value = (Value) visit(ctx.value(i));


            array.addValue(value);
        }

        return array;
    }



    // Object

    @Override
    public Object visitObject(AngularParser.ObjectContext ctx) {
        object obj = new object();

        for (int i = 0; i < ctx.ID().size(); i++) {
            String key = ctx.ID(i).getText();
            Object value = visit(ctx.value(i));


            obj.addProperty(key, value);
        }

        return obj;
    }




    // Class Body

    @Override
    public Object visitClassBody(AngularParser.ClassBodyContext ctx) {
        List<Decorator> decorators = new ArrayList<>();
        List<ConstructorDeclaration> constructorDeclarations = new ArrayList<>();
        List<VariableDeclaration> variableDeclarations = new ArrayList<>();
        List<FunctionDeclaration> functionDeclarations = new ArrayList<>();

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            if (child instanceof AngularParser.DecoratorContext) {
                Decorator decorator = (Decorator) visit(child);
                decorators.add(decorator);
            } else if (child instanceof AngularParser.ConstructorDeclarationContext) {
                constructorDeclarations.add((ConstructorDeclaration) visit(child));
            } else if (child instanceof AngularParser.VariableDeclarationContext) {
                VariableDeclaration varDecl = (VariableDeclaration) visit(child);
                variableDeclarations.add(varDecl);
            } else if (child instanceof AngularParser.FunctionDeclarationContext) {
                FunctionDeclaration funcDecl = (FunctionDeclaration) visit(child);
                functionDeclarations.add(funcDecl);
            }
        }

        return new ClassBody(decorators, constructorDeclarations, variableDeclarations, functionDeclarations);
    }

    // Decorator

    @Override
    public Object visitDecorator(AngularParser.DecoratorContext ctx) {
        String id = ctx.ID().getText();
        List<DecoratorArgument> arguments = new ArrayList<>();

        if (ctx.decoratorArguments() != null) {
            for (AngularParser.DecoratorArgumentsContext argCtx : ctx.decoratorArguments()) {
                arguments.add((DecoratorArgument) visit(argCtx));
            }
        }


        return new Decorator(id, arguments);
    }



    // Decorator Arguments

    @Override
    public Object visitDecoratorArguments(AngularParser.DecoratorArgumentsContext ctx) {
        DecoratorArgument decoratorArguments = new DecoratorArgument();

        for (AngularParser.ArgumentContentContext argCtx : ctx.argumentContent()) {
            ArgumentContent argumentContent = (ArgumentContent) visit(argCtx);
            decoratorArguments.addArgumentContent(argumentContent);

        }

        return decoratorArguments;
    }


    // Argument Content
    @Override
    public Object visitArgumentContent(AngularParser.ArgumentContentContext ctx) {
        if (ctx.exportStatement() != null) {
            return new ArgumentContent((ExportStatement) visit(ctx.exportStatement()));
        } else if (ctx.functionDeclaration() != null) {
            FunctionDeclaration functionDeclaration = (FunctionDeclaration) visit(ctx.functionDeclaration());
            return new ArgumentContent(functionDeclaration);
        } else if (ctx.variableDeclaration() != null) {
            VariableDeclaration variableDeclaration = (VariableDeclaration) visit(ctx.variableDeclaration());
            return new ArgumentContent(variableDeclaration);
        } else if (ctx.classDeclaration() != null) {
            ClassDeclaration classDeclaration = (ClassDeclaration) visit(ctx.classDeclaration());
            return new ArgumentContent(classDeclaration);
        } else if (ctx.LEFTCURLY() != null) {
            List<Statement> statements = new ArrayList<>();
            for (AngularParser.StatementContext stmtCtx : ctx.statement()) {
                statements.add((Statement) visit(stmtCtx));
            }
            return new ArgumentContent(statements);
        } else if (ctx.SELECTOR() != null && ctx.COLON() != null && ctx.STRING() != null && ctx.COMMA() != null) {
            return new ArgumentContent(ctx.SELECTOR().getText(), ctx.STRING().getText());
        } else if (ctx.TEMPLATE() != null && ctx.COLON() != null && ctx.HTMLSTRING().size() == 2 && ctx.jsxElement() != null && ctx.COMMA() != null) {
            return new ArgumentContent(ctx.TEMPLATE().getText(), ctx.HTMLSTRING(0).getText(),
                    (JsxElement) visit(ctx.jsxElement()), ctx.HTMLSTRING(1).getText());
        }
        return null;
    }


    // Constructor Declaration

    @Override
    public Object visitConstructorDeclaration(AngularParser.ConstructorDeclarationContext ctx) {
        List<Parameter> parameters = new ArrayList<>();
        if (ctx.parameters() != null) {
            Parameters params = (Parameters) visit(ctx.parameters());
            parameters = params.getParameterList();
        }

        FunctionBody functionBody = null;
        List<Assignments> assignments = new ArrayList<>();

        if (ctx.functionBody() != null) {
            functionBody = (FunctionBody) visit(ctx.functionBody());
        }

        if (ctx.assignment() != null) {
            assignments.add((Assignments) visit(ctx.assignment()));
        }

        return functionBody != null ? new ConstructorDeclaration(parameters, functionBody)
                : new ConstructorDeclaration(parameters, assignments);
    }

    // Parameters

    @Override
    public Object visitParameters(AngularParser.ParametersContext ctx) {
        Parameters parameters = new Parameters();

        for (int i = 0; i < ctx.ID().size(); i++) {
            String accessModifier = ctx.PUBLIC(i) != null ? ctx.PUBLIC(i).getText()
                    : ctx.PRIVATE(i) != null ? ctx.PRIVATE(i).getText() : null;
            String id = ctx.ID(i).getText();
            Type type = ctx.type(i) != null ? (Type) visit(ctx.type(i)) : null;
            Object value = ctx.value(i) != null ? visit(ctx.value(i)) : null;

            Parameter parameter = new Parameter(accessModifier, id, type, value);
            parameters.addParameter(parameter);


        }

        if (ctx.LEFTCURLY() != null) {
            for (int i = 0; i < ctx.ID().size(); i++) {
                parameters.addId(ctx.ID(i).getText());
            }
        }

        return parameters;
    }


    // Function Body

    @Override
    public Object visitFunctionBody(AngularParser.FunctionBodyContext ctx) {
        List<Statement> statements = new ArrayList<>();
        for (AngularParser.StatementContext stmtCtx : ctx.statement()) {
            statements.add((Statement) visit(stmtCtx));
        }

        ReturnStatement returnStatement = null;
        if (ctx.returnStatement() != null) {
            returnStatement = (ReturnStatement) visit(ctx.returnStatement());


        }

        return new FunctionBody(statements, returnStatement);
    }

    // Return Statement
    @Override
    public Object visitReturnStatement(AngularParser.ReturnStatementContext ctx) {
        if (ctx.jsxElement() != null) {
            return new ReturnStatement((JsxElement) visit(ctx.jsxElement()));
        }

        Value value = (Value) visit(ctx.value(0));
        operation operation = null;
        Value secondValue = null;

        if (ctx.operation() != null) {
            operation = (operation) visit(ctx.operation());
            secondValue = (Value) visit(ctx.value(1));
        }


        return new ReturnStatement(value, operation, secondValue);
    }

    // Operation

    @Override
    public Object visitOperation(AngularParser.OperationContext ctx) {
        if (ctx.PLUS() != null) {
            return operation.PLUS;
        } else if (ctx.MINUS() != null) {
            return operation.MINUS;
        } else if (ctx.STAR() != null) {
            return operation.STAR;
        } else if (ctx.DIVISION() != null) {
            return operation.DIVISION;
        } else if (ctx.EQ() != null) {
            return operation.EQ;
        } else if (ctx.NEQ() != null) {
            return operation.NEQ;
        } else if (ctx.GREATERTHAN() != null) {
            return operation.GREATERTHAN;
        } else if (ctx.GREATEREQUAL() != null) {
            return operation.GREATEREQUAL;
        } else if (ctx.LESSTHAN() != null) {
            return operation.LESSTHAN;
        } else if (ctx.LESSEQUAL() != null) {
            return operation.LESSEQUAL;
        }
        return null;
    }

    //  Statement
    @Override
    public Object visitStatement(AngularParser.StatementContext ctx) {
        if (ctx.variableDeclaration() != null) {
            return new Statement((VariableDeclaration) visit(ctx.variableDeclaration()));
        } else if (ctx.ifStatement() != null) {
            return new Statement((ifStatement) visit(ctx.ifStatement()));
        } else if (ctx.forStatement() != null) {
            return new Statement((ForStatement) visit(ctx.forStatement()));
        } else if (ctx.whileStatement() != null) {
            return new Statement((WhileStatement) visit(ctx.whileStatement()));
        } else if (ctx.printStatement() != null) {
            return new Statement((Print) visit(ctx.printStatement()));
        } else if (ctx.jsxElement() != null) {
            return new Statement((JsxElement) visit(ctx.jsxElement()));
        } else if (ctx.angularDirective() != null) {
            return new Statement((angularDirective) visit(ctx.angularDirective()));
        } else if (ctx.returnStatement() != null) {
            return new Statement((ReturnStatement) visit(ctx.returnStatement()));
        } else if (ctx.assignment() != null) {
            Object assignment = visit(ctx.assignment());
            if (assignment instanceof Assignments assignStmt) {
                return new Statement(assignStmt);
            } else if (assignment instanceof CallFunction) {
                return new Statement((CallFunction) assignment);
            }
        }
        return null;
    }


    // Component Body

    @Override
    public Object visitComponentBody(AngularParser.ComponentBodyContext ctx) {
        List<VariableDeclaration> variableDeclarations = new ArrayList<>();
        List<FunctionDeclaration> functionDeclarations = new ArrayList<>();

        for (AngularParser.VariableDeclarationContext varCtx : ctx.variableDeclaration()) {
            VariableDeclaration varDecl = (VariableDeclaration) visit(varCtx);
            variableDeclarations.add(varDecl);
        }

        for (AngularParser.FunctionDeclarationContext funcCtx : ctx.functionDeclaration()) {
            FunctionDeclaration funcDecl = (FunctionDeclaration) visit(funcCtx);
            functionDeclarations.add(funcDecl);
        }

        return new ComponentBody(variableDeclarations, functionDeclarations);
    }


    // IF Statement

    @Override
    public Object visitIfStatement(AngularParser.IfStatementContext ctx) {
        Condition condition = (Condition) visit(ctx.condition());

        List<Statement> thenStatements = new ArrayList<>();
        for (AngularParser.StatementContext stmtCtx : ctx.statement()) {
            thenStatements.add((Statement) visit(stmtCtx));
        }

        List<Statement> elseStatements = new ArrayList<>();
        if (ctx.ELSE() != null) {
            for (AngularParser.StatementContext stmtCtx : ctx.statement()) {
                elseStatements.add((Statement) visit(stmtCtx));
            }
        }


        return new ifStatement(condition, thenStatements, elseStatements);
    }


    //Condition

    @Override
    public Object visitCondition(AngularParser.ConditionContext ctx) {
        Expression left = (Expression) visit(ctx.expression(0));
        Expression right = null;
        String operator = null;

        if (ctx.AND() != null) {
            operator = ctx.AND().getText();
            right = (Expression) visit(ctx.expression(1));
        } else if (ctx.OR() != null) {
            operator = ctx.OR().getText();
            right = (Expression) visit(ctx.expression(1));
        }



        if (right != null) {
            return new Condition(left, right, operator);
        } else {
            return new Condition(left, null, null);
        }
    }


    // For Statement

    @Override
    public Object visitForStatement(AngularParser.ForStatementContext ctx) {
        VariableDeclaration variableDeclaration = null;
        Condition condition = null;
        Statement body = null;

        if (ctx.variableDeclaration() != null) {
            variableDeclaration = (VariableDeclaration) visit(ctx.variableDeclaration());
        }

        if (ctx.condition() != null) {
            condition = (Condition) visit(ctx.condition());

        }

        if (ctx.statement(0) != null) {
            body = (Statement) visit(ctx.statement(0));
        }

        List<Statement> statements = new ArrayList<>();
        for (int i = 1; i < ctx.statement().size(); i++) {
            statements.add((Statement) visit(ctx.statement(i)));
        }

        return new ForStatement(variableDeclaration, condition, body, statements);
    }

    // While Statement

    @Override
    public Object visitWhileStatement(AngularParser.WhileStatementContext ctx) {
        Condition condition = (Condition) visit(ctx.condition());
        List<Statement> body = new ArrayList<>();

        for (AngularParser.StatementContext stmtCtx : ctx.statement()) {
            body.add((Statement) visit(stmtCtx));
        }





        return new WhileStatement(condition, body);
    }

    // Call Function

    @Override
    public Object visitCallFunction(AngularParser.CallFunctionContext ctx) {
        String functionName = ctx.ID().getText();
        List<Expression> arguments = new ArrayList<>();

        for (AngularParser.ExpressionContext exprCtx : ctx.expression()) {
            arguments.add((Expression) visit(exprCtx));
        }

        return new CallFunction(functionName, arguments);
    }

    // JSX Element

    @Override
    public Object visitJsxElement(AngularParser.JsxElementContext ctx) {
        if (ctx.selfClosingTag() != null) {
            return new JsxElement((SelfClosingTag) visit(ctx.selfClosingTag()));
        }

        OpeningTag openingTag = (OpeningTag) visit(ctx.openingTag());
        List<JsxContent> jsxContents = new ArrayList<>();
        for (AngularParser.JsxContentContext contentCtx : ctx.jsxContent()) {
            jsxContents.add((JsxContent) visit(contentCtx));
        }
        ClosingTag closingTag = (ClosingTag) visit(ctx.closingTag());


        return new JsxElement(openingTag, jsxContents, closingTag);
    }


    @Override
    public Object visitOpeningTag(AngularParser.OpeningTagContext ctx) {
        String id = ctx.ID() != null ? ctx.ID().getText() : null;
        JsxAttributes jsxAttributes = ctx.jsxAttributes() != null ? (JsxAttributes) visit(ctx.jsxAttributes()) : null;


        return new OpeningTag(id, jsxAttributes);
    }


    @Override
    public Object visitClosingTag(AngularParser.ClosingTagContext ctx) {
        return new ClosingTag(ctx.ID().getText());
    }


    @Override
    public Object visitSelfClosingTag(AngularParser.SelfClosingTagContext ctx) {
        String id = ctx.ID() != null ? ctx.ID().getText() : null;
        JsxAttributes jsxAttributes = ctx.jsxAttributes() != null ? (JsxAttributes) visit(ctx.jsxAttributes()) : null;


        return new SelfClosingTag(id, jsxAttributes);
    }


    // JSX Content

    @Override
    public Object visitJsxContent(AngularParser.JsxContentContext ctx) {
        if (ctx.jsxElement() != null) {
            JsxElement jsxElement = (JsxElement) visit(ctx.jsxElement());
            return new JsxContent(jsxElement);
        } else if (ctx.interpolation() != null) {
            interpolation interp = (interpolation) visit(ctx.interpolation());
            return new JsxContent(interp);
        } else if (ctx.ID() != null) {
            return new JsxContent(ctx.ID().getText());
        }

        return null;
    }



    // Interpolation

    @Override
    public Object visitInterpolation(AngularParser.InterpolationContext ctx) {
        Expression expression = (Expression) visit(ctx.expression());


        return new interpolation(expression);
    }


    //Jsx Attributes

    @Override
    public Object visitJsxAttributes(AngularParser.JsxAttributesContext ctx) {
        List<angularDirective> angularDirectives = new ArrayList<>();
        List<JsxAttribute> jsxAttributes = new ArrayList<>();
        List<jsxEvent> jsxEvents = new ArrayList<>();
        List<JsxBinding> jsxBindings = new ArrayList<>();
        List<JsxClass> jsxClasses = new ArrayList<>();

        for (ParseTree child : ctx.children) {
            if (child instanceof AngularParser.DirectiveContext) {
                angularDirective directive = (angularDirective) visit(child);
                angularDirectives.add(directive);
            } else if (child instanceof AngularParser.JsxAttributeContext) {
                jsxAttributes.add((JsxAttribute) visit(child));
            } else if (child instanceof AngularParser.JsxEventContext) {
                jsxEvents.add((jsxEvent) visit(child));
            } else if (child instanceof AngularParser.JsxBindingContext) {
                jsxBindings.add((JsxBinding) visit(child));
            } else if (child instanceof AngularParser.JsxClassContext) {
                jsxClasses.add((JsxClass) visit(child));
            }
        }

        return new JsxAttributes(angularDirectives, jsxAttributes, jsxEvents, jsxBindings, jsxClasses);
    }

    // Angular Directive

    @Override
    public Object visitAngularDirective(AngularParser.AngularDirectiveContext ctx) {
        String directive = ctx.directive().getText();
        String value = ctx.STRING().getText();


        return new angularDirective(directive, value);
    }


    // Directive

    @Override
    public Object visitDirective(AngularParser.DirectiveContext ctx) {
        if (ctx.NGIF() != null) {
            return Directive.NGIF;
        } else if (ctx.NGSWITCH() != null) {
            return Directive.NGSWITCH;
        } else if (ctx.NGFOR() != null) {
            return Directive.NGFOR;
        } else if (ctx.NGSTYLE() != null) {
            return Directive.NGSTYLE;
        } else if (ctx.NGCLASS() != null) {
            return Directive.NGCLASS;
        }
        return null;
    }

    // JSX Attribute

    @Override
    public Object visitJsxAttribute(AngularParser.JsxAttributeContext ctx) {
        String id = ctx.ID().getText();
        String value = ctx.STRING().getText();


        return new JsxAttribute(id, value);
    }


    // JSX EVENT
    @Override
    public Object visitJsxEvent(AngularParser.JsxEventContext ctx) {
        String id = ctx.ID().getText();
        String value = ctx.STRING().getText();


        return new jsxEvent(id, value);
    }


    // JSX Binding

    @Override
    public Object visitJsxBinding(AngularParser.JsxBindingContext ctx) {
        String id = ctx.ID().getText();

        if (ctx.STRING() != null) {
            return new JsxBinding(id, ctx.STRING().getText());
        } else if (ctx.interpolation() != null) {
            return new JsxBinding(id, (interpolation) visit(ctx.interpolation()));
        }

        return null;
    }

    // Jsx Class

    @Override
    public Object visitJsxClass(AngularParser.JsxClassContext ctx) {
        String className = ctx.STRING().getText();
        return new JsxClass(className);
    }

    // Expression

    @Override
    public Object visitExpression(AngularParser.ExpressionContext ctx) {
        Expression expression = null;

        if (ctx.ID().size() == 1) {
            expression = new Expression(ctx.ID(0).getText());
        } else if (ctx.ID().size() == 2) {
            expression = new Expression(ctx.ID(0).getText() + "." + ctx.ID(1).getText());
        } else if (ctx.STRING() != null) {
            expression = new Expression(ctx.STRING().getText());
        } else if (ctx.INT() != null) {
            expression = new Expression(Integer.parseInt(ctx.INT().getText()));
        } else if (ctx.DOUBLE() != null) {
            expression = new Expression(String.valueOf(Double.parseDouble(ctx.DOUBLE().getText())));
        } else if (ctx.BOOLEAN() != null) {
            expression = new Expression(String.valueOf(Boolean.parseBoolean(ctx.BOOLEAN().getText())));
        } else if (ctx.value() != null) {
            expression = new Expression(String.valueOf(visit(ctx.value())));
        } else if (ctx.callFunction() != null) {
            expression = new Expression(String.valueOf(visit(ctx.callFunction())));
        } else if (ctx.array() != null) {
            expression = new Expression(String.valueOf(visit(ctx.array())));
        } else if (ctx.object() != null) {
            expression = new Expression(String.valueOf(visit(ctx.object())));
        } else if (ctx.expression().size() == 2 && ctx.operation() != null) {
            expression = new Expression(
                    (Expression) visit(ctx.expression(0)),
                    (Expression) visit(ctx.expression(1)),
                    (operation) visit(ctx.operation())
            );
        }


        return expression;
    }


    // Type

    @Override
    public Object visitType(AngularParser.TypeContext ctx) {
        return new Type(ctx.getText());
    }

    // Print Statement

    @Override
    public Object visitPrintStatement(AngularParser.PrintStatementContext ctx) {
        List<String> expressions = new ArrayList<>();

        expressions.add(ctx.expression().getText());

        return new Print(expressions);
    }

}
