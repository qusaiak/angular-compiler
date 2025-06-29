package AST.declerations.importDecleration;


import AST.Space;

public class ImportDefaultSpecifier extends ImportDeclaration {

    private String identifierOrString;

    public ImportDefaultSpecifier() {
        super();
    }

    public String getIdentifierOrString() {
        return identifierOrString;
    }

    public void setIdentifierOrString(String identifierOrString) {
        this.identifierOrString = identifierOrString;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ImportDefaultSpecifier: {\n");
        Space.currentValue++;
        sb.append("\t".repeat(Space.currentValue))
                .append("Value = ").append(identifierOrString != null ? identifierOrString : "").append(",\n");
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
        return identifierOrString != null ? identifierOrString : "";
    }
}
