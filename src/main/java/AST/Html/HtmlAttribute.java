package AST.Html;

import AST.Space;
import AST.expression.Expression;
import AST.helpers.object.ObjectDeclaration;


public class HtmlAttribute {

    private String htmlAttributeName;

    private ObjectDeclaration objectDeclaration;

    private String string;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public HtmlAttribute() {

    }

    public String getHtmlAttributeName() {
        return htmlAttributeName;
    }

    public void setHtmlAttributeName(String htmlAttributeName) {
        this.htmlAttributeName = htmlAttributeName;
    }

    public ObjectDeclaration getObjectDeclaration() {
        return objectDeclaration;
    }

    public void setObjectDeclaration(ObjectDeclaration objectDeclarationTY) {
        this.objectDeclaration = objectDeclarationTY;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("htmlAttributeInfo: {\n");
        Space.currentValue++;

        stringBuilder.append("\t".repeat(Space.currentValue)).append("htmlAttributeName: ").append(htmlAttributeName).append(",\n");

        if (objectDeclaration != null) {
            stringBuilder.append("\t".repeat(Space.currentValue)).append("htmlAttributeValue: ").append(objectDeclaration.toString()).append(",\n");
        }
        if (string != null) {
            stringBuilder.append("\t".repeat(Space.currentValue)).append("htmlAttributeValue: ").append(string).append(",\n");
        }

        Space.currentValue--;
        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");
        return stringBuilder.toString();

    }

    public String convertToHtml() {
        StringBuilder htmlBuilder = new StringBuilder();
        return htmlBuilder.toString();
    }

    public String convertToCss() {
        StringBuilder cssBuilder = new StringBuilder();
        return cssBuilder.toString();
    }

    public String convertToJs(boolean isHtmlTag) {
        StringBuilder jsBuilder = new StringBuilder();

        String name = "";
        if (htmlAttributeName != null) {
            name = htmlAttributeName;
        }
        if (name.equals("className")) {
            name = "class";
        }
        if (name.equals("onChange")) {
            name = "oninput";
        }
        if (name.equals("onClick")) {
            name = "onclick";
        }

        if (isHtmlTag) {
            if (!name.isEmpty() && objectDeclaration != null) {
                jsBuilder.append(" ").append(name).append("=").append("\"").append(objectDeclaration.convertToJs()).append("\"");
            } else if (!name.isEmpty() && string != null) {
                if (string.equals("\"search-bar\"")) {
                    Space.isSearchFound = true;
                }
                jsBuilder.append(" ").append(name).append("=").append(string);
            } else if (!name.isEmpty()) {
                jsBuilder.append(" ").append(name);
            }
        }
        else {
            if (!name.isEmpty() && objectDeclaration != null) {
                jsBuilder.append(name).append(": ").append(objectDeclaration.convertToJs());
            } else if (!name.isEmpty() && string != null) {
                jsBuilder.append(name).append(": ").append(string);
            } else if (!name.isEmpty()) {
                jsBuilder.append(name);
            }
        }
        return jsBuilder.toString();
    }

}
