package ErrorHandling;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import AST.Program;
import SymbolTable.Row;
import SymbolTable.SymbolTable;


public class SemanticCheck {

    public static List<String> Errors = new ArrayList<>();

    SymbolTable symbolTable = new SymbolTable();

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    Stack<Map<String, Integer>> checkScopes = new Stack<>();

    public Stack<Map<String, Integer>> getCheckScopes() {
        return checkScopes;
    }

    public void setCheckScopes(Stack<Map<String, Integer>> checkScopes) {
        this.checkScopes = checkScopes;
    }

    // checkIfVariableIsDefinedAndConst
    private final Map<String, Boolean> usedConstVariables = new HashMap<>();

    // checkIfVariableUsedNotDefined

    private Map<String, Boolean> declaredVariables = new HashMap<>();
    public Map<String, Boolean> getDeclaredVariables() {
        return declaredVariables;
    }

    public void setDeclaredVariables(Map<String, Boolean> declaredVariables) {
        declaredVariables = declaredVariables;
    }

    public void setOneDeclaredVariable(String variableName) {
        this.declaredVariables.put(variableName, true);
    }
    public void check(Program program) {
        try {
            FileWriter test = new FileWriter("semantic.txt");


            // Error Handling
            checkIfVariableAlreadyDefined();

            // print Errors
            printErrors();

            test.append("Semantic Check : \n");
            for (int i = 0; i < Errors.size(); i++) {
                test.append(Errors.get(i)).append("\n");
            }
            test.flush();
            test.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void checkIfVariableAlreadyDefined() {
        List<Row> variables = symbolTable.getRows();
        if (!variables.isEmpty()) {
            int cur = 0;
            checkScopes.push(new HashMap<>());
            for (Row row : variables) {
                int line = row.getLine();
                int scopeId = row.getScopeId();
                String name = row.getVariableName();
                while (cur < scopeId) {
                    cur++;
                    checkScopes.push(new HashMap<>());
                }
                while (cur > scopeId) {
                    checkScopes.pop();
                    cur--;
                }
                Map<String, Integer> top = checkScopes.peek();
                if (top.getOrDefault(name, 0) > 0) {
                    // Error
                    Errors.add("Line " + line + ": (Error: Variable '" + name + "' is already defined in scope " + scopeId + ").");
                } else {
                    top.put(name, top.getOrDefault(name, 0) + 1);
                }
            }
        }

    }
    public void checkIfVariableUsedNotDefined(String variableUsedName){
        if (!this.declaredVariables.getOrDefault(variableUsedName, false)) {
            Errors.add("Error: Variable '" + variableUsedName + "' is used but not defined.");
        }
    }
    //    public void checkIfVariableIsConst(String variableUsedName, int linqe) {
//        if (this.usedConstVariables.getOrDefault(variableUsedName, false)) {
//            Errors.add("Line "+ line + ": (Error: You cannot assign a value to a constant variable: " + variableUsedName + ").");
//        }
//    }
    private void printErrors() {
        for (String errors: Errors) {
            System.out.println(errors);
        }
    }
}