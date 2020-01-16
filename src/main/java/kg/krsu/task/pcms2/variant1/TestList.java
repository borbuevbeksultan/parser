package kg.krsu.task.pcms2.variant1;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name = "tests")
@XmlAccessorType(XmlAccessType.FIELD)
public class TestList {
    
    @XmlElement(name = "test")
    private List<Test> tests;
    
    @Data
    @XmlRootElement(name = "test")
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Test {
    
        @XmlAttribute
        private String verdict;
        
    }
}
