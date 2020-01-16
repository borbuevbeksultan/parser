package kg.krsu.task.krsu.elements;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data

@XmlRootElement(name = "test")
@XmlAccessorType(XmlAccessType.FIELD)
public class Test {
    
    @XmlAttribute(name = "input")
    private String input;
    
    @XmlAttribute(name = "output")
    private String output;
    
    @XmlAttribute(name = "groupid")
    private Integer groupId;
    
    @XmlAttribute(name = "points")
    private String points;
    
}
