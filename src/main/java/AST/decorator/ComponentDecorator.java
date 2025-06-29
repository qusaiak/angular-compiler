package AST.decorator;

import java.util.List;

public class ComponentDecorator extends Decorator {
    private List<DecoratorArgument> arguments;

    public ComponentDecorator( List<DecoratorArgument> arguments) {
        this.arguments = arguments;
    }

    public List<DecoratorArgument> getArguments() {
        return arguments;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("@").append("Component").append("({\n");
        for (DecoratorArgument arg : arguments) {
            sb.append("  ").append(arg.toString()).append(",\n");
        }
        sb.append("})");
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
        StringBuilder js = new StringBuilder("@").append("Component").append("({\n");
        for (DecoratorArgument arg : arguments) {
            js.append("  ").append(arg.convertToJs()).append(",\n");
        }
        js.append("})");
        return js.toString();
    }
}
