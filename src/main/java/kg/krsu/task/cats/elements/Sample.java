package kg.krsu.task.cats.elements;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

import lombok.Data;

@Data

@XmlRootElement(name = "Sample")
@XmlAccessorType(XmlAccessType.FIELD)
public class Sample {
    
    @XmlAttribute(name = "rank")
    private Integer rank;
    
    @XmlElement(name = "SampleIn")
    private SampleIn sampleIn;
    
    @XmlElement(name = "SampleOut")
    private SampleOut sampleOut;
    
    @Data
    @XmlRootElement
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class SampleIn {
        
        @XmlAttribute(name = "src")
        private String source;
    
        @XmlValue
        private String value;
        
    }
    
    @Data
    @XmlRootElement
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class SampleOut {
    
        @XmlAttribute(name = "src")
        private String source;
    
        @XmlValue
        private String value;
    
    }
    
}
