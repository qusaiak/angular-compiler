package AST;

import java.util.ArrayList;
import java.util.List;

public class Type {
    private String typeName;

    public Type(String typeName) {
        this.typeName = typeName;
    }

    public static List<Type> getAllTypes() {
        List<Type> types = new ArrayList<>();
        types.add(new Type("ID"));
        types.add(new Type("STRING"));
        types.add(new Type("INT"));
        types.add(new Type("DOUBLE"));
        types.add(new Type("BOOLEAN"));
        types.add(new Type("ANY"));
        types.add(new Type("PUBLIC"));
        types.add(new Type("PRIVATE"));
        types.add(new Type("VOID"));
        types.add(new Type("NUMBER"));
        types.add(new Type("NULL"));
        return types;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "Type: {\n" +
                "  typeName='" + typeName + "'\n" +
                "}";
    }

}
