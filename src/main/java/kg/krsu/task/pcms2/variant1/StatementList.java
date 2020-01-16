package kg.krsu.task.pcms2.variant1;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name = "statements")
@XmlAccessorType(XmlAccessType.FIELD)
public class StatementList {
    
    @XmlElement(name = "statement")
    private List<Statement> statements;
    
    @Data
    @XmlRootElement(name = "statement")
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Statement {
        
        @XmlAttribute(name = "language")
        private String language;
        
        @XmlAttribute(name = "type")
        private String type;
        
        @XmlAttribute(name = "path")
        private String path;
        
        @XmlAttribute(name = "charset")
        private String charset;
        
    }
    
}
