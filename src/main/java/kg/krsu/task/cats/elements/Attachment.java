package kg.krsu.task.cats.elements;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Attachment {
    
    @XmlAttribute(name = "name")
    private String name;
    
    @XmlAttribute(name = "src")
    private String source;
    
    @XmlAttribute(name = "value")
    private String value;
}
