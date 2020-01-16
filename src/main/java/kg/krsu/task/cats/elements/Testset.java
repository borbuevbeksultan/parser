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
public class Testset {
    
    @XmlAttribute(name = "name")
    private String name;
    
    @XmlAttribute(name = "tests")
    private String tests;
    
    @XmlAttribute(name = "points")
    private Integer points;
    
    @XmlAttribute(name = "hideDetails")
    private String hideDetails;
    
    @XmlAttribute(name = "comment")
    private String comment;
    
    @XmlAttribute(name = "depends_on")
    private String dependsOn;
    
    @XmlValue
    private String value;
}
