package AST;

import java.util.List;

public class Value {
    private String stringValue;
    private Integer intValue;
    private Double doubleValue;
    private Boolean booleanValue;
    private Object nestedObject;
    private List<Value> nestedArray;
    private JsxElement jsxElement;
    private angularDirective directive;
    private boolean isNull;

    public Value(String stringValue) {
        this.stringValue = stringValue;
    }

    public Value(Integer intValue) {
        this.intValue = intValue;
    }

    public Value(Double doubleValue) {
        this.doubleValue = doubleValue;
    }

    public Value(Boolean booleanValue) {
        this.booleanValue = booleanValue;
    }

    public Value(object nestedObject) {
        this.nestedObject = nestedObject;
    }

    public Value(List<Value> nestedArray) {
        this.nestedArray = nestedArray;
    }

    public Value(JsxElement jsxElement) {
        this.jsxElement = jsxElement;
    }

    public Value(angularDirective directive) {
        this.directive = directive;
    }

    public Value(boolean isNull) {
        this.isNull = isNull;
    }

    public angularDirective getDirective() {
        return directive;
    }

    public void setDirective(angularDirective directive) {
        this.directive = directive;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (stringValue != null) {
            sb.append(stringValue).append('\'');
        } else if (intValue != null) {
            sb.append("\n  intValue=").append(intValue);
        } else if (doubleValue != null) {
            sb.append("\n  doubleValue=").append(doubleValue);
        } else if (booleanValue != null) {
            sb.append("\n  booleanValue=").append(booleanValue);
        } else if (nestedObject != null) {
            sb.append("\n  nestedObject=").append(nestedObject);
        } else if (nestedArray != null && !nestedArray.isEmpty()) {
            sb.append("\n  nestedArray=").append(nestedArray);
        } else if (jsxElement != null) {
            sb.append("\n  jsxElement=").append(jsxElement);
        } else if (directive != null) {
            sb.append("\n  directive=").append(directive);
        } else if (isNull) {
            sb.append("\n  isNull=").append(isNull);
        }
        return sb.toString();
    }


}
