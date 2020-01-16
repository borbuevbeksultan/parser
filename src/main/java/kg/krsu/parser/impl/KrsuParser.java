package kg.krsu.parser.impl;

import static kg.krsu.utils.ObjectPrinter.print;

import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import kg.krsu.parser.Parser;
import kg.krsu.task.krsu.Krsu;
import kg.krsu.task.krsu.elements.GroupList;
import kg.krsu.task.krsu.elements.Test;

public class KrsuParser extends Parser {
    
    public Class<?> getType() {
        return Krsu.class;
    }
    
    @Override
    public void parse(final InputStream inputStream) throws JAXBException {
        final JAXBContext jaxbContext = super.contextProvider.get(getType());
        final Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        try {
            final Krsu result = ((Krsu) unmarshaller.unmarshal(inputStream));
            printResult(result);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
    
    private void printResult(Krsu krsu) {
        System.out.println("########### -- KRSU -- ###########");
        print("Problem", krsu.getProblem());
        print("Checker", krsu.getChecker());
        print("Interaction", krsu.getInteraction());
        print("Memory", krsu.getMemoryLimit());
        print("Time Limit", krsu.getTimeLimit());
        print("Test Version", krsu.getTestVersion());
        print("Run Type", krsu.getRunType());
    
        System.out.println("\n== Groups ==");
        for (final GroupList.Group group : krsu.getGroupLists().getGroups()) {
            print("    Id", group.getId());
            print("    Points", group.getPoints());
            print("    Prereq", group.getPrereq());
            System.out.println();
        }
    
        System.out.println("\n== Tests ==");
        for (final Test test : krsu.getTest()) {
            print("    GroupId", test.getGroupId());
            print("    Points", test.getPoints());
            print("    Input", test.getInput());
            print("    Output", test.getOutput());
            System.out.println();
        }
    }
    
}
