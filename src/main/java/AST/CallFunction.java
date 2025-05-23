package AST;

import java.util.List;
import java.util.Objects;

public class CallFunction {
    private final String functionName;
    private final List<Expression> arguments;

    public CallFunction(String functionName, List<Expression> arguments) {
        this.functionName = functionName;
        this.arguments = arguments;
    }

    public String getFunctionName() {
        return functionName;
    }

    public List<Expression> getArguments() {
        return arguments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CallFunction that = (CallFunction) o;
        return Objects.equals(functionName, that.functionName) &&
                Objects.equals(arguments, that.arguments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CallFunction: {\n");
        sb.append("  functionName='").append(functionName).append("'\n");
        if (arguments != null && !arguments.isEmpty()) {
            sb.append("  arguments=").append(arguments).append('\n');
        }
        sb.append("}");
        return sb.toString();
    }


}
