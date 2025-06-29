package AST.Html;

import AST.Space;

import java.util.List;
public class HtmlBodyDivAlone extends HtmlBody{
    private String tagName;
    private List<HtmlAttribute> HtmlAttributes;

    public HtmlBodyDivAlone() {
        this.tagName = tagName;
        this.HtmlAttributes = HtmlAttributes;
    }

    public String getTageName() {
        return tagName;
    }

    public void setTageName(String tagName) {
        this.tagName = tagName;
    }

    public List<HtmlAttribute> getHtmlAttributes() {
        return HtmlAttributes;
    }

    public void setHtmlAttributes(List<HtmlAttribute> HtmlAttributes) {
        this.HtmlAttributes = HtmlAttributes;
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Html Body: {\n");
        Space.currentValue++;

        if (tagName != null) {
            stringBuilder.append("\t".repeat(Space.currentValue)).append("Open Tag Name : ").append(tagName).append(",\n");
        }

        if (HtmlAttributes.isEmpty()) {
            stringBuilder.append("\t".repeat(Space.currentValue)).append("Html Attributes: {}\n");
        }
        else {
            stringBuilder.append("\t".repeat(Space.currentValue)).append("Html Attributes: {\n");
            Space.currentValue++;
            for (HtmlAttribute htmlAttribute : HtmlAttributes) {
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
        if (!HtmlAttributes.isEmpty()) {
            Space.isHtmlAttr = true;
            for (HtmlAttribute attr : HtmlAttributes) {
                stringBuilder.append(" ").append(attr.convertToJs(true));
            }
            Space.isHtmlAttr = false;
        }
        return stringBuilder.toString();
    }
}
