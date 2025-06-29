package AST.declerations.variableDecleration;

import AST.Space;
import AST.expression.Expression;
import AST.helpers.type.TypeAnnotation;

public class VariableDeclaration {

    private VariableType variableType;
    private TypeAnnotation typeAnnotation;
    private Expression expression;

    public VariableDeclaration() {}

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
        StringBuilder sb = new StringBuilder("Variable Declaration: {\n");
        Space.currentValue++;

        sb.append("\t".repeat(Space.currentValue)).append("Variable = ")
                .append(variableType.toString()).append(",\n");

        if (typeAnnotation != null) {
            sb.append("\t".repeat(Space.currentValue)).append("Type = ")
                    .append(typeAnnotation.toString()).append(",\n");
        }

        if (expression != null) {
            sb.append("\t".repeat(Space.currentValue)).append("Assigned Value = ")
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
        return js.toString();
    }
}
