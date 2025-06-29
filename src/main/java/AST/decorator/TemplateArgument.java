package AST.decorator;

import AST.Html.HtmlBody;

public class TemplateArgument extends DecoratorArgument {
    private  HtmlBody htmlBody;

     TemplateArgument(HtmlBody htmlBody) {

        this.htmlBody = htmlBody;

    }

    @Override
    public String toString() {
        return "template: `\n" + htmlBody.toString() + "\n`";
    }

    @Override
    public String convertToJs() {
        return "template: `\n" + htmlBody.convertToJs() + "\n`";
    }
}
