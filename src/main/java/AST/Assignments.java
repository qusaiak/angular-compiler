package AST;

import java.util.List;

public class Assignments {
    private List<String> identifiers; // Support multiple ID declarations
    private Type type;
    private Value value;
    private CallFunction callFunction;
    private boolean isThisReference;

    // ✅ `Assignment_Type` : Supports multiple `(ID COLON type)+ SEMI`
    public Assignments(List<String> identifiers, Type type) {
        this.identifiers = identifiers;
        this.type = type;
        this.isThisReference = false;
    }

    // ✅ `Assignment_Value2` : Handles `ID EQUAL value SEMI`
    public Assignments(String identifier, Value value) {
        this.identifiers = List.of(identifier);
        this.value = value;
        this.isThisReference = false;
    }

    // ✅ `Assignment_Value` : Handles `THIS DOT ID = value or THIS DOT ID DOT callFunction`
    public Assignments(String identifier, Value value, CallFunction callFunction, boolean isThisReference) {
        this.identifiers = List.of(identifier);
        this.value = value;
        this.callFunction = callFunction;
        this.isThisReference = isThisReference;
    }

    // ✅ `Assignment_Value` (THIS DOT ID case)
    public Assignments(String identifier, boolean isThisReference, Value value, CallFunction callFunction) {
        this.identifiers = List.of(identifier);
        this.value = value;
        this.callFunction = callFunction;
        this.isThisReference = isThisReference;
    }

    public Assignments(String s, CallFunction callFunction) {
    }

    public List<String> getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers(List<String> identifiers) {
        this.identifiers = identifiers;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public CallFunction getCallFunction() {
        return callFunction;
    }

    public void setCallFunction(CallFunction callFunction) {
        this.callFunction = callFunction;
    }

    public boolean isThisReference() {
        return isThisReference;
    }

    public void setThisReference(boolean thisReference) {
        isThisReference = thisReference;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Assignment: {\n");
        sb.append("  identifiers=").append(identifiers).append("\n");
        if (type != null) {
            sb.append("  type=").append(type).append("\n");
        }
        if (value != null) {
            sb.append("  value=").append(value).append("\n");
        }
        if (callFunction != null) {
            sb.append("  callFunction=").append(callFunction).append("\n");
        }
        if (isThisReference) {
            sb.append("  reference='this.").append(identifiers.get(0)).append("'\n");
        }
        sb.append("}");
        return sb.toString();
    }
}
