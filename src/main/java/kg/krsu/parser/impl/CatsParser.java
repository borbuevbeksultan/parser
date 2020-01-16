package kg.krsu.parser.impl;

import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import kg.krsu.parser.Parser;
import kg.krsu.task.cats.Cat;
import kg.krsu.task.cats.elements.Problem;
import kg.krsu.utils.ObjectPrinter;

public class CatsParser extends Parser {
    
    public Class<?> getType() {
        return Cat.class;
    }
    
    @Override
    public void parse(final InputStream inputStream) throws JAXBException {
        final JAXBContext jaxbContext = super.contextProvider.get(getType());
        final Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        try {
            final Cat result = ((Cat) unmarshaller.unmarshal(inputStream));
            printResult(result);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    
    }
    
    private void printResult(Cat cat) {
        final Problem p = cat.getProblem();
        System.out.println("##############--CATS --##############");
        ObjectPrinter.print("Title", p.getTitle());
        ObjectPrinter.print("Time Limit", p.getTLimit());
        ObjectPrinter.print("Memory Limit", p.getMLimit());
        ObjectPrinter.print("wLimit", p.getWLimit());
        ObjectPrinter.print("Author", p.getAuthor());
        ObjectPrinter.print("Input File", p.getInputFile());
        ObjectPrinter.print("Output File", p.getOutputFile());
        ObjectPrinter.print("Difficulty", p.getDifficulty());
        
        ObjectPrinter.print("Std Checker", p.getStdChecker());
        ObjectPrinter.print("Max Point", p.getMaxPoint());
        ObjectPrinter.print("Save Input Prefix", p.getSaveInputPrefix());
        ObjectPrinter.print("Save Output Prefix", p.getSaveOutputPrefix());
        ObjectPrinter.print("Save Answer Prefix", p.getSaveAnswerPrefix());
        
        
        ObjectPrinter.print("Save Answer Prefix", p.getSaveAnswerPrefix());
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        
        System.out.println(gson.toJson(cat));
    }
    
}
