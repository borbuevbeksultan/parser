package kg.krsu.task.cats.elements;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class TestRange {
    
    @XmlAttribute(name = "from")
    private String from;
    
    @XmlAttribute(name = "to")
    private String to;
    
    @XmlAttribute(name = "points")
    private String points;
    
    @XmlElement(name = "In")
    private In in;
    
    @XmlElement(name = "Out")
    private Out out;
    
}
