package AST.expression;

import AST.Space;
import AST.statement.Statement;

public class BreakStatementExpression extends Statement {

    public BreakStatementExpression() {}

    @Override
    public String toString() {
        return "BreakStatement";
    }

    @Override
    public String convertToJs() {
        return "\t".repeat(Space.currentValue) + "break;";
    }

    @Override
    public String convertToHtml() {
        return "";
    }

    @Override
    public String convertToCss() {
        return "";
    }
}
