package AST;

import java.util.List;
import java.util.Objects;

public class WhileStatement {
    private final Condition condition;
    private final List<Statement> body;

    public WhileStatement(Condition condition, List<Statement> body) {
        this.condition = condition;
        this.body = body;
    }

    public Condition getCondition() {
        return condition;
    }

    public List<Statement> getBody() {
        return body;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WhileStatement that = (WhileStatement) o;
        return Objects.equals(condition, that.condition) &&
                Objects.equals(body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(condition, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("WhileStatement: {\n");
        sb.append("  condition=").append(condition).append("\n");
        if (body != null && !body.isEmpty()) {
            sb.append("  body=").append(body).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }

}
