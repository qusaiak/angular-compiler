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
            int curScope = 0;
            checkScopes.push(new HashMap<>());

            for (Row row : variables) {
                int scopeId = row.getScopeId();
                String name = row.getVariableName();
                String type = row.getType();
                boolean isAssignment = row.getValue() != null; // ✅ التحقق مما إذا كان مجرد إسناد قيمة وليس تعريف جديد

                while (curScope < scopeId) {
                    curScope++;
                    checkScopes.push(new HashMap<>());
                }
                while (curScope > scopeId) {
                    checkScopes.pop();
                    curScope--;
                }

                Map<String, Integer> topScope = checkScopes.isEmpty() ? new HashMap<>() : checkScopes.peek();

                // ✅ السماح بإعادة تعيين قيمة المتغير لكن منع إعادة تعريفه
                if (topScope.containsKey(name) && !isAssignment) {
                    Errors.add("Error: Variable '" + name + "' is already defined in scope " + scopeId);
                    System.out.println("Error: Variable '" + name + "' is already defined in scope " + scopeId);
                } else {
                    topScope.put(name, topScope.getOrDefault(name, 0) + 1);
                    checkScopes.push(topScope);
                }
            }
        }
    }


        public void checkIfVariableUsedNotDefined(String variableUsedName){
            if (!this.declaredVariables.getOrDefault(variableUsedName, false)) {
                Errors.add("Error: Variable '" + variableUsedName + "' is used but not defined.");
            }
        }

    private void printErrors() {
        for (String errors: Errors) {
            System.out.println(errors);
        }
    }
}
