package SymbolTable;

import java.util.ArrayList;
import java.util.List;

public class SymbolTable {
    private List<Row> rows = new ArrayList<>();
    private int currentScopeId = 0;

    public int getScopeId() {
        return currentScopeId;
    }

    public void enterScope() {
        currentScopeId++;
    }

    public void exitScope() {
        currentScopeId--;
        rows.removeIf(row -> row.getScopeId() > currentScopeId);
    }

    public void addVariable(Row row) {
        rows.add(row);
    }

    public void updateVariable(String variableName, String newValue) {
        for (Row row : rows) {
            if (row.getVariableName().equals(variableName) && row.getScopeId() <= currentScopeId) {
                row.setValue(newValue);
                return;
            }
        }
        System.out.println("Variable " + variableName + " does not exist in the current scope.");
    }

    public Row getVariable(String variableName) {
        for (Row row : rows) {
            if (row.getVariableName().equals(variableName)) {
                return row;
            }
        }
        return null;
    }

    public void removeVariable(String variableName) {
        rows.removeIf(row -> row.getVariableName().equals(variableName));
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Symbol Table:\n");
        stringBuilder.append("*".repeat(180)).append("\n");
        stringBuilder.append(String.format("| %-4s | %-10s | %-30s | %-30s | %-30s \n", "Line", "ScopeId", "Name", "Type", "Value"));
        stringBuilder.append("*".repeat(180)).append("\n");

        for (Row row : rows) {
            stringBuilder.append(String.format("| %-4d | %-10d | %-30s | %-30s | %-30s \n",
                    row.getLine(), row.getScopeId(), row.getVariableName(), row.getType(), row.getValue()));
        }

        stringBuilder.append("*".repeat(180)).append("\n");
        return stringBuilder.toString();
    }
}



//package SymbolTableStructure;
//
//import AST.Space;

//import java.util.*;
//
//public class SymbolTable {
//    private List<Row> rows = new ArrayList<>();
//
//    public List<Row> getRows() {
//        return rows;
//    }
//
//    public void setRows(List<Row> rows) {
//        this.rows = rows;
//    }
//
//    private int currentScopeId = 0;
//
//    public int getScopeId() {
//        return currentScopeId;
//    }
//
//    public void setScopeId(int scopeId) {
//        this.currentScopeId = scopeId;
//    }
//
//    public void enterScope() {
//        currentScopeId++;
//    }
//
//    public void exitScope() {
//        currentScopeId--;
//    }
//
//

//
//    @Override
//    public String toString() {
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append("Symbol Table:\n");
//        stringBuilder.append("*").append("*".repeat(180)).append("*\n");
//        stringBuilder.append(String.format("| %-4s | %-10s | %-65s | %-65s \n", "Line" , "Scope Id", "Variable Name", "Value"));
//        stringBuilder.append("*").append("*".repeat(180)).append("*\n");
//
//        // Find the maximum width needed for the fourth column
//        int maxThirdColumnWidth = 0;
//        for (Row row : rows) {
//            if (row != null) {
//                int valueLength = row.getValue().lines().mapToInt(String::length).max().orElse(0);
//                maxThirdColumnWidth = Math.max(maxThirdColumnWidth, valueLength);
//            }
//        }
//
//        for (Row row : rows) {
//            if (row != null) {
//                String[] valueLines = row.getValue().split("\\n");
//                int maxValueLines = Math.max(valueLines.length, 1);
//                for (int i = 0; i < maxValueLines; i++) {
//                    String valueLine = (i < valueLines.length) ? valueLines[i] : "";
//                    String variableName = (i == 0) ? row.getVariableName() : "";
//
//                    stringBuilder.append(String.format("| %-4s | %-10s | %-65s | %-65s  \n", (i == 0) ? row.getLine() : "" ,(i == 0) ? row.getScopeId() : "", variableName, valueLine + " ".repeat(maxThirdColumnWidth - valueLine.length())));
//                }
//                stringBuilder.append("*").append("*".repeat(180)).append("*\n");
//            }
//        }
//
//        return stringBuilder.toString();
//    }
//
//}
