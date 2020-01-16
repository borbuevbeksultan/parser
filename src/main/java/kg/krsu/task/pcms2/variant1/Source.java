package kg.krsu.task.pcms2.variant1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name = "source")
@XmlAccessorType(XmlAccessType.FIELD)
public class Source {
    
    @XmlAttribute(name = "path")
    private String path;
    
    @XmlAttribute(name = "type")
    private String type;
    
}
