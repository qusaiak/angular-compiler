package AST.helpers.controlflow;

import AST.Space;
import AST.expression.Expression;
import AST.statement.Statement;

import java.util.List;

public class CaseClause {
    private Expression condition;
    private List<Statement> body;

    public CaseClause() {}

    public Expression getCondition() {
        return condition;
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
    }

    public List<Statement> getBody() {
        return body;
    }

    public void setBody(List<Statement> body) {
        this.body = body;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("case ").append(condition.toString()).append(": {\n");
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
        js.append("  case ").append(condition.convertToJs()).append(":\n");
        for (Statement stmt : body) {
            js.append("    ").append(stmt.convertToJs()).append("\n");
        }
        return js.toString();
    }
}
