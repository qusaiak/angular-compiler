package AST;

import java.util.List;
import java.util.Objects;

public class ForStatement {
    private final VariableDeclaration variableDeclaration;
    private final Condition condition;
    private final Statement body;

    public ForStatement(VariableDeclaration variableDeclaration, Condition condition, Statement body, List<Statement> statements) {
        this.variableDeclaration = variableDeclaration;
        this.condition = condition;
        this.body = body;
    }

    public VariableDeclaration getVariableDeclaration() {
        return variableDeclaration;
    }

    public Condition getCondition() {
        return condition;
    }

    public Statement getBody() {
        return body;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForStatement that = (ForStatement) o;
        return Objects.equals(variableDeclaration, that.variableDeclaration) &&
                Objects.equals(condition, that.condition) &&
                Objects.equals(body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(variableDeclaration, condition, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ForStatement: {\n");
        if (variableDeclaration != null) {
            sb.append("  variableDeclaration=").append(variableDeclaration).append("\n");
        }
        if (condition != null) {
            sb.append("  condition=").append(condition).append("\n");
        }
        if (body != null) {
            sb.append("  body=").append(body).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }

}
