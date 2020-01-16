package kg.krsu.task.cats.elements;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Checker {
    
    @XmlAttribute(name = "name")
    private String name;
    
    @XmlAttribute(name = "src")
    private String source;
    
    @XmlAttribute(name = "de_code")
    private String deCode;
    
    @XmlAttribute(name = "style")
    private String style;
    
    @XmlAttribute(name = "export")
    private String export;
    
    @XmlAttribute(name = "timeLimit")
    private String timeLimit;
    
    @XmlAttribute(name = "memoryLimit")
    private String memoryLimit;
    
    @XmlAttribute(name = "writeLimit")
    private String writeLimit;
    
    @XmlAttribute(name = "value")
    private String value;
    
}
