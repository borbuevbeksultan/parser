package kg.krsu.parser;

import java.io.InputStream;

import javax.xml.bind.JAXBException;

public abstract class Parser {
    
    protected ContextProvider contextProvider;
    
    public Parser() {
        this.contextProvider = new ContextProvider();
    }
    
    public abstract Class<?> getType();
    
    public abstract void parse(InputStream inputStream) throws JAXBException;
    
}
