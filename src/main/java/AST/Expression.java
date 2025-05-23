package AST;

public class Expression {
    private Value value;
    private String id;
    private String complexId;
    private CallFunction callFunction;
    private angularDirective directive;
    private Expression left;
    private Expression right;
    private AST.operation operation;

    public Expression(String text) {
        this.id = text;
    }

    public Expression(int i) {
    }

    public Expression(Expression left, Expression right, AST.operation op) {
        this.left = left;
        this.right = right;
        this.operation = op;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public String getId() {
        return id;
    }


    public String getComplexId() {
        return complexId;
    }

    public void setComplexId(String complexId) {
        this.complexId = complexId;
    }

    public CallFunction getCallFunction() {
        return callFunction;
    }

    public void setCallFunction(CallFunction callFunction) {
        this.callFunction = callFunction;
    }

    public angularDirective getDirective() {
        return directive;
    }

    public void setDirective(angularDirective directive) {
        this.directive = directive;
    }

    public Expression getLeft() {
        return left;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public Expression getRight() {
        return right;
    }

    public void setRight(Expression right) {
        this.right = right;
    }

    public operation getOperation() {
        return operation;
    }

    public void setOperation(operation operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Expression: {\n");
        if (value != null) {
            sb.append("  value=").append(value).append("\n");
        }
        if (id != null) {
            sb.append("  id='").append(id).append("'\n");
        }
        if (complexId != null) {
            sb.append("  complexId='").append(complexId).append("'\n");
        }
        if (callFunction != null) {
            sb.append("  callFunction=").append(callFunction).append("\n");
        }
        if (directive != null) {
            sb.append("  directive=").append(directive).append("\n");
        }
        if (left != null && right != null && operation != null) {
            sb.append("  left=").append(left).append("\n");
            sb.append("  operation=").append(operation).append("\n");
            sb.append("  right=").append(right).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }

}
