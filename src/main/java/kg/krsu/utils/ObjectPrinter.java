package kg.krsu.utils;

public class ObjectPrinter {
    
    public static void print(String name, Object input) {
        if (null == input) {
            return;
        }
    
        System.out.printf("%s: %s\n", name, input.toString());
    }
    
}
