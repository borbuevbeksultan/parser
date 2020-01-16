package kg.krsu.task.krsu;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import kg.krsu.task.krsu.elements.GroupList;
import kg.krsu.task.krsu.elements.Test;
import lombok.Data;

@Data

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "testinfo")
public class Krsu {
    
    @XmlElement(name = "checker")
    private String checker;
    
    @XmlElement(name = "interaction")
    private String interaction;
    
    @XmlElement(name = "problem")
    private String problem;
    
    @XmlElement(name = "memorylimit")
    private Long memoryLimit;
    
    @XmlElement(name = "timelimit")
    private Long timeLimit;
    
    @XmlElement(name = "testversion")
    private Float testVersion;
    
    @XmlElement(name = "runtype")
    private Byte runType;
    
    @XmlElement(name = "groups")
    private GroupList groupLists;
    
    @XmlElement(name = "test")
    private List<Test> test;
    
}
