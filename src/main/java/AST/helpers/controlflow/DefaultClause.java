package AST.helpers.controlflow;

import AST.Space;
import AST.statement.Statement;

import java.util.List;

public class DefaultClause {
    private List<Statement> body;

    public DefaultClause() {}

    public List<Statement> getBody() {
        return body;
    }

    public void setBody(List<Statement> body) {
        this.body = body;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("default: {\n");
        Space.currentValue++;
        for (Statement stmt : body) {
            sb.append("\t".repeat(Space.currentValue)).append(stmt.toString()).append("\n");
        }
        Space.currentValue--;
        sb.append("\t".repeat(Space.currentValue)).append("}");
        return sb.toString();
    }

    public String convertToJs() {
        StringBuilder js = new StringBuilder();
        js.append("  default:\n");
        for (Statement stmt : body) {
            js.append("    ").append(stmt.convertToJs()).append("\n");
        }
        return js.toString();
    }
}
