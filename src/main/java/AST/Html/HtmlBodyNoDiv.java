package AST.Html;

import AST.Space;

import java.util.List;

public class HtmlBodyNoDiv extends HtmlBody{
    private String tagName;
    private List<HtmlAttribute> htmlAttributes;

    public HtmlBodyNoDiv() {
        this.tagName = tagName;
        this.htmlAttributes = htmlAttributes;
    }

    public String getTageName() {
        return tagName;
    }

    public void setTageName(String tagName) {
        this.tagName = tagName;
    }

    public List<HtmlAttribute> getHtmlAttributes() {
        return htmlAttributes;
    }

    public void setHtmlAttributes(List<HtmlAttribute> htmlAttributes) {
        this.htmlAttributes = htmlAttributes;
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Html Body: {\n");
        Space.currentValue++;

        if (tagName != null) {
            stringBuilder.append("\t".repeat(Space.currentValue)).append("Open Tag Name : ").append(tagName).append(",\n");
        }

        if (htmlAttributes.isEmpty()) {
            stringBuilder.append("\t".repeat(Space.currentValue)).append("Html Attributes: {}\n");
        }
        else {
            stringBuilder.append("\t".repeat(Space.currentValue)).append("Html Attributes: {\n");
            Space.currentValue++;
            for (HtmlAttribute htmlAttribute : htmlAttributes) {
                stringBuilder.append("\t".repeat(Space.currentValue)).append(htmlAttribute.toString()).append(",\n");
            }
            Space.currentValue--;
            stringBuilder.append("\t".repeat(Space.currentValue)).append("}\n");
        }


        Space.currentValue--;
        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");
        return stringBuilder.toString();

    }

    @Override
    public String convertToHtml() {
        StringBuilder stringBuilder = new StringBuilder();
        return stringBuilder.toString();
    }

    @Override
    public String convertToCss() {
        return "";
    }

    @Override
    public String convertToJs() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<").append(tagName);
        if (!htmlAttributes.isEmpty()) {
            Space.isHtmlAttr = true;
            for (HtmlAttribute attr : htmlAttributes) {
                stringBuilder.append(" ").append(attr.convertToJs(true));
            }
            Space.isHtmlAttr = false;
        }
        return stringBuilder.toString();
    }
}
