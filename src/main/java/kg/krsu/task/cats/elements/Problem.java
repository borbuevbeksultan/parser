package kg.krsu.task.cats.elements;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import lombok.Data;

@Data

@XmlType(name = "Problem")
@XmlRootElement(name = "Problem")
@XmlAccessorType(XmlAccessType.FIELD)
public class Problem {
    
    //attributes
    @XmlAttribute(name = "title")
    private String title;
    
    @XmlAttribute(name = "lang")
    private List<String> lang;
    
    @XmlAttribute(name = "tlimit")
    private Long tLimit;
    
    @XmlAttribute(name = "mlimit")
    private String mLimit;
    
    @XmlAttribute(name = "wlimit")
    private String wLimit;
    
    @XmlAttribute(name = "author")
    private String author;
    
    @XmlAttribute(name = "inputFile")
    private String inputFile;
    
    @XmlAttribute(name = "outputFile")
    private String outputFile;
    
    @XmlAttribute(name = "difficulty")
    private Byte difficulty;
    
    @XmlAttribute(name = "stdChecker")
    private String stdChecker;
    
    @XmlAttribute(name = "maxPoint")
    private Double maxPoint;
    
    @XmlAttribute(name = "saveInputPrefix")
    private Double saveInputPrefix;
    
    @XmlAttribute(name = "saveOutputPrefix")
    private Double saveOutputPrefix;
    
    @XmlAttribute(name = "saveOutputPrefix")
    private Double saveAnswerPrefix;
    //attributes
    
    //elements
    @XmlElement(name = "Keyword")
    private Keyword keyword;
    
    @XmlElement(name = "ProblemStatement")
    private ProblemStatement problemStatement;
    
    @XmlElement(name = "ProblemConstraints")
    private String problemConstraints;
    
    @XmlElement(name = "InputFormat")
    private String inputFormat;
    
    @XmlElement(name = "OutputFormat")
    private String outputFormat;
    
    @XmlElement(name = "JsonData")
    private String jsonData;
    
    @XmlElement(name = "Explanation")
    private Explanation explanation;
    
    @XmlElement(name = "Checker")
    private Checker checker;
    
    @XmlElement(name = "Picture")
    private Picture picture;
    
    @XmlElement(name = "Attachment")
    private Attachment attachment;
    
    @XmlElement(name = "Solution")
    private Solution solution;
    
    @XmlElement(name = "Generator")
    private Generator generator;
    
    @XmlElement(name = "GeneratorRange")
    private GeneratorRange generatorRange;
    
    @XmlElement(name = "Visualizer")
    private Visualizer visualizer;
    
    @XmlElement(name = "Interactor")
    private Interactor interactor;
    
    @XmlElement(name = "Linter")
    private Linter linter;
    
    @XmlElement(name = "Run")
    private Run run;
    
    @XmlElement(name = "Test")
    private Test test;
    
    @XmlElement(name = "TestRange")
    private TestRange testRange;
    
    @XmlElement(name = "Testset")
    private Testset testSet;
    
    @XmlElement(name = "Module")
    private Module module;
    
    @XmlElement(name = "Import")
    private Import imPort;
    
    @XmlElement(name = "Sample")
    private List<Sample> samples;
    //elements
    
}
