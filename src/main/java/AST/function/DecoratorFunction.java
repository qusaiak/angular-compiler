package AST.function;

import AST.Space;
import AST.expression.Expression;
import AST.statement.BlockStatement;

import java.util.List;

public class DecoratorFunction extends FunctionDeclaration {

    private String decorator;         // optional
    private String accessModifier;    // optional: "public", "private", etc.
    private boolean isFunctionKeywordPresent;
    private String functionName;
    private List<Expression> parameters;
    private BlockStatement blockStatement;

    public DecoratorFunction() {}

    // ✅ Getters and Setters
    public String getDecorator() {
        return decorator;
    }

    public void setDecorator(String decorator) {
        this.decorator = decorator;
    }

    public String getAccessModifier() {
        return accessModifier;
    }

    public void setAccessModifier(String accessModifier) {
        this.accessModifier = accessModifier;
    }

    public boolean isFunctionKeywordPresent() {
        return isFunctionKeywordPresent;
    }

    public void setFunctionKeywordPresent(boolean functionKeywordPresent) {
        isFunctionKeywordPresent = functionKeywordPresent;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public List<Expression> getParameters() {
        return parameters;
    }

    public void setParameters(List<Expression> parameters) {
        this.parameters = parameters;
    }

    public BlockStatement getBlockStatement() {
        return blockStatement;
    }

    public void setBlockStatement(BlockStatement blockStatement) {
        this.blockStatement = blockStatement;
    }

    // 🧾 toString: Structured Tree Format
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Decorator Function Declaration: {\n");
        Space.currentValue++;

        if (decorator != null)
            sb.append("\t".repeat(Space.currentValue)).append("Decorator: @").append(decorator).append(",\n");

        if (accessModifier != null)
            sb.append("\t".repeat(Space.currentValue)).append("Access Modifier: ").append(accessModifier).append(",\n");

        if (isFunctionKeywordPresent)
            sb.append("\t".repeat(Space.currentValue)).append("Keyword: function,\n");

        sb.append("\t".repeat(Space.currentValue)).append("Function Name: ").append(functionName).append(",\n");

        if (parameters != null && !parameters.isEmpty()) {
            sb.append("\t".repeat(Space.currentValue)).append("Parameters: {\n");
            Space.currentValue++;
            for (Expression param : parameters)
                sb.append("\t".repeat(Space.currentValue)).append(param.toString()).append(",\n");
            Space.currentValue--;
            sb.append("\t".repeat(Space.currentValue)).append("},\n");
        } else {
            sb.append("\t".repeat(Space.currentValue)).append("Parameters: {},\n");
        }

        if (blockStatement != null) {
            sb.append("\t".repeat(Space.currentValue)).append("Function Body: ").append(blockStatement.toString()).append("\n");
        } else {
            sb.append("\t".repeat(Space.currentValue)).append("Function Body: {}\n");
        }

        Space.currentValue--;
        sb.append("\t".repeat(Space.currentValue)).append("}");
        return sb.toString();
    }

    // 🚀 JS Conversion
    @Override
    public String convertToJs() {
        StringBuilder js = new StringBuilder();

        if (decorator != null)
            js.append("@").append(decorator).append("\n");

        if (accessModifier != null)
            js.append(accessModifier).append(" ");

        if (isFunctionKeywordPresent)
            js.append("function ");

        js.append(functionName).append("(");
        if (parameters != null && !parameters.isEmpty()) {
            for (int i = 0; i < parameters.size(); i++) {
                js.append(parameters.get(i).convertToJs());
                if (i < parameters.size() - 1)
                    js.append(", ");
            }
        }
        js.append(") ");

        if (blockStatement != null)
            js.append(blockStatement.convertToJs());

        return js.toString();
    }

    @Override
    public String convertToHtml() {
        return "";
    }

    @Override
    public String convertToCss() {
        return "";
    }
}
