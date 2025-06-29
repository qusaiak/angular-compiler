package AST.helpers.classMember;

import AST.statement.Statement;

public abstract class ClassMember extends Statement {
    public abstract String toString();
    public abstract String convertToJs();
}
