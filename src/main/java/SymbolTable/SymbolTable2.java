package SymbolTable;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable2 {
    private final Map<String, Row> symbolTable;
    private int currentScopeId = 0;

    public SymbolTable2() {
        this.symbolTable = new HashMap<>();
    }
    public void setScopeId( ) {
        this.currentScopeId = this.currentScopeId+1;
    }
    public int getScopeId() {
        return currentScopeId;
    }

    public void enterScope() {
        currentScopeId++;
    }

    public void exitScope() {
        currentScopeId--;
        symbolTable.entrySet().removeIf(entry -> entry.getValue().getScopeId() > currentScopeId);
    }

    public void addVariable(int line, String variableName, String type, String value,int currentScopeId) {
        Row row = new Row(line, variableName, type, value, currentScopeId);
        symbolTable.put(variableName, row);
    }

    public void updateVariable(String variableName, String newValue) {
        if (symbolTable.containsKey(variableName) && symbolTable.get(variableName).getScopeId() <= currentScopeId) {
            symbolTable.get(variableName).setValue(newValue);
        } else {
            System.out.println("Variable " + variableName + " does not exist in the current scope.");
        }
    }

    public Row getVariable(String variableName) {
        return symbolTable.getOrDefault(variableName, null);
    }

    public void removeVariable(String variableName) {
        symbolTable.remove(variableName);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Symbol Table:\n");
        stringBuilder.append("*".repeat(180)).append("\n");
        stringBuilder.append(String.format("| %-4s | %-10s | %-30s | %-30s | %-30s \n", "Line", "ScopeId", "Name", "Type", "Value"));
        stringBuilder.append("*".repeat(180)).append("\n");

        for (Row row : symbolTable.values()) {
            stringBuilder.append(String.format("| %-4d | %-10d | %-30s | %-30s | %-30s \n",
                    row.getLine(), row.getScopeId(), row.getVariableName(), row.getType(), row.getValue()));
        }

        stringBuilder.append("*".repeat(180)).append("\n");
        return stringBuilder.toString();
    }
}
