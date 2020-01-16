package kg.krsu.task.pcms2.variant1;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name = "names")
@XmlAccessorType(XmlAccessType.FIELD)
public class NameList {
    
    @XmlElement(name = "name")
    private List<Name> names;
    
    @Data
    @XmlRootElement(name = "name")
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Name {
        
        @XmlAttribute(name = "language")
        private String language;
    
        @XmlAttribute(name = "value")
        private String name;
        
    }
    
}
