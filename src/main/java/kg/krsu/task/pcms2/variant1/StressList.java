package kg.krsu.task.pcms2.variant1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "stresses")
public class StressList {
    
    @XmlElement(name = "stress-count")
    private String stressCount;
    
    @XmlElement(name = "stress-path-pattern")
    private String stressPathPattern;
    
}
