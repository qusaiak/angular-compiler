package AST.Html;

import AST.Space;

import java.util.List;
public class HtmlBodyNestedDiv extends HtmlBody{
    private String tagName;
    private List<HtmlAttribute> HtmlAttributes;
    private HtmlContent htmlContent;

    public HtmlBodyNestedDiv() {
        this.tagName = tagName;
        this.HtmlAttributes = HtmlAttributes;
        this.htmlContent = htmlContent;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public List<HtmlAttribute> getHtmlAttributes() {
        return HtmlAttributes;
    }

    public void setHtmlAttributes(List<HtmlAttribute> HtmlAttributes) {
        this.HtmlAttributes = HtmlAttributes;
    }

    public HtmlContent getHtmlContent() {
        return htmlContent;
    }

    public void setHtmlContent(HtmlContent htmlContent) {
        this.htmlContent = htmlContent;
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

        if (htmlContent == null) {
            stringBuilder.append("\t".repeat(Space.currentValue)).append("Html Content: {}\n");
        }
        else {
            stringBuilder.append("\t".repeat(Space.currentValue)).append("Html Content: {\n");
            Space.currentValue++;
            stringBuilder.append("\t".repeat(Space.currentValue)).append(HtmlContent.toString());
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
        boolean isHtmlTag = Character.isLowerCase(tagName.charAt(0));
        if (!isHtmlTag) {
            Space.isNotComponentParametersCall = false;
        }
        if (isHtmlTag) {
            stringBuilder.append("<").append(tagName);
            Space.isHtmlAttr = true;
            for (HtmlAttribute attr : HtmlAttributes) {
                stringBuilder.append(attr.convertToJs(isHtmlTag));
            }
            Space.isHtmlAttr = false;
            stringBuilder.append(" />");

            Space.currentValue++;
            if (htmlContent != null) {
                stringBuilder.append("\t".repeat(Space.currentValue)).append(HtmlContent.convertToJs());
            }
            Space.currentValue--;
        } else {
            stringBuilder.append("${").append(tagName).append("(");
            if (!HtmlAttributes.isEmpty()) {
                stringBuilder.append("{ ");
            }
            for (int i = 0; i < HtmlAttributes.size(); i++) {
                HtmlAttribute attr = HtmlAttributes.get(i);
                stringBuilder.append(attr.convertToJs(isHtmlTag));
                if (i < HtmlAttributes.size() - 1) {
                    stringBuilder.append(", ");
                }
            }
            if (!HtmlAttributes.isEmpty()) {
                stringBuilder.append(" }");
            }
            stringBuilder.append(")}");
        }
        Space.isNotComponentParametersCall = true;
        return stringBuilder.toString();
    }

}
