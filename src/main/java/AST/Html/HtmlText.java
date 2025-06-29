package AST.Html;

public class HtmlText {
    private String text;

    public HtmlText()
    {

    }

    public String getText()
    {
        return text;
    }

    public void setText(String text)
    {
        this.text = text;
    }

    @Override
    public  String toString() {
        return text;
    }

    public String convertToHtml() {
        StringBuilder htmlBuilder = new StringBuilder();
        return htmlBuilder.toString();
    }

    public String convertToCss() {
        StringBuilder cssBuilder = new StringBuilder();
        return cssBuilder.toString();
    }

    public String convertToJs() {
        StringBuilder jsBuilder = new StringBuilder();
        jsBuilder.append(text);
        return jsBuilder.toString();
    }
}
