package AST.helpers.type;


import AST.statement.Statement;
import AST.helpers.InlineObjectType;

public class TypeAnnotation extends Statement {
    private String type; // مثل: string, number, etc.
    private boolean hasArraySuffix;
    private InlineObjectType inlineObjectType;
    private boolean isInlineObjectArray;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isHasArraySuffix() {
        return hasArraySuffix;
    }

    public void setHasArraySuffix(boolean hasArraySuffix) {
        this.hasArraySuffix = hasArraySuffix;
    }

    public InlineObjectType getInlineObjectType() {
        return inlineObjectType;
    }

    public void setInlineObjectType(InlineObjectType inlineObjectType) {
        this.inlineObjectType = inlineObjectType;
    }

    public boolean isInlineObjectArray() {
        return isInlineObjectArray;
    }

    public void setInlineObjectArray(boolean inlineObjectArray) {
        isInlineObjectArray = inlineObjectArray;
    }

    @Override
    public String toString() {
        if (inlineObjectType != null) {
            return inlineObjectType.toString() + (isInlineObjectArray ? "[]" : "");
        }
        return type + (hasArraySuffix ? "[]" : "");
    }

    @Override
    public String convertToJs() {
        return ""; // غالبًا ما يتم تجاهلها عند التوليد
    }

    @Override
    public String convertToHtml() {
        return "";
    }

    @Override
    public String convertToCss() {
        return "";
    }
}
