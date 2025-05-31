package Visitor;

import AST.*;

import ErrorHandling.SemanticCheck;
import SymbolTable.Row;
import SymbolTable.SymbolTable;
import SymbolTable.SymbolTable2;
import org.Angular.AngularParser;

import org.Angular.AngularParserBaseVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class BaseVisitor extends AngularParserBaseVisitor<Object> {

    SymbolTable symbolTable = new SymbolTable();
    SymbolTable2 symbolTable2 = new SymbolTable2();
    SemanticCheck semanticCheck;
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
    public Object visitProgramSt(AngularParser.ProgramStContext ctx) {
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
    public Object visitImportStatementSt(AngularParser.ImportStatementStContext ctx) {
        ImportStatement importStatement = new ImportStatement();

        if (!ctx.getTokens(AngularParser.ID).isEmpty()) {
            importStatement.setId(ctx.getTokens(AngularParser.ID).getFirst().getText());
        } else if (!ctx.getTokens(AngularParser.LEFTCURLY).isEmpty()) {
            List<String> ids = new ArrayList<>();
            for (int i = 0; i < ctx.getTokens(AngularParser.ID).size(); i++) {
                ids.add(ctx.getTokens(AngularParser.ID).get(i).getText());
            }
            importStatement.setIds(ids);
        }

        importStatement.setFrom(ctx.getTokens(AngularParser.STRING).getFirst().getText());

        Row row = new Row(ctx.getStart().getLine(),
                importStatement.getId() != null ? importStatement.getId() : "Multiple Imports",
                "Import",
                importStatement.getFrom(),
                0);

        symbolTable.addVariable(row);
        symbolTable2.addVariable(row.getLine(), row.getVariableName(), row.getType(), row.getValue());

        return importStatement;
    }

    // Export Statement

    @Override
    public Object visitExportStatementSt(AngularParser.ExportStatementStContext ctx) {
        boolean isDefault = !ctx.getTokens(AngularParser.DEFAULT).isEmpty();
        ClassDeclaration classDeclaration = null;
        VariableDeclaration variableDeclaration = null;
        FunctionDeclaration functionDeclaration = null;
        ComponentDeclaration componentDeclaration = null;
        Object customObject = null;
        List<String> ids = new ArrayList<>();

        if (ctx.getRuleContext(AngularParser.ClassDeclarationStContext.class, 0) != null) {
            classDeclaration = (ClassDeclaration) visit(ctx.getRuleContext(AngularParser.ClassDeclarationStContext.class, 0));
        } else if (ctx.getRuleContext(AngularParser.VariableDeclarationStContext.class, 0) != null) {
            variableDeclaration = (VariableDeclaration) visit(ctx.getRuleContext(AngularParser.VariableDeclarationStContext.class, 0));
        } else if (ctx.getRuleContext(AngularParser.FunctionDeclarationStContext.class, 0) != null) {
            functionDeclaration = (FunctionDeclaration) visit(ctx.getRuleContext(AngularParser.FunctionDeclarationStContext.class, 0));
        } else if (ctx.getRuleContext(AngularParser.ComponentDeclaration_BodyContext.class, 0) != null) {
            componentDeclaration = (ComponentDeclaration) visit(ctx.getRuleContext(AngularParser.ComponentDeclaration_BodyContext.class, 0));
        } else if (ctx.getRuleContext(AngularParser.ObjectStContext.class, 0) != null) {
            customObject = (Object) visit(ctx.getRuleContext(AngularParser.ObjectStContext.class, 0));
        } else if (!ctx.getTokens(AngularParser.LEFTCURLY).isEmpty()) {
            for (TerminalNode token : ctx.getTokens(AngularParser.ID)) {
                ids.add(token.getText());
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
    public Object visitVariableDeclarationSt(AngularParser.VariableDeclarationStContext ctx) {
        String varType = null;
        if (!ctx.getTokens(AngularParser.VAR).isEmpty()) {
            varType = ctx.getTokens(AngularParser.VAR).getFirst().getText();
        } else if (!ctx.getTokens(AngularParser.LET).isEmpty()) {
            varType = ctx.getTokens(AngularParser.LET).getFirst().getText();
        } else if (!ctx.getTokens(AngularParser.CONST).isEmpty()) {
            varType = ctx.getTokens(AngularParser.CONST).getFirst().getText();
        }

        String id = !ctx.getTokens(AngularParser.ID).isEmpty() ? ctx.getTokens(AngularParser.ID).getFirst().getText() : "undefined_var";
        if ("undefined_var".equals(id)) {
            System.err.println("Semantic Error: Variable declaration is missing an identifier.");
            return null;
        }

        Type type = ctx.getRuleContext(AngularParser.Type_IDContext.class, 0) != null ?
                (Type) visit(ctx.getRuleContext(AngularParser.Type_IDContext.class, 0)) : null;

        Value value = ctx.getRuleContext(AngularParser.Value_TypeContext.class, 0) != null ?
                (Value) visit(ctx.getRuleContext(AngularParser.Value_TypeContext.class, 0)) : null;

        Array array = ctx.getRuleContext(AngularParser.Expression_ArrayContext.class, 0) != null ?
                (Array) visit(ctx.getRuleContext(AngularParser.Expression_ArrayContext.class, 0)) : null;

        Object object = ctx.getRuleContext(AngularParser.Expression_ObjectContext.class, 0) != null ?
                visit(ctx.getRuleContext(AngularParser.Expression_ObjectContext.class, 0)) : null;

        FunctionDeclaration functionDeclaration = ctx.getRuleContext(AngularParser.FunctionDeclarationStContext.class, 0) != null ?
                (FunctionDeclaration) visit(ctx.getRuleContext(AngularParser.FunctionDeclarationStContext.class, 0)) : null;

        int currentScopeId = symbolTable.getScopeId();

        Row row = new Row(ctx.getStart().getLine(), id, type != null ? type.getTypeName() : "unknown",
                value != null ? value.toString() : "undefined", currentScopeId);

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
    public Object visitClassDeclarationSt(AngularParser.ClassDeclarationStContext ctx) {
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
    public Object visitFunctionDeclarationSt(AngularParser.FunctionDeclarationStContext ctx) {
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
    public Object visitComponentDeclaration_Body(AngularParser.ComponentDeclaration_BodyContext ctx) {
        Decorator decorator = null;
        ComponentBody componentBody = null;

        if (ctx.getRuleContext(AngularParser.Decorator_SimpleContext.class, 0) != null) {
            decorator = (Decorator) visit(ctx.getRuleContext(AngularParser.Decorator_SimpleContext.class, 0));

            symbolTable.enterScope();

            Row row = new Row(ctx.getStart().getLine(), decorator.getId(), "Decorator", "Defined", symbolTable.getScopeId());
            symbolTable.addVariable(row);
            symbolTable2.addVariable(row.getLine(), row.getVariableName(), row.getType(), row.getValue());
        }

        if (ctx.getRuleContext(AngularParser.ComponentBodyStContext.class, 0) != null) {
            componentBody = (ComponentBody) visit(ctx.getRuleContext(AngularParser.ComponentBodyStContext.class, 0));

            Row row = new Row(ctx.getStart().getLine(), "ComponentBody", "Component", componentBody.getVariableDeclarations().toString(), symbolTable.getScopeId());
            symbolTable.addVariable(row);
            symbolTable2.addVariable(row.getLine(), row.getVariableName(), row.getType(), row.getValue());
        }

        symbolTable.exitScope();

        return new ComponentDeclaration(decorator, componentBody);
    }



    // Value

    @Override
    public Object visitValue_Type(AngularParser.Value_TypeContext ctx) {
        Object result = visit(ctx.type());
        return new Value(String.valueOf(result));
    }

    @Override
    public Object visitValue_Array(AngularParser.Value_ArrayContext ctx) {
        return visit(ctx.array());
    }




    @Override
    public Object visitValue_Object(AngularParser.Value_ObjectContext ctx) {
        Object result = visit(ctx.object());
        return new Value(String.valueOf(result));
    }
    @Override
    public Object visitValue_JsxElement(AngularParser.Value_JsxElementContext ctx) {
        Object result = visit(ctx.jsxElement());
        return new Value(String.valueOf(result));
    }
    @Override
    public Object visitValue_AngularDirective(AngularParser.Value_AngularDirectiveContext ctx) {
        Object result = visit(ctx.angularDirective());
        return new Value(String.valueOf(result));
    }
    @Override
    public Object visitValue_Interpolation(AngularParser.Value_InterpolationContext ctx) {
        Object result = visit(ctx.interpolation());
        return new Value(String.valueOf(result));
    }


    // Array

    @Override
    public Object visitArraySt(AngularParser.ArrayStContext ctx) {
        System.out.println("Visiting array with " + (ctx.value() == null ? 0 : ctx.value().size()) + " elements.");

        List<Value> elements = new ArrayList<>();

        List<AngularParser.ValueContext> values = ctx.value();

        if (values != null) {
            for (AngularParser.ValueContext valCtx : values) {
                Value value = (Value) visit(valCtx);
                System.out.println("Visited element: " + value);
                elements.add(value);
            }
        }

        Value arrayValue = new Value(elements);
        System.out.println("Constructed array value: " + arrayValue);
        return arrayValue;
    }




    // Object

    @Override
    public Object visitObjectSt(AngularParser.ObjectStContext ctx) {
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
    public Object visitClassBodySt(AngularParser.ClassBodyStContext ctx) {
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
    public Object visitDecorator_Simple(AngularParser.Decorator_SimpleContext ctx) {
        String id = ctx.ID().getText();
        List<DecoratorArgument> arguments = new ArrayList<>();

        if (!ctx.getRuleContexts(AngularParser.DecoratorArgumentsStContext.class).isEmpty()) {
            for (AngularParser.DecoratorArgumentsStContext argCtx : ctx.getRuleContexts(AngularParser.DecoratorArgumentsStContext.class)) {
                arguments.add((DecoratorArgument) visit(argCtx));
            }
        }

        return new Decorator(id, arguments);
    }




    // Decorator Arguments

    @Override
    public Object visitDecoratorArgumentsSt(AngularParser.DecoratorArgumentsStContext ctx) {
        DecoratorArgument decoratorArguments = new DecoratorArgument();

        for (AngularParser.ArgumentContentContext argCtx : ctx.argumentContent()) {
            ArgumentContent argumentContent = (ArgumentContent) visit(argCtx);
            decoratorArguments.addArgumentContent(argumentContent);

        }

        return decoratorArguments;
    }


    // Argument Content
    @Override
    public Object visitArgumentContent_Export(AngularParser.ArgumentContent_ExportContext ctx) {
        if (ctx.getRuleContext(AngularParser.ExportStatementStContext.class, 0) != null) {
            return new ArgumentContent((ExportStatement) visit(ctx.getRuleContext(AngularParser.ExportStatementStContext.class, 0)));
        } else if (ctx.getRuleContext(AngularParser.ArgumentContent_FunctionContext.class, 0) != null) {
            return new ArgumentContent((FunctionDeclaration) visit(ctx.getRuleContext(AngularParser.ArgumentContent_FunctionContext.class, 0)));
        } else if (ctx.getRuleContext(AngularParser.ArgumentContent_VariableContext.class, 0) != null) {
            return new ArgumentContent((VariableDeclaration) visit(ctx.getRuleContext(AngularParser.ArgumentContent_VariableContext.class, 0)));
        } else if (ctx.getRuleContext(AngularParser.ArgumentContent_ClassContext.class, 0) != null) {
            return new ArgumentContent((ClassDeclaration) visit(ctx.getRuleContext(AngularParser.ArgumentContent_ClassContext.class, 0)));
        } else if (!ctx.getTokens(AngularParser.LEFTCURLY).isEmpty()) {
            List<Statement> statements = new ArrayList<>();
            for (AngularParser.ArgumentContent_BlockContext stmtCtx : ctx.getRuleContexts(AngularParser.ArgumentContent_BlockContext.class)) {
                statements.add((Statement) visit(stmtCtx));
            }
            return new ArgumentContent(statements);
        } else if (!ctx.getTokens(AngularParser.SELECTOR).isEmpty() &&
                !ctx.getTokens(AngularParser.COLON).isEmpty() &&
                !ctx.getTokens(AngularParser.STRING).isEmpty() &&
                !ctx.getTokens(AngularParser.COMMA).isEmpty()) {
            return new ArgumentContent(ctx.getTokens(AngularParser.SELECTOR).getFirst().getText(),
                    ctx.getTokens(AngularParser.STRING).getFirst().getText());
        } else if (!ctx.getTokens(AngularParser.TEMPLATE).isEmpty() &&
                !ctx.getTokens(AngularParser.COLON).isEmpty() &&
                ctx.getTokens(AngularParser.HTMLSTRING).size() == 2 &&
                ctx.getRuleContext(AngularParser.Value_JsxElementContext.class, 0) != null &&
                !ctx.getTokens(AngularParser.COMMA).isEmpty()) {
            return new ArgumentContent(ctx.getTokens(AngularParser.TEMPLATE).getFirst().getText(),
                    ctx.getTokens(AngularParser.HTMLSTRING).get(0).getText(),
                    (JsxElement) visit(ctx.getRuleContext(AngularParser.Value_JsxElementContext.class, 0)),
                    ctx.getTokens(AngularParser.HTMLSTRING).get(1).getText());
        }
        return null;
    }


    // Constructor Declaration

    @Override
    public Object visitConstructorDeclarationSt(AngularParser.ConstructorDeclarationStContext ctx) {
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
    public Object visitParameters_Standard(AngularParser.Parameters_StandardContext ctx) {
        Parameters parameters = new Parameters();

        for (int i = 0; i < ctx.getTokens(AngularParser.ID).size(); i++) {
            String accessModifier = ctx.getTokens(AngularParser.PUBLIC).size() > i ? ctx.getTokens(AngularParser.PUBLIC).get(i).getText()
                    : ctx.getTokens(AngularParser.PRIVATE).size() > i ? ctx.getTokens(AngularParser.PRIVATE).get(i).getText() : null;

            String id = ctx.getTokens(AngularParser.ID).get(i).getText();
            Type type = ctx.getRuleContext(AngularParser.Type_IDContext.class, i) != null ?
                    (Type) visit(ctx.getRuleContext(AngularParser.Type_IDContext.class, i)) : null;
            Object value = ctx.getRuleContext(AngularParser.Value_TypeContext.class, i) != null ?
                    visit(ctx.getRuleContext(AngularParser.Value_TypeContext.class, i)) : null;

            Parameter parameter = new Parameter(accessModifier, id, type, value);
            parameters.addParameter(parameter);
        }

        return parameters;
    }
    // Function Body

    @Override
    public Object visitFunctionBodySt(AngularParser.FunctionBodyStContext ctx) {
        List<Statement> statements = new ArrayList<>();
        for (AngularParser.Statement_VariableDeclarationContext stmtCtx : ctx.getRuleContexts(AngularParser.Statement_VariableDeclarationContext.class)) {
            statements.add((Statement) visit(stmtCtx));
        }

        ReturnStatement returnStatement = null;
        if (ctx.getRuleContext(AngularParser.ReturnStatementStContext.class, 0) != null) {
            returnStatement = (ReturnStatement) visit(ctx.getRuleContext(AngularParser.ReturnStatementStContext.class, 0));
        }

        return new FunctionBody(statements, returnStatement);
    }

    // Return Statement
    @Override
    public Object visitReturnStatementSt(AngularParser.ReturnStatementStContext ctx) {
        if (ctx.getRuleContext(AngularParser.Value_JsxElementContext.class, 0) != null) {
            return new ReturnStatement((JsxElement) visit(ctx.getRuleContext(AngularParser.Value_JsxElementContext.class, 0)));
        }

        Value value = ctx.getRuleContext(AngularParser.Value_TypeContext.class, 0) != null ?
                (Value) visit(ctx.getRuleContext(AngularParser.Value_TypeContext.class, 0)) : null;

        operation operation = null;
        Value secondValue = null;

        if (ctx.getRuleContext(AngularParser.Operation_EqualsContext.class, 0) != null) {
            operation = AST.operation.EQ;
            secondValue = (Value) visit(ctx.getRuleContext(AngularParser.Value_TypeContext.class, 1));
        }

        return new ReturnStatement(value, operation, secondValue);
    }
    // Operation

    @Override
    public Object visitOperation_Equals(AngularParser.Operation_EqualsContext ctx) {
        if (!ctx.getTokens(AngularParser.PLUS).isEmpty()) {
            return operation.PLUS;
        } else if (!ctx.getTokens(AngularParser.MINUS).isEmpty()) {
            return operation.MINUS;
        } else if (!ctx.getTokens(AngularParser.STAR).isEmpty()) {
            return operation.STAR;
        } else if (!ctx.getTokens(AngularParser.DIVISION).isEmpty()) {
            return operation.DIVISION;
        } else if (!ctx.getTokens(AngularParser.EQ).isEmpty()) {
            return operation.EQ;
        } else if (!ctx.getTokens(AngularParser.NEQ).isEmpty()) {
            return operation.NEQ;
        } else if (!ctx.getTokens(AngularParser.GREATERTHAN).isEmpty()) {
            return operation.GREATERTHAN;
        } else if (!ctx.getTokens(AngularParser.GREATEREQUAL).isEmpty()) {
            return operation.GREATEREQUAL;
        } else if (!ctx.getTokens(AngularParser.LESSTHAN).isEmpty()) {
            return operation.LESSTHAN;
        } else if (!ctx.getTokens(AngularParser.LESSEQUAL).isEmpty()) {
            return operation.LESSEQUAL;
        }
        return null;
    }

    //  Statement

    @Override
    public Object visitStatement_VariableDeclaration(AngularParser.Statement_VariableDeclarationContext ctx) {
        if (ctx.getRuleContext(AngularParser.Statement_VariableDeclarationContext.class, 0) != null) {
            return new Statement((VariableDeclaration) visit(ctx.getRuleContext(AngularParser.Statement_VariableDeclarationContext.class, 0)));
        } else if (ctx.getRuleContext(AngularParser.Statement_IfStatementContext.class, 0) != null) {
            return new Statement((ifStatement) visit(ctx.getRuleContext(AngularParser.Statement_IfStatementContext.class, 0)));
        } else if (ctx.getRuleContext(AngularParser.Statement_ForStatementContext.class, 0) != null) {
            return new Statement((ForStatement) visit(ctx.getRuleContext(AngularParser.Statement_ForStatementContext.class, 0)));
        } else if (ctx.getRuleContext(AngularParser.Statement_WhileStatementContext.class, 0) != null) {
            return new Statement((WhileStatement) visit(ctx.getRuleContext(AngularParser.Statement_WhileStatementContext.class, 0)));
        } else if (ctx.getRuleContext(AngularParser.Statement_PrintContext.class, 0) != null) {
            return new Statement((Print) visit(ctx.getRuleContext(AngularParser.Statement_PrintContext.class, 0)));
        } else if (ctx.getRuleContext(AngularParser.Statement_JsxElementContext.class, 0) != null) {
            return new Statement((JsxElement) visit(ctx.getRuleContext(AngularParser.Statement_JsxElementContext.class, 0)));
        } else if (ctx.getRuleContext(AngularParser.Statement_AngularDirectiveContext.class, 0) != null) {
            return new Statement((angularDirective) visit(ctx.getRuleContext(AngularParser.Statement_AngularDirectiveContext.class, 0)));
        } else if (ctx.getRuleContext(AngularParser.Statement_ReturnContext.class, 0) != null) {
            return new Statement((ReturnStatement) visit(ctx.getRuleContext(AngularParser.Statement_ReturnContext.class, 0)));
        } else if (ctx.getRuleContext(AngularParser.Statement_AssignmentContext.class, 0) != null) {
            Object assignment = visit(ctx.getRuleContext(AngularParser.Statement_AssignmentContext.class, 0));
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
    public Object visitComponentBodySt(AngularParser.ComponentBodyStContext ctx) {
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
    public Object visitIfStatementSt(AngularParser.IfStatementStContext ctx) {
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
    public Object visitCondition_Simple(AngularParser.Condition_SimpleContext ctx) {
        Expression left = (Expression) visit(ctx.getRuleContext(AngularParser.Expression_IDContext.class, 0));
        Expression right = null;
        String operator = null;

        if (!ctx.getTokens(AngularParser.AND).isEmpty()) {
            operator = ctx.getTokens(AngularParser.AND).getFirst().getText();
            right = (Expression) visit(ctx.getRuleContext(AngularParser.Expression_IDContext.class, 1));
        } else if (!ctx.getTokens(AngularParser.OR).isEmpty()) {
            operator = ctx.getTokens(AngularParser.OR).getFirst().getText();
            right = (Expression) visit(ctx.getRuleContext(AngularParser.Expression_IDContext.class, 1));
        }

        return right != null ? new Condition(left, right, operator) : new Condition(left, null, null);
    }



    // For Statement

    @Override
    public Object visitForStatementSt(AngularParser.ForStatementStContext ctx) {
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
    public Object visitWhileStatementSt(AngularParser.WhileStatementStContext ctx) {
        Condition condition = (Condition) visit(ctx.condition());
        List<Statement> body = new ArrayList<>();

        for (AngularParser.StatementContext stmtCtx : ctx.statement()) {
            body.add((Statement) visit(stmtCtx));
        }





        return new WhileStatement(condition, body);
    }

    // Call Function

    @Override
    public Object visitCallFunctionSt(AngularParser.CallFunctionStContext ctx) {
        String functionName = ctx.ID().getText();
        List<Expression> arguments = new ArrayList<>();

        for (AngularParser.ExpressionContext exprCtx : ctx.expression()) {
            arguments.add((Expression) visit(exprCtx));
        }

        return new CallFunction(functionName, arguments);
    }

    // JSX Element

    @Override
    public Object visitJsxElement_Tagged(AngularParser.JsxElement_TaggedContext ctx) {
        if (ctx.getRuleContext(AngularParser.SelfClosingTagStContext.class, 0) != null) {
            return new JsxElement((SelfClosingTag) visit(ctx.getRuleContext(AngularParser.SelfClosingTagStContext.class, 0)));
        }

        OpeningTag openingTag = (OpeningTag) visit(ctx.getRuleContext(AngularParser.OpeningTagStContext.class, 0));
        List<JsxContent> jsxContents = new ArrayList<>();
        for (AngularParser.JsxContent_ElementContext contentCtx : ctx.getRuleContexts(AngularParser.JsxContent_ElementContext.class)) {
            jsxContents.add((JsxContent) visit(contentCtx));
        }
        ClosingTag closingTag = (ClosingTag) visit(ctx.getRuleContext(AngularParser.ClosingTagStContext.class, 0));

        return new JsxElement(openingTag, jsxContents, closingTag);
    }


    @Override
    public Object visitOpeningTagSt(AngularParser.OpeningTagStContext ctx) {
        String id = ctx.ID() != null ? ctx.ID().getText() : null;
        JsxAttributes jsxAttributes = ctx.jsxAttributes() != null ? (JsxAttributes) visit(ctx.jsxAttributes()) : null;


        return new OpeningTag(id, jsxAttributes);
    }


    @Override
    public Object visitClosingTagSt(AngularParser.ClosingTagStContext ctx) {
        return new ClosingTag(ctx.ID().getText());
    }


    @Override
    public Object visitSelfClosingTagSt(AngularParser.SelfClosingTagStContext ctx) {
        String id = ctx.ID() != null ? ctx.ID().getText() : null;
        JsxAttributes jsxAttributes = ctx.jsxAttributes() != null ? (JsxAttributes) visit(ctx.jsxAttributes()) : null;


        return new SelfClosingTag(id, jsxAttributes);
    }


    // JSX Content
    @Override
    public Object visitJsxContent_Element(AngularParser.JsxContent_ElementContext ctx) {
        if (ctx.getRuleContext(AngularParser.Value_JsxElementContext.class, 0) != null) {
            JsxElement jsxElement = (JsxElement) visit(ctx.getRuleContext(AngularParser.Value_JsxElementContext.class, 0));
            return new JsxContent(jsxElement);
        } else if (ctx.getRuleContext(AngularParser.Value_InterpolationContext.class, 0) != null) {
            interpolation interp = (interpolation) visit(ctx.getRuleContext(AngularParser.Value_InterpolationContext.class, 0));
            return new JsxContent(interp);
        } else if (!ctx.getTokens(AngularParser.ID).isEmpty()) {
            return new JsxContent(ctx.getTokens(AngularParser.ID).getFirst().getText());
        }

        return null;
    }



    // Interpolation

    @Override
    public Object visitInterpolationSt(AngularParser.InterpolationStContext ctx) {

        Expression expression = (Expression) visit(ctx.expression());


        return new interpolation(expression);
    }


    //Jsx Attributes

    @Override
    public Object visitJsxAttributesSt(AngularParser.JsxAttributesStContext ctx) {
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

    public Object visitAngularDirectiveSt(AngularParser.AngularDirectiveStContext ctx)  {
        String directive = ctx.directive().getText();
        String value = ctx.STRING().getText();


        return new angularDirective(directive, value);
    }


    // Directive

    @Override
    public Object visitDirective_NgIf(AngularParser.Directive_NgIfContext ctx) {
        return Directive.NGIF;
    }

    @Override
    public Object visitDirective_NgSwitch(AngularParser.Directive_NgSwitchContext ctx) {
        return Directive.NGSWITCH;
    }

    @Override
    public Object visitDirective_NgFor(AngularParser.Directive_NgForContext ctx) {
        return Directive.NGFOR;
    }

    @Override
    public Object visitDirective_NgStyle(AngularParser.Directive_NgStyleContext ctx) {
        return Directive.NGSTYLE;
    }

    @Override
    public Object visitDirective_NgClass(AngularParser.Directive_NgClassContext ctx) {
        return Directive.NGCLASS;
    }

    // JSX Attribute

    @Override
    public Object visitJsxAttributeSt(AngularParser.JsxAttributeStContext ctx) {
        String id = ctx.ID().getText();
        String value = ctx.STRING().getText();


        return new JsxAttribute(id, value);
    }


    // JSX EVENT
    @Override
    public Object visitJsxEventSt(AngularParser.JsxEventStContext ctx) {
        String id = ctx.ID().getText();
        String value = ctx.STRING().getText();


        return new jsxEvent(id, value);
    }


    // JSX Binding

    @Override
    public Object visitJsxBindingSt(AngularParser.JsxBindingStContext ctx)  {
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
    public Object visitJsxClassSt(AngularParser.JsxClassStContext ctx) {
        String className = ctx.STRING().getText();
        return new JsxClass(className);
    }

    // Expression

    @Override
    public Object visitExpression_ID(AngularParser.Expression_IDContext ctx) {
        Expression expression = null;

        if (ctx.getTokens(AngularParser.ID).size() == 1) {
            expression = new Expression(ctx.getTokens(AngularParser.ID).getFirst().getText());
        } else if (ctx.getTokens(AngularParser.ID).size() == 2) {
            expression = new Expression(ctx.getTokens(AngularParser.ID).get(0).getText() + "." + ctx.getTokens(AngularParser.ID).get(1).getText());
        } else if (!ctx.getTokens(AngularParser.STRING).isEmpty()) {
            expression = new Expression(ctx.getTokens(AngularParser.STRING).getFirst().getText());
        } else if (!ctx.getTokens(AngularParser.INT).isEmpty()) {
            expression = new Expression(Integer.parseInt(ctx.getTokens(AngularParser.INT).getFirst().getText()));
        } else if (!ctx.getTokens(AngularParser.DOUBLE).isEmpty()) {
            expression = new Expression(String.valueOf(Double.parseDouble(ctx.getTokens(AngularParser.DOUBLE).getFirst().getText())));
        } else if (!ctx.getTokens(AngularParser.BOOLEAN).isEmpty()) {
            expression = new Expression(String.valueOf(Boolean.parseBoolean(ctx.getTokens(AngularParser.BOOLEAN).getFirst().getText())));
        } else if (ctx.getRuleContext(AngularParser.Expression_ValueContext.class, 0) != null) {
            expression = new Expression(String.valueOf(visit(ctx.getRuleContext(AngularParser.Expression_ValueContext.class, 0))));
        } else if (ctx.getRuleContext(AngularParser.Expression_FunctionCallContext.class, 0) != null) {
            expression = new Expression(String.valueOf(visit(ctx.getRuleContext(AngularParser.Expression_FunctionCallContext.class, 0))));
        } else if (ctx.getRuleContext(AngularParser.Expression_ArrayContext.class, 0) != null) {
            expression = new Expression(String.valueOf(visit(ctx.getRuleContext(AngularParser.Expression_ArrayContext.class, 0))));
        } else if (ctx.getRuleContext(AngularParser.Expression_ObjectContext.class, 0) != null) {
            expression = new Expression(String.valueOf(visit(ctx.getRuleContext(AngularParser.Expression_ObjectContext.class, 0))));
        } else if (ctx.getRuleContexts(AngularParser.Expression_IDContext.class).size() == 2 &&
                ctx.getRuleContext(AngularParser.Expression_OperationContext.class, 0) != null) {
            expression = new Expression(
                    (Expression) visit(ctx.getRuleContext(AngularParser.Expression_IDContext.class, 0)),
                    (Expression) visit(ctx.getRuleContext(AngularParser.Expression_IDContext.class, 1)),
                    (operation) visit(ctx.getRuleContext(AngularParser.Expression_OperationContext.class, 0))
            );
        }

        return expression;
    }



    // Type

    @Override
    public Object visitType_ID(AngularParser.Type_IDContext ctx) {
        return new Type(ctx.getText());
    }
    @Override
    public Object visitType_String(AngularParser.Type_StringContext ctx) {
        return new Type(ctx.getText());
    }
    @Override
    public Object visitType_Int(AngularParser.Type_IntContext ctx) {
        return new Type(ctx.getText());
    }
    @Override
    public Object visitType_Double(AngularParser.Type_DoubleContext ctx) {
        return new Type(ctx.getText());
    }
    @Override
    public Object visitType_Boolean(AngularParser.Type_BooleanContext ctx) {
        return new Type(ctx.getText());
    }
    @Override
    public Object visitType_Any(AngularParser.Type_AnyContext ctx) {
        return new Type(ctx.getText());
    }
    @Override
    public Object visitType_Public(AngularParser.Type_PublicContext ctx) {
        return new Type(ctx.getText());
    }
    @Override
    public Object visitType_Private(AngularParser.Type_PrivateContext ctx) {
        return new Type(ctx.getText());
    }
    @Override
    public Object visitType_Null(AngularParser.Type_NullContext ctx) {
        return new Type(ctx.getText());
    }
    @Override
    public Object visitType_Number(AngularParser.Type_NumberContext ctx) {
        return new Type(ctx.getText());
    }
    @Override
    public Object visitType_Void(AngularParser.Type_VoidContext ctx) {
        return new Type(ctx.getText());
    }

    // Print Statement

    @Override
    public Object visitPrintStatementSt(AngularParser.PrintStatementStContext ctx) {
        List<String> expressions = new ArrayList<>();

        expressions.add(ctx.expression().getText());

        return new Print(expressions);
    }

}
