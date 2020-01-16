package kg.krsu.task.pcms2.variant1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import lombok.Data;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "assets")
public class AssetList {
    
    @XmlElement(name = "checker")
    private Checker checker;
    
    @XmlElement(name = "validators")
    private ValidatorList validatorList;
    
    @XmlElement(name = "solutions")
    private SolutionList solutionList;
    
    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlRootElement(name = "checker")
    public static class Checker {
        
        @XmlAttribute(name = "name")
        private String name;
        
        @XmlAttribute(name = "type")
        private String type;
    
        @XmlElement(name = "source")
        private Source source;
    
        @XmlElement(name = "binary")
        private Binary binary;
    
        @XmlElement(name = "copy")
        private Copy copy;
    
        @XmlElement(name = "testset")
        private TestSet testSet;
    
        @Data
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlRootElement(name = "copy")
        public static class Copy {
    
            @XmlAttribute
            private String path;
            
        }
    
        @Data
        @XmlType(name = "CheckerTestset")
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlRootElement(name = "testset")
        public static class TestSet {
            
            @XmlElement
            private String source;
        
            @XmlElement(name = "input-path-pattern")
            private String inputPathPattern;
        
            @XmlElement(name = "output-path-pattern")
            private String outputPathPattern;
        
            @XmlElement(name = "answer-path-pattern")
            private String answerPathPattern;
        
        }
        
    }
    
}
