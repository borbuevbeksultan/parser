package kg.krsu.parser;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

public class ContextProvider {
    
    private Map<Class<?>, JAXBContext> contexts;
    
    public ContextProvider() {
        this.contexts = new HashMap<>();
    }
    
    public JAXBContext get(Class<?> type) {
        JAXBContext jaxbContext = null;
        if (contexts.get(type) == null) {
            try {
                jaxbContext = JAXBContext.newInstance(type);
                contexts.put(type, jaxbContext);
            } catch (JAXBException e) {
                System.out.println("Can't create JAXBContext for class " + type.getCanonicalName() + "Cause: " + e.getMessage());
            }
        }
        return jaxbContext;
    }
    
}
