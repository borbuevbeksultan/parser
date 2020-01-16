package kg.krsu.task.cats.elements;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

import lombok.Data;

@Data

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class GeneratorRange {
    
    @XmlAttribute(name = "from")
    private Integer from;
    
    @XmlAttribute(name = "to")
    private Integer to;
    
    @XmlAttribute(name = "name")
    private String name;
    
    @XmlAttribute(name = "src")
    private String source;
    
    @XmlAttribute(name = "de_code")
    private String deCode;
    
    @XmlAttribute(name = "outputFile")
    private String outputFile;
    
    @XmlAttribute(name = "export")
    private String export;
    
    @XmlAttribute(name = "timeLimit")
    private Integer timeLimit;
    
    @XmlAttribute(name = "memoryLimit")
    private String memoryLimit;
    
    @XmlAttribute(name = "writeLimit")
    private String writeLimit;
    
    @XmlValue
    private String value;
    
}
