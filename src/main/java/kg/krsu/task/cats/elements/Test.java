package kg.krsu.task.cats.elements;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data

@XmlRootElement(name = "Test")
@XmlAccessorType(XmlAccessType.FIELD)
public class Test {
    
    @XmlAttribute(name = "points")
    private String points;
    
    @XmlAttribute(name = "rank")
    private String rank;
    
    @XmlElement(name = "testRange")
    private TestRange testRange;
    
}
