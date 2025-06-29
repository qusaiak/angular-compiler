package AST.decorator;

public class SelectorArgument extends DecoratorArgument {
    private String value;

     SelectorArgument(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "selector: \"" + value + "\"";
    }

    @Override
    public String convertToJs() {
        return "selector: \"" + value + "\"";
    }
}
