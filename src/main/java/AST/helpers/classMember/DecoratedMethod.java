package AST.helpers.classMember;


import AST.Space;
import AST.decorator.Decorator;
import AST.statement.ClassDeclaration;

import java.util.List;

public class DecoratedMethod extends ClassMember {
    private List<Decorator> decorators;
    private ClassDeclaration method;

    public DecoratedMethod() {}

    public List<Decorator> getDecorators() {
        return decorators;
    }

    public void setDecorators(List<Decorator> decorators) {
        this.decorators = decorators;
    }

    public ClassDeclaration getMethod() {
        return method;
    }

    public void setMethod(ClassDeclaration method) {
        this.method = method;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Decorated Method: {\n");
        Space.currentValue++;
        if (decorators != null) {
            sb.append("\t".repeat(Space.currentValue)).append("Decorators: ").append(decorators.toString()).append(",\n");
        }
        sb.append("\t".repeat(Space.currentValue)).append("Method: ").append(method.toString()).append("\n");
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
        js.append(method.convertToJs());
        return js.toString();
    }
}
