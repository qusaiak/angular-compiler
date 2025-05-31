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

    public void check(Program program) {
        try {
            FileWriter test = new FileWriter("semantic.txt");


            // Error Handling
            checkIfVariableAlreadyDefined();

            test.append("Semantic Check : \n");
            for (int i = 0; i < Errors.size(); i++) {
                test.append(Errors.get(i) + "\n");
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
                Map<String, Integer> top = checkScopes.isEmpty() ? new HashMap<>() : checkScopes.peek();
                if (top.getOrDefault(name, 0) > 0) {
                    // Error
                    Errors.add("Error: Variable '" + name + "' is already defined in scope " + scopeId);
                    System.out.println("Error: Variable '" + name + "' is already defined in scope " + scopeId);
                } else {
                    top.put(name, top.getOrDefault(name, 0) + 1);
                    checkScopes.push(top);
                }
            }
        }
    }

}
