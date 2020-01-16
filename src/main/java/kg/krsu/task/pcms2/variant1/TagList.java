package kg.krsu.task.pcms2.variant1;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name = "tags")
@XmlAccessorType(XmlAccessType.FIELD)
public class TagList {
    
    @XmlElement(name = "tag")
    private List<Tag> tags;
    
    @Data
    @XmlRootElement(name = "tag")
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Tag {
    
        @XmlAttribute(name = "value")
        private String value;
        
    }
    
}
