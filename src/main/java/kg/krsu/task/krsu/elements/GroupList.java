package kg.krsu.task.krsu.elements;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data

@XmlRootElement(name = "groups")
@XmlAccessorType(XmlAccessType.FIELD)
public class GroupList {
    
    @XmlElement(name = "group")
    private List<Group> groups;
    
    @Data
    @XmlRootElement(name = "group")
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Group {
        
        @XmlAttribute(name = "id")
        private String id;
        
        @XmlAttribute(name = "points")
        private Integer points;
        
        @XmlAttribute(name = "prereq")
        private String prereq;
        
    }
    
}
