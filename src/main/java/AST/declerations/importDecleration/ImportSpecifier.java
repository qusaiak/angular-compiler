package AST.declerations.importDecleration;


public class ImportSpecifier {

    private String originalName;
    private String alias;

    public ImportSpecifier() {}

    public ImportSpecifier(String originalName, String alias) {
        this.originalName = originalName;
        this.alias = alias;
    }

    public String getOriginalName() {
        return originalName;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public String toString() {
        if (alias != null && !alias.isEmpty()) {
            return "ImportSpecifier: { " + originalName + " as " + alias + " }";
        } else {
            return "ImportSpecifier: { " + originalName + " }";
        }
    }

    public String convertToJs() {
        if (alias != null && !alias.isEmpty()) {
            return originalName + " as " + alias;
        } else {
            return originalName;
        }
    }

    public String convertToHtml() { return ""; }

    public String convertToCss() { return ""; }
}
