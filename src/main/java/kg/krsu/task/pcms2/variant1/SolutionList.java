package kg.krsu.task.pcms2.variant1;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name = "solutions")
@XmlAccessorType(XmlAccessType.FIELD)
public class SolutionList {
    
    @XmlElement(name = "solution")
    private List<Solution> solutions;
    
    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlRootElement(name = "solution")
    public static class Solution {
        
        @XmlAttribute(name = "tag")
        private String tag;
    
        @XmlElement(name = "source")
        private Source source;
        
        @XmlElement(name = "binary")
        private Binary binary;
        
    }
    
}
