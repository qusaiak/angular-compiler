package AST.helpers.type;


import java.util.List;

public class InlineObjectType {
    private List<TypeMember> members;
    private String fallbackValue; // قيمة OR1 value، إن وجدت

    public List<TypeMember> getMembers() {
        return members;
    }

    public void setMembers(List<TypeMember> members) {
        this.members = members;
    }

    public String getFallbackValue() {
        return fallbackValue;
    }

    public void setFallbackValue(String fallbackValue) {
        this.fallbackValue = fallbackValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{ ");
        for (int i = 0; i < members.size(); i++) {
            sb.append(members.get(i).toString());
            if (i < members.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(" }");
        if (fallbackValue != null) {
            sb.append(" | ").append(fallbackValue);
        }
        return sb.toString();
    }

    public String convertToJs() {
        return ""; // optional إذا كنت ما تستعمل الأنواع بالـ JS
    }
}
