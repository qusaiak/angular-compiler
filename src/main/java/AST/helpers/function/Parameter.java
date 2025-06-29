package AST.helpers.function;

import AST.expression.Expression;

public class Parameter {

    private String accessModifier;
    private String name;
    private String typeAnnotation;
    private Expression defaultValue;

    public Parameter() {}

    public String getAccessModifier() {
        return accessModifier;
    }

    public void setAccessModifier(String accessModifier) {
        this.accessModifier = accessModifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeAnnotation() {
        return typeAnnotation;
    }

    public void setTypeAnnotation(String typeAnnotation) {
        this.typeAnnotation = typeAnnotation;
    }

    public Expression getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(Expression defaultValue) {
        this.defaultValue = defaultValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (accessModifier != null) sb.append(accessModifier).append(" ");
        sb.append(name);
        if (typeAnnotation != null) sb.append(": ").append(typeAnnotation);
        if (defaultValue != null) sb.append(" = ").append(defaultValue.toString());
        return sb.toString();
    }

    public String convertToJs() {
        StringBuilder js = new StringBuilder();
        js.append(name);
        if (defaultValue != null) {
            js.append(" = ").append(defaultValue.convertToJs());
        }
        return js.toString();
    }
}
