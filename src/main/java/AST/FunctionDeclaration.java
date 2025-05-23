package AST;

import java.util.List;

public class FunctionDeclaration {
    private String id;
    private List<Parameter> parameters;
    private Type returnType;
    private FunctionBody functionBody;

    public FunctionDeclaration(String id, List<Parameter> parameters, Type returnType, FunctionBody functionBody) {
        this.id = id;
        this.parameters = parameters;
        this.returnType = returnType;
        this.functionBody = functionBody;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Parameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }

    public Type getReturnType() {
        return returnType;
    }

    public void setReturnType(Type returnType) {
        this.returnType = returnType;
    }

    public FunctionBody getFunctionBody() {
        return functionBody;
    }

    public void setFunctionBody(FunctionBody functionBody) {
        this.functionBody = functionBody;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FunctionDeclaration: {\n");
        sb.append("  id='").append(id).append("'\n");
        if (parameters != null && !parameters.isEmpty()) {
            sb.append("  parameters=").append(parameters).append("\n");
        }
        if (returnType != null) {
            sb.append("  returnType=").append(returnType).append("\n");
        }
        if (functionBody != null) {
            sb.append("  functionBody=").append(functionBody).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }


}
