package AST.declerations.variableDecleration;

import AST.Space;
import AST.expression.Expression;
import AST.helpers.type.TypeAnnotation;

public class VariableDeclarationConst {

    private VariableType variableType;
    private TypeAnnotation typeAnnotation;
    private Expression expression;

    public VariableDeclarationConst() {}

    public VariableType getVariableType() {
        return variableType;
    }

    public void setVariableType(VariableType variableType) {
        this.variableType = variableType;
    }

    public TypeAnnotation getTypeAnnotation() {
        return typeAnnotation;
    }

    public void setTypeAnnotation(TypeAnnotation typeAnnotation) {
        this.typeAnnotation = typeAnnotation;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Const Declaration: {\n");
        Space.currentValue++;

        sb.append("\t".repeat(Space.currentValue)).append("Variable = ")
                .append(variableType.toString()).append(",\n");

        if (typeAnnotation != null) {
            sb.append("\t".repeat(Space.currentValue)).append("Type = ")
                    .append(typeAnnotation.toString()).append(",\n");
        }

        if (expression != null) {
            sb.append("\t".repeat(Space.currentValue)).append("Value = ")
                    .append(expression.toString()).append(",\n");
        }

        Space.currentValue--;
        sb.append("\t".repeat(Space.currentValue)).append("},");
        return sb.toString();
    }

    public String convertToJs() {
        StringBuilder js = new StringBuilder();
        js.append(variableType.convertToJs());

        if (expression != null) {
            js.append(" = ").append(expression.convertToJs());
        }

        if (Space.isUseState) {
            js.append(";\n");
            js.append("window.").append(Space.valueUseState).append(" = window.")
                    .append(Space.valueUseState).append(" || ").append(Space.initialUseState).append(";\n");

            js.append("window.").append(Space.functionUseState)
                    .append(" = function ").append(Space.functionUseState)
                    .append("(").append(Space.functionUseState).append(") {\n");

            Space.currentValue++;
            js.append("\t".repeat(Space.currentValue)).append("window.")
                    .append(Space.valueUseState).append(" = ").append(Space.functionUseState).append(";\n");
            js.append("\t".repeat(Space.currentValue)).append("document.querySelector(\"#app\").innerHTML = App();\n");
            Space.currentValue--;
            js.append("};\n");
        }

        return js.toString();
    }

    public String convertToHtml() { return ""; }
    public String convertToCss() { return ""; }
}
