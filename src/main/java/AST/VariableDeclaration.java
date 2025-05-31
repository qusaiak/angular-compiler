package AST;

public class VariableDeclaration {
    private String varType;
    private String id;
    private Type type;
    private Value value;
    private Array array;
    private Object object;
    private FunctionDeclaration functionDeclaration;

    public VariableDeclaration(String varType, String id, Value value) {
        this.varType = varType;
        this.id = id;
        this.value = value;
    }

    public VariableDeclaration(String varType, String id, Array array) {
        this.varType = varType;
        this.id = id;
        this.array = array;
    }
    public VariableDeclaration(String varType, String identifier) {
        this.varType = varType;
        this.id = identifier;
    }
    public VariableDeclaration(String varType, String id, Object object) {
        this.varType = varType;
        this.id = id;
        this.object = object;
    }

    public VariableDeclaration(String varType, String id, FunctionDeclaration functionDeclaration) {
        this.varType = varType;
        this.id = id;
        this.functionDeclaration = functionDeclaration;
    }

    public VariableDeclaration(String varType, String id, Type type, Value value) {
        this.varType = varType;
        this.id = id;
        this.type = type;
        this.value = value;
    }

    public String getVarType() {
        return varType;
    }

    public void setVarType(String varType) {
        this.varType = varType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Array getArray() {
        return array;
    }

    public void setArray(Array array) {
        this.array = array;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public FunctionDeclaration getFunctionDeclaration() {
        return functionDeclaration;
    }

    public void setFunctionDeclaration(FunctionDeclaration functionDeclaration) {
        this.functionDeclaration = functionDeclaration;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Variable Declaration: {");
        sb.append("\n  varType='").append(varType).append('\'');
        sb.append(",\n  id='").append(id).append('\'');
        if (type != null) {
            sb.append(",\n  type=").append(type);
        }
        if (value != null) {
            sb.append(",\n  value=").append(value);
        }
        if (array != null) {
            sb.append(",\n  array=").append(array);
        }
        if (object != null) {
            sb.append(",\n  object=").append(object);
        }
        if (functionDeclaration != null) {
            sb.append(",\n  functionDeclaration=").append(functionDeclaration);
        }
        sb.append("\n}");
        return sb.toString();
    }

}
