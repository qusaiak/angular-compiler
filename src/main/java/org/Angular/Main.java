package org.Angular;

import AST.Program;
import ErrorHandling.SemanticCheck;
import Visitor.BaseVisitor;
import SymbolTable.SymbolTable;
import SymbolTable.SymbolTable2; // ✅ إضافة `SymbolTable2`

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.util.List;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {

    public static void main(String[] args) throws IOException {
        int testNumber = 7;
        String source = "src/tests/test" + testNumber + ".ts";
        CharStream cs = fromFileName(source);
        AngularLexer lexer = new AngularLexer(cs);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        AngularParser parser = new AngularParser(tokenStream);
        ParseTree tree = parser.program();

        // ✅ إنشاء جدول الرموز
        SymbolTable symbolTable = new SymbolTable();
        SymbolTable2 symbolTable2 = new SymbolTable2(); // ✅ إضافة `SymbolTable2`


        // ✅ إنشاء الزائر وربطه
        BaseVisitor baseVisitor = new BaseVisitor();
        baseVisitor.setSymbolTable(symbolTable);
        baseVisitor.setSymbolTable2(symbolTable2); // ✅ ربط `SymbolTable2`

        // ✅ زيارة الشجرة
        Program program = (Program) baseVisitor.visit(tree);



        // ✅ طباعة الـ AST
        System.out.println("\n******** AST TREE ********\n");
        print_ast(tree, 0);

        // ✅ طباعة البرنامج
        System.out.println("\n\n******** PROGRAM ********\n");
        System.out.println(program);

        // ✅ طباعة `SymbolTable` و `SymbolTable2`
        System.out.println("\n******** SYMBOL TABLE ********");
        System.out.println(symbolTable.toString());

        System.out.println("\n******** SYMBOL TABLE 2 ********");
        System.out.println(symbolTable2.toString()); // ✅ إضافة طباعة `SymbolTable2`
        SemanticCheck semanticCheck = new SemanticCheck();
        semanticCheck.setSymbolTable(baseVisitor.getSymbolTable());
        semanticCheck.check(program);
    }

    static void print_ast(ParseTree tree, int depth) {
        if (tree.getChildCount() != 0) {
            System.out.println(getIndent(depth) + tree.getClass().getSimpleName().replace("Context", ""));
            for (int i = 0; i < tree.getChildCount(); i++) {
                print_ast(tree.getChild(i), depth + 1);
            }
        }
    }

    private static String getIndent(int depth) {
        return "\t".repeat(Math.max(0, depth));
    }
}
