package AST.declerations.importDecleration;


import AST.Space;
import java.util.List;

public class ImportNamedSpecifier extends ImportDeclaration {

    private List<ImportSpecifier> importSpecifiers;

    public ImportNamedSpecifier() {}

    public void setImportSpecifiers(List<ImportSpecifier> importSpecifiers) {
        this.importSpecifiers = importSpecifiers;
    }

    public List<ImportSpecifier> getImportSpecifiers() {
        return importSpecifiers;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ImportNamedSpecifier: {\n");
        Space.currentValue++;
        for (ImportSpecifier specifier : importSpecifiers) {
            sb.append("\t".repeat(Space.currentValue)).append(specifier.toString()).append(",\n");
        }
        Space.currentValue--;
        sb.append("\t".repeat(Space.currentValue)).append("}");
        return sb.toString();
    }

    @Override
    public String convertToJs() {
        StringBuilder js = new StringBuilder("{ ");
        for (int i = 0; i < importSpecifiers.size(); i++) {
            js.append(importSpecifiers.get(i).convertToJs());
            if (i < importSpecifiers.size() - 1) {
                js.append(", ");
            }
        }
        js.append(" }");
        return js.toString();
    }

    @Override public String convertToHtml() { return ""; }

    @Override public String convertToCss() { return ""; }
}
