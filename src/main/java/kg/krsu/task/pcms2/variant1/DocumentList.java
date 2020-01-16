package kg.krsu.task.pcms2.variant1;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name = "documents")
@XmlAccessorType(XmlAccessType.FIELD)
public class DocumentList {
    
    @XmlElement(name = "document")
    private List<Document> documents;
    
    @Data
    @XmlRootElement(name = "document")
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Document {
        
        @XmlAttribute(name = "type")
        private String type;
        
        @XmlAttribute(name = "path")
        private String path;
        
    }
    
}
