package AST.Html;

import AST.Space;
import AST.expression.Expression;

public class HtmlInterpolation extends HtmlBody {
    private Expression expression;

    public HtmlInterpolation() {}

    public HtmlInterpolation(Expression expression) {
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Interpolation: {{ ");
        if (expression != null) {
            sb.append(expression.toString());
        }
        sb.append(" }}");
        return sb.toString();
    }

    @Override
    public String convertToHtml() {
        // غالبًا ما بدي يظهر مباشرة كـ HTML، فراغ
        return "";
    }

    @Override
    public String convertToCss() {
        return "";
    }

    @Override
    public String convertToJs() {
        return "${" + (expression != null ? expression.convertToJs() : "") + "}";
    }
}
