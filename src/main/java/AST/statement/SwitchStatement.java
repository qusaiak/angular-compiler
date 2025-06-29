package AST.statement;

import AST.Space;
import AST.expression.Expression;
import AST.helpers.controlflow.CaseClause;
import AST.helpers.controlflow.DefaultClause;

import java.util.List;

public abstract class SwitchStatement extends Statement {
    private Expression switchExpr;
    private List<CaseClause> caseClauses;
    private DefaultClause defaultClause;

    public SwitchStatement() {}

    public Expression getSwitchExpr() {
        return switchExpr;
    }

    public void setSwitchExpr(Expression switchExpr) {
        this.switchExpr = switchExpr;
    }

    public List<CaseClause> getCaseClauses() {
        return caseClauses;
    }

    public void setCaseClauses(List<CaseClause> caseClauses) {
        this.caseClauses = caseClauses;
    }

    public DefaultClause getDefaultClause() {
        return defaultClause;
    }

    public void setDefaultClause(DefaultClause defaultClause) {
        this.defaultClause = defaultClause;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Switch Statement: {\n");
        Space.currentValue++;

        sb.append("\t".repeat(Space.currentValue))
                .append("Condition: ").append(switchExpr.toString()).append(",\n");

        if (caseClauses != null && !caseClauses.isEmpty()) {
            sb.append("\t".repeat(Space.currentValue)).append("Cases: [\n");
            Space.currentValue++;
            for (CaseClause clause : caseClauses) {
                sb.append("\t".repeat(Space.currentValue)).append(clause.toString()).append(",\n");
            }
            Space.currentValue--;
            sb.append("\t".repeat(Space.currentValue)).append("],\n");
        } else {
            sb.append("\t".repeat(Space.currentValue)).append("Cases: []\n");
        }

        if (defaultClause != null) {
            sb.append("\t".repeat(Space.currentValue))
                    .append("Default: ").append(defaultClause.toString()).append("\n");
        } else {
            sb.append("\t".repeat(Space.currentValue)).append("Default: {}\n");
        }

        Space.currentValue--;
        sb.append("\t".repeat(Space.currentValue)).append("}");
        return sb.toString();
    }

    @Override
    public String convertToJs() {
        StringBuilder js = new StringBuilder();
        js.append("switch (").append(switchExpr.convertToJs()).append(") {\n");

        for (CaseClause clause : caseClauses) {
            js.append(clause.convertToJs());
        }

        if (defaultClause != null) {
            js.append(defaultClause.convertToJs());
        }

        js.append("}\n");
        return js.toString();
    }
}
