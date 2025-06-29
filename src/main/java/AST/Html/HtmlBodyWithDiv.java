package AST.Html;

import AST.Space;

import java.util.List;

public class HtmlBodyWithDiv extends HtmlBody {
    private String openTagName;
    private List<HtmlAttribute> htmlAttributes;
    private HtmlContent htmlContent;
    private String closeTagName;

    public HtmlBodyWithDiv() {
        this.openTagName = openTagName;
        this.htmlContent = htmlContent;
        this.closeTagName = closeTagName;
    }

    public String getOpenTagName() {
        return openTagName;
    }

    public void setOpenTagName(String identifier) {
        this.openTagName = identifier;
    }

    public List<HtmlAttribute> getHtmlAttributes() {
        return htmlAttributes;
    }

    public void setHtmlAttributes(List<HtmlAttribute> htmlAttributes) {
        this.htmlAttributes = htmlAttributes;
    }

    public HtmlContent getHtmlContent() {
        return htmlContent;
    }

    public void setHtmlContent(HtmlContent htmlContent) {
        this.htmlContent = htmlContent;
    }

    public String getCloseTagName() {
        return closeTagName;
    }

    public void setCloseTagName(String closeTagName) {
        this.closeTagName = closeTagName;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Html Body: {\n");
        Space.currentValue++;

        if (openTagName != null) {
            stringBuilder.append("\t".repeat(Space.currentValue)).append("Open Tag Name : ").append(openTagName).append(",\n");
        }

        if (htmlAttributes.isEmpty()) {
            stringBuilder.append("\t".repeat(Space.currentValue)).append("Html Attributes: {}\n");
        } else {
            stringBuilder.append("\t".repeat(Space.currentValue)).append("Html Attributes: {\n");
            Space.currentValue++;
            for (HtmlAttribute htmlAttribute : htmlAttributes) {
                stringBuilder.append("\t".repeat(Space.currentValue)).append(htmlAttribute.toString()).append(",\n");
            }
            Space.currentValue--;
            stringBuilder.append("\t".repeat(Space.currentValue)).append("}\n");
        }

        if (htmlContent == null) {
            stringBuilder.append("\t".repeat(Space.currentValue)).append("Html Content: {}\n");
        } else {
            stringBuilder.append("\t".repeat(Space.currentValue)).append("Html Content: {\n");
            Space.currentValue++;
            stringBuilder.append("\t".repeat(Space.currentValue)).append(HtmlContent.toString());
            Space.currentValue--;
            stringBuilder.append("\t".repeat(Space.currentValue)).append("}\n");
        }

        if (closeTagName != null) {
            stringBuilder.append("\t".repeat(Space.currentValue)).append("Close Tag Name : ").append(closeTagName).append(",\n");
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
        StringBuilder jsBuilder = new StringBuilder();

        if (openTagName != null) {
            jsBuilder.append("<").append(openTagName);
        }
        if (!htmlAttributes.isEmpty()) {
            Space.isHtmlAttr = true;
            for (HtmlAttribute attr : htmlAttributes) {
                jsBuilder.append(attr.convertToJs(true));
            }
            Space.isHtmlAttr = false;
        }
        if (openTagName != null) {
            jsBuilder.append(">\n");
        }
        if (htmlContent != null) {
            jsBuilder.append(HtmlContent.convertToJs());
        }
        if (closeTagName != null) {
            jsBuilder.append("\t".repeat(Space.currentValue)).append("</").append(closeTagName).append(">");
        }
        return jsBuilder.toString();
    }
}
