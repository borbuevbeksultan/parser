package kg.krsu.task.cats.elements;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class In {
    
    @XmlAttribute(name = "use")
    private String use;
    
    @XmlAttribute(name = "param")
    private String param;
    
    @XmlAttribute(name = "src")
    private String source;
    
    @XmlAttribute(name = "genAll")
    private String genAll;
    
    @XmlAttribute(name = "validate")
    private String validate;
    
    @XmlAttribute(name = "hash")
    private String hash;
}
