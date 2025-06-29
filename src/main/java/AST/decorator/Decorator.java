package AST.decorator;

import AST.statement.Statement;

public abstract class Decorator extends Statement {
    protected ComponentDecorator componentDecorator;

    public ComponentDecorator getComponent() {
        return componentDecorator;
    }

    public void setComponent(ComponentDecorator componentDecorator) {
        this.componentDecorator = componentDecorator;
    }

    public abstract String toString();
    public abstract String convertToJs();
}
