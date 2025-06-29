package AST.decorator;

import AST.decorator.SelectorArgument;
import AST.decorator.TemplateArgument;
import AST.decorator.TemplateUrlArgument;


public abstract class DecoratorArgument {
private  SelectorArgument selectorArgument;
private  TemplateArgument templateArgument;
private  TemplateUrlArgument templateUrlArgument;


    DecoratorArgument(SelectorArgument selectorArgument, TemplateUrlArgument templateUrlArgument){
        this.selectorArgument=selectorArgument;
        this.templateUrlArgument=templateUrlArgument;
    }

    DecoratorArgument(SelectorArgument selectorArgument,TemplateArgument templateArgument){
        this.selectorArgument=selectorArgument;
        this.templateArgument=templateArgument;
    }

    protected DecoratorArgument() {
    }


    public abstract String toString();
    public abstract String convertToJs();
}
