package AST.declerations.exportDecleration;


public class ExportSpecifier {
    private String identifier;       // e.g. "MyVar"
    private String alias;            // e.g. "as MyAlias"
    private String decorator;        // e.g. "@Injectable" or "Component"

    public ExportSpecifier() {}

    public ExportSpecifier(String identifier, String alias, String decorator) {
        this.identifier = identifier;
        this.alias = alias;
        this.decorator = decorator;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getDecorator() {
        return decorator;
    }

    public void setDecorator(String decorator) {
        this.decorator = decorator;
    }

    @Override
    public String toString() {
        if (decorator != null) {
            return "Decorator Export: @" + decorator;
        }
        if (alias != null) {
            return identifier + " as " + alias;
        }
        return identifier;
    }

    public String convertToJs() {
        if (decorator != null) {
            return "@" + decorator;
        }
        if (alias != null) {
            return identifier + " as " + alias;
        }
        return identifier;
    }
}
