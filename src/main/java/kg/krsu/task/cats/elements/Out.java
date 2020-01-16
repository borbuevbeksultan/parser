package kg.krsu.task.cats.elements;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Out {
    
    @XmlAttribute(name = "use")
    private String use;
    
    @XmlAttribute(name = "source")
    private String source;
    
}
