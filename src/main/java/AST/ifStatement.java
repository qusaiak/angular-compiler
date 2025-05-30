package AST;

import java.util.List;
import java.util.Objects;

public class ifStatement {
    private final Condition condition;
    private final List<Statement> thenStatements;
    private final List<Statement> elseStatements;

    public ifStatement(Condition condition, List<Statement> thenStatements, List<Statement> elseStatements) {
        this.condition = condition;
        this.thenStatements = thenStatements;
        this.elseStatements = elseStatements;
    }

    public Condition getCondition() {
        return condition;
    }

    public List<Statement> getThenStatements() {
        return thenStatements;
    }

    public List<Statement> getElseStatements() {
        return elseStatements;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ifStatement that = (ifStatement) o;
        return Objects.equals(condition, that.condition) &&
                Objects.equals(thenStatements, that.thenStatements) &&
                Objects.equals(elseStatements, that.elseStatements);
    }

    @Override
    public int hashCode() {
        return Objects.hash(condition, thenStatements, elseStatements);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ifStatement: {\n");
        if (condition != null) {
            sb.append("  condition=").append(condition).append("\n");
        }
        if (thenStatements != null && !thenStatements.isEmpty()) {
            sb.append("  thenStatements=").append(thenStatements).append("\n");
        }
        if (elseStatements != null && !elseStatements.isEmpty()) {
            sb.append("  elseStatements=").append(elseStatements).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }

}