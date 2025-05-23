package SymbolTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class SymbolTable {
    private final Map<String, Object> symbolTable;
    public SymbolTable() {
        this.symbolTable = new HashMap<>();
    }
    public void addVariable(String variableName, Object value) {
        symbolTable.put(variableName, value);
    }
    public void updateVariable(String variableName, Object newValue) {
        if (symbolTable.containsKey(variableName)) {
        symbolTable.put(variableName, newValue); }
        else {
            System.out.println("Variable " + variableName + " does not exist in the symbol table.");
        } }
    public Object getValue(String variableName) {
        if (symbolTable.containsKey(variableName)) {
            return symbolTable.get(variableName); }
        else { System.out.println("Variable " + variableName + " does not exist in the symbol table.");
            return null; } }
    @Override public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Symbol Table:\n");
        stringBuilder.append("*").append("*".repeat(180)).append("*\n");
        stringBuilder.append(String.format("| %-10s | %-65s | %-65s \n", "ID", "Variable Name", "Value"));
        stringBuilder.append("*").append("*".repeat(180)).append("*\n");
        Map<String, Integer> keyIdMap = new HashMap<>();

    for (Map.Entry<String, Object> entry : symbolTable.entrySet()) {
        String key = entry.getKey();
        if (!keyIdMap.containsKey(key)) {
            keyIdMap.put(key, keyIdMap.size() + 1);
        }
    }
        for (Map.Entry<String, Object> entry : symbolTable.entrySet()) {
            String key = entry.getKey();
            if (!keyIdMap.containsKey(key)) {
                keyIdMap.put(key, keyIdMap.size() + 1);
            }
        }
        for (Map.Entry<String, Object> entry : symbolTable.entrySet()) {
            String value = String.valueOf(entry.getValue());
            String[] valueLines = value.split("\\n");
            int maxValueLines = Math.max(valueLines.length, 1);
            String[] variableNameLines = entry.getKey().split("\\n");
            int maxVariableNameLines = Math.max(variableNameLines.length, 1);
            int maxLines = Math.max(maxValueLines, maxVariableNameLines);
            int keyId = keyIdMap.get(entry.getKey());
            stringBuilder.append(String.format("| %-10s | %-65s | %-65s \n", keyId, variableNameLines[0], valueLines[0]));
            for (int i = 1; i < maxLines; i++) {
                stringBuilder.append(String.format("| %-10s | %-65s | %-65s \n", "",
                        (i < variableNameLines.length) ? variableNameLines[i] : "",
                        (i < valueLines.length) ? valueLines[i] : ""));
            }
            stringBuilder.append("*").append("*".repeat(180)).append("*\n"); }
        return stringBuilder.toString();
    }
}
