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
public class Visualizer {
    
    @XmlAttribute(name = "name")
    private String name;
    
    @XmlAttribute(name = "src")
    private String source;
    
    @XmlAttribute(name = "de_code")
    private String deCode;
    
    @XmlAttribute(name = "export")
    private String export;
    
    @XmlValue
    private String value;
    
}
