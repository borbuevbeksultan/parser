package kg.krsu.task.pcms2.variant1;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name = "validators")
@XmlAccessorType(XmlAccessType.FIELD)
public class ValidatorList {
    
    @XmlElement(name = "validator")
    private List<Validator> validators;
    
    @Data
    @XmlRootElement(name = "validator")
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Validator {
    
        @XmlElement(name = "source")
        private Source source;
        
        @XmlElement(name = "source")
        private Binary  binary;
    
        @XmlElement(name = "testset")
        private TestSet testSet;
        
        @Data
        @XmlRootElement(name = "testset")
        @XmlAccessorType(XmlAccessType.FIELD)
        public static class TestSet {
            
            @XmlElement(name = "test-count")
            private String testCount;
    
            @XmlElement(name = "input-path-pattern")
            private String inputPathPattern;
    
            @XmlElement(name = "tests")
            private TestList testList;
        }
        
    }
    
}
