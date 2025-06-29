package AST.Html;

import AST.Space;

import java.util.List;

public class HtmlContent {
    private static List<HtmlText> textElements;
    private static List<HtmlBody> htmlBodies;
    private static List<HtmlExpression> expressions;
    private static List<HtmlInterpolation> interpolations; // ✅ الجديد

    public HtmlContent() {}

    public List<HtmlText> getTextElements() {
        return textElements;
    }

    public void setTextElements(List<HtmlText> textElements) {
        this.textElements = textElements;
    }

    public List<HtmlBody> getHtmlBodies() {
        return htmlBodies;
    }

    public void setHtmlBodies(List<HtmlBody> htmlBodies) {
        this.htmlBodies = htmlBodies;
    }

    public List<HtmlExpression> getExpressions() {
        return expressions;
    }

    public void setExpressions(List<HtmlExpression> expressions) {
        this.expressions = expressions;
    }

    public List<HtmlInterpolation> getInterpolations() {
        return interpolations;
    }

    public void setInterpolations(List<HtmlInterpolation> interpolations) {
        this.interpolations = interpolations;
    }

    @Override
    public  String toString() {
        StringBuilder sb = new StringBuilder();

        if (!textElements.isEmpty()) {
            sb.append("Text Elements: {\n");
            Space.currentValue++;
            for (HtmlText htmlText : textElements) {
                sb.append("\t".repeat(Space.currentValue)).append(htmlText.toString()).append(",\n");
            }
            Space.currentValue--;
            sb.append("\t".repeat(Space.currentValue)).append("},\n");
        } else {
            sb.append("Text Elements: {}\n");
        }

        if (!htmlBodies.isEmpty()) {
            sb.append("\t".repeat(Space.currentValue)).append("HTML Bodies: {\n");
            Space.currentValue++;
            for (HtmlBody htmlBody : htmlBodies) {
                sb.append("\t".repeat(Space.currentValue)).append(htmlBody.toString()).append(",\n");
            }
            Space.currentValue--;
            sb.append("\t".repeat(Space.currentValue)).append("},\n");
        } else {
            sb.append("\t".repeat(Space.currentValue)).append("HTML Bodies: {}\n");
        }

        if (!expressions.isEmpty()) {
            sb.append("\t".repeat(Space.currentValue)).append("Html Expressions: {\n");
            Space.currentValue++;
            for (HtmlExpression htmlExpression : expressions) {
                sb.append("\t".repeat(Space.currentValue)).append(htmlExpression.toString()).append(",\n");
            }
            Space.currentValue--;
            sb.append("\t".repeat(Space.currentValue)).append("},\n");
        } else {
            sb.append("\t".repeat(Space.currentValue)).append("Html Expressions: {}\n");
        }

        if (!interpolations.isEmpty()) {
            sb.append("\t".repeat(Space.currentValue)).append("Interpolations: {\n");
            Space.currentValue++;
            for (HtmlInterpolation interp : interpolations) {
                sb.append("\t".repeat(Space.currentValue)).append(interp.toString()).append(",\n");
            }
            Space.currentValue--;
            sb.append("\t".repeat(Space.currentValue)).append("}\n");
        } else {
            sb.append("\t".repeat(Space.currentValue)).append("Interpolations: {}\n");
        }

        return sb.toString();
    }

    public String convertToHtml() {
        return ""; // optional
    }

    public String convertToCss() {
        return "";
    }

    public static String convertToJs() {
        StringBuilder jsBuilder = new StringBuilder();
        Space.currentValue++;

        for (HtmlText textElement : textElements) {
            jsBuilder.append("\t".repeat(Space.currentValue)).append(textElement.convertToJs()).append("\n");
        }

        for (HtmlBody htmlBody : htmlBodies) {
            jsBuilder.append("\t".repeat(Space.currentValue)).append(htmlBody.convertToJs()).append("\n");
        }

        for (HtmlExpression expression : expressions) {
            jsBuilder.append("\t".repeat(Space.currentValue)).append(expression.convertToJs()).append("\n");
        }

        for (HtmlInterpolation interp : interpolations) {
            jsBuilder.append("\t".repeat(Space.currentValue)).append(interp.convertToJs()).append("\n");
        }

        Space.currentValue--;
        return jsBuilder.toString();
    }
}
