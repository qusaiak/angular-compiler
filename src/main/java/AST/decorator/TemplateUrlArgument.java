package AST.decorator;

public class TemplateUrlArgument extends DecoratorArgument {
    private String path;

    TemplateUrlArgument(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "templateUrl: \"" + path + "\"";
    }

    @Override
    public String convertToJs() {
        return "templateUrl: \"" + path + "\"";
    }
}
