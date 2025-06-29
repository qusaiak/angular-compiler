package AST.declerations.exportDecleration;


import AST.Space;
import AST.statement.ExportStatement;

import java.util.List;

public class ExportListDeclaration extends ExportStatement {
    private String className; // OPTIONAL if starts with "export class ClassName"
    private List<ExportSpecifier> specifiers;
    private String fromModule; // e.g., from "module"

    public ExportListDeclaration() {}

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<ExportSpecifier> getSpecifiers() {
        return specifiers;
    }

    public void setSpecifiers(List<ExportSpecifier> specifiers) {
        this.specifiers = specifiers;
    }

    public String getFromModule() {
        return fromModule;
    }

    public void setFromModule(String fromModule) {
        this.fromModule = fromModule;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ExportListDeclaration: {\n");
        Space.currentValue++;
        if (className != null) {
            sb.append("\t".repeat(Space.currentValue)).append("Class Exported: ").append(className).append(",\n");
        }

        if (specifiers != null && !specifiers.isEmpty()) {
            sb.append("\t".repeat(Space.currentValue)).append("Specifiers: [\n");
            Space.currentValue++;
            for (ExportSpecifier spec : specifiers) {
                sb.append("\t".repeat(Space.currentValue)).append(spec.toString()).append(",\n");
            }
            Space.currentValue--;
            sb.append("\t".repeat(Space.currentValue)).append("],\n");
        }

        if (fromModule != null) {
            sb.append("\t".repeat(Space.currentValue)).append("From: ").append(fromModule).append(",\n");
        }
        Space.currentValue--;
        sb.append("\t".repeat(Space.currentValue)).append("}");
        return sb.toString();
    }

    @Override
    public String convertToJs() {
        StringBuilder js = new StringBuilder("export ");

        if (className != null) {
            js.append("class ").append(className).append(" ");
        }

        if (specifiers != null && !specifiers.isEmpty()) {
            js.append("{ ");
            for (int i = 0; i < specifiers.size(); i++) {
                js.append(specifiers.get(i).convertToJs());
                if (i < specifiers.size() - 1) {
                    js.append(", ");
                }
            }
            js.append(" }");
        }

        if (fromModule != null) {
            js.append(" from ").append(fromModule);
        }

        js.append(";");
        return js.toString();
    }

    @Override public String convertToHtml() { return ""; }

    @Override public String convertToCss() { return ""; }
}
