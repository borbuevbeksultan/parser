package kg.krsu.task.pcms2.variant1;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name = "properties")
@XmlAccessorType(XmlAccessType.FIELD)
public class PropertyList {
    
    @XmlElement(name = "property")
    private List<Property> properties;
    
    @Data
    @XmlRootElement(name = "property")
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Property {
        
        @XmlAttribute(name = "name")
        private String name;
        
        @XmlAttribute(name = "value")
        private String value;
        
    }
    
}
