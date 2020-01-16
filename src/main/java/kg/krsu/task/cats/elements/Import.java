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
public class Import {
    
    @XmlAttribute(name = "guid")
    private String guid;
    
    @XmlAttribute(name = "type")
    private String type;
    
    @XmlAttribute(name = "name")
    private String name;
    
    @XmlValue
    private String value;
    
}
