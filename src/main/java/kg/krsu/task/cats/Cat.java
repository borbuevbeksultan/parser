package kg.krsu.task.cats;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import kg.krsu.task.cats.elements.Problem;
import lombok.Data;

@Data

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "CATS")
public class Cat {
    
    @XmlElement(name = "Problem")
    private Problem problem;
    
}
