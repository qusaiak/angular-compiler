package SymbolTable;

public class Row {
    private int line;
    private String variableName;
    private String type;
    private String value;
    private int scopeId;

    public Row(int line, String variableName, String type, String value, int scopeId) {
        this.line = line;
        this.variableName = variableName;
        this.type = type;
        this.value = value;
        this.scopeId = scopeId;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public String getVariableName() {
        return variableName;
    }

    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getScopeId() {
        return scopeId;
    }

    public void setScopeId(int scopeId) {
        this.scopeId = scopeId;
    }

    @Override
    public String toString() {
        return String.format("Row{ Line: %d, Scope ID: %d, Variable: '%s', Type: '%s', Value: '%s' }",
                line, scopeId, variableName, type, value);
    }
}
