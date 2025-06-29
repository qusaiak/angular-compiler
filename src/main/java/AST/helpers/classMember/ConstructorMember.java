package AST.helpers.classMember;


import AST.Space;
import AST.statement.BlockStatement;
import AST.helpers.Parameter;

import java.util.List;

public class ConstructorMember extends ClassMember {
    private List<Parameter> parameters;
    private BlockStatement body;

    public ConstructorMember() {}

    public List<Parameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }

    public BlockStatement getBody() {
        return body;
    }

    public void setBody(BlockStatement body) {
        this.body = body;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Constructor: (\n");
        Space.currentValue++;
        if (parameters != null) {
            sb.append("\t".repeat(Space.currentValue)).append("Parameters: ").append(parameters.toString()).append(",\n");
        }
        if (body != null) {
            sb.append("\t".repeat(Space.currentValue)).append("Body: ").append(body.toString()).append("\n");
        }
        Space.currentValue--;
        sb.append("\t".repeat(Space.currentValue)).append(")");
        return sb.toString();
    }

    @Override
    public String convertToHtml() {
        return "";
    }

    @Override
    public String convertToCss() {
        return "";
    }

    @Override
    public String convertToJs() {
        StringBuilder js = new StringBuilder("constructor(");
        if (parameters != null) {
            for (int i = 0; i < parameters.size(); i++) {
                js.append(parameters.get(i).convertToJs());
                if (i < parameters.size() - 1) js.append(", ");
            }
        }
        js.append(") ");
        if (body != null) {
            js.append(body.convertToJs());
        }
        return js.toString();
    }
}
