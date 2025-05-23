package AST;

import java.util.ArrayList;
import java.util.List;

public class Print {
    private List<String> expressions = new ArrayList<>();

    public Print(List<String> expressions) {
        this.expressions = expressions;
    }

    public List<String> getExpressions() {
        return expressions;
    }

    public void setExpressions(List<String> expressions) {
        this.expressions = expressions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PrintStatement: {\n");
        if (expressions != null && !expressions.isEmpty()) {
            sb.append("  expressions=").append(expressions).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }


}
