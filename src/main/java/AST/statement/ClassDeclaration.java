package AST.statement;

import AST.Space;
import AST.expression.Expression;
import AST.helpers.classMember.ClassMember;

import java.util.List;

public class ClassDeclaration extends Statement {

    private String className;
    private Expression extendedClass;
    private List<String> implementsList; // new
    private List<ClassMember> classMembers; // new

    public ClassDeclaration() {}

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Expression getExtendedClass() {
        return extendedClass;
    }

    public void setExtendedClass(Expression extendedClass) {
        this.extendedClass = extendedClass;
    }

    public List<String> getImplementsList() {
        return implementsList;
    }

    public void setImplementsList(List<String> implementsList) {
        this.implementsList = implementsList;
    }

    public List<ClassMember> getClassMembers() {
        return classMembers;
    }

    public void setClassMembers(List<ClassMember> classMembers) {
        this.classMembers = classMembers;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Class Declaration: {\n");
        Space.currentValue++;

        sb.append("\t".repeat(Space.currentValue)).append("ClassName: ").append(className).append(",\n");

        if (extendedClass != null) {
            sb.append("\t".repeat(Space.currentValue)).append("Extends: ").append(extendedClass.toString()).append(",\n");
        }

        if (implementsList != null && !implementsList.isEmpty()) {
            sb.append("\t".repeat(Space.currentValue)).append("Implements: ").append(implementsList.toString()).append(",\n");
        }

        if (classMembers == null || classMembers.isEmpty()) {
            sb.append("\t".repeat(Space.currentValue)).append("Class Body: {}\n");
        } else {
            sb.append("\t".repeat(Space.currentValue)).append("Class Body: {\n");
            Space.currentValue++;
            for (ClassMember member : classMembers) {
                sb.append("\t".repeat(Space.currentValue)).append(member.toString()).append(",\n");
            }
            Space.currentValue--;
            sb.append("\t".repeat(Space.currentValue)).append("}\n");
        }

        Space.currentValue--;
        sb.append("\t".repeat(Space.currentValue)).append("}");
        return sb.toString();
    }

    @Override
    public String convertToHtml() {
        return "";
    }

    @Override
    public String convertToCss() {
        return "";
    }

    @Override
    public String convertToJs() {
        StringBuilder js = new StringBuilder();
        js.append("class ").append(className);
        if (extendedClass != null) {
            js.append(" extends ").append(extendedClass.convertToJs());
        }
        if (implementsList != null && !implementsList.isEmpty()) {
            js.append(" implements ");
            for (int i = 0; i < implementsList.size(); i++) {
                js.append(implementsList.get(i));
                if (i < implementsList.size() - 1) {
                    js.append(", ");
                }
            }
        }
        js.append(" {\n");
        if (classMembers != null) {
            for (ClassMember member : classMembers) {
                js.append(member.convertToJs()).append("\n");
            }
        }
        js.append("}");
        return js.toString();
    }
}
