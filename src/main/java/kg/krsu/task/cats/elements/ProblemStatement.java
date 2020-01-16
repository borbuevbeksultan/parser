package kg.krsu.task.cats.elements;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

import lombok.Data;

@Data

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ProblemStatement {
    
    @XmlValue
    private String value;
    
    @XmlAttribute(name = "attachment")
    private String attachment;
    
    @XmlAttribute(name = "url")
    private String url;
}
