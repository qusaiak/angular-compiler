package AST.helpers.classMember;


import AST.Space;
import AST.declerations.variableDecleration.VariableDeclaration;
import AST.decorator.Decorator;

import java.util.List;

public class DecoratedProperty extends ClassMember {
    private List<Decorator> decorators;
    private VariableDeclaration variable;

    public DecoratedProperty() {}

    public List<Decorator> getDecorators() {
        return decorators;
    }

    public void setDecorators(List<Decorator> decorators) {
        this.decorators = decorators;
    }

    public VariableDeclaration getVariable() {
        return variable;
    }

    public void setVariable(VariableDeclaration variable) {
        this.variable = variable;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Decorated Property: {\n");
        Space.currentValue++;
        if (decorators != null) {
            sb.append("\t".repeat(Space.currentValue)).append("Decorators: ").append(decorators.toString()).append(",\n");
        }
        sb.append("\t".repeat(Space.currentValue)).append("Variable: ").append(variable.toString()).append("\n");
        Space.currentValue--;
        sb.append("\t".repeat(Space.currentValue)).append("}");
        return sb.toString();
    }

    @Override
    public String convertToHtml() {
        return "";
    }

    @Override
    public String convertToCss() {
        return "";
    }

    @Override
    public String convertToJs() {
        StringBuilder js = new StringBuilder();
        if (decorators != null) {
            for (Decorator d : decorators) {
                js.append(d.convertToJs()).append("\n");
            }
        }
        js.append(variable.convertToJs());
        return js.toString();
    }
}
