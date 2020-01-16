package kg.krsu.parser;

import java.util.HashMap;
import java.util.Map;

import kg.krsu.task.cats.Cat;
import kg.krsu.task.krsu.Krsu;

public class FormatResolver {
    
    public Map<String, Class<?>> formatToTypes;
    
    public FormatResolver() {
        this.formatToTypes = new HashMap<>();
        formatToTypes.put("KRSU", Krsu.class);
        formatToTypes.put("CATS", Cat.class);
    }
    
    Class<?> resolveType(String format) {
        return formatToTypes.get(format);
    }
    
}
