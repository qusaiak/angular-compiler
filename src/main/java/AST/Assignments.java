package AST;

public class Assignments {
    private String identifier;
    private Type type;
    private Value value;
    private CallFunction callFunction;
    private boolean isThisReference;

    // ✅ حالة تعريف المتغير مع نوعه (`ID COLON type SEMI`)
    public Assignments(String identifier, Type type) {
        this.identifier = identifier;
        this.type = type;
        this.isThisReference = false;
    }

    // ✅ حالة إسناد قيمة جديدة (`ID EQUAL value SEMI`)
    public Assignments(String identifier, Value value) {
        this.identifier = identifier;
        this.value = value;
        this.isThisReference = false;
    }

    // ✅ حالة إسناد باستخدام `callFunction`
    public Assignments(String identifier, CallFunction callFunction) {
        this.identifier = identifier;
        this.callFunction = callFunction;
        this.isThisReference = false;
    }

    // ✅ حالة الإسناد باستخدام `this.identifier = value أو callFunction`
    public Assignments(String identifier, Value value, CallFunction callFunction, boolean isThisReference) {
        this.identifier = identifier;
        this.value = value;
        this.callFunction = callFunction;
        this.isThisReference = isThisReference;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
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
        sb.append("  identifier='").append(identifier).append("'\n");
        if (type != null) {
            sb.append("  type=").append(type).append('\n');
        }
        if (value != null) {
            sb.append("  value=").append(value).append('\n');
        }
        if (callFunction != null) {
            sb.append("  callFunction=").append(callFunction).append('\n');
        }
        if (isThisReference) {
            sb.append("  reference='this.").append(identifier).append("'\n");
        }
        sb.append("}");
        return sb.toString();
    }
}
