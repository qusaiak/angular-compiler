package AST;

import java.util.HashMap;
import java.util.Map;

public class object {
    private Map<String, Object> properties = new HashMap<>();

    public Map<String, Object> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }

    public void addProperty(String key, Object value) {
        properties.put(key, value);
    }

    @Override
    public String toString() {
        return "CustomObject: {\n" +
                "  properties=" + properties + "\n" +
                "}";
    }

}
