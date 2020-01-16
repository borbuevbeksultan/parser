package kg.krsu.task.pcms2.variant1;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "files")
public class FileList {
    
    @XmlElement(name = "resources")
    private ResourceList resources;
    
    @XmlElement(name = "executables")
    private ExecutableList executables;
    
    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlRootElement(name = "resources")
    public static class ResourceList {
        
        @XmlElement(name = "file")
        private List<File> files;
    
        @Data
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlRootElement(name = "file")
        public static class File {
    
            @XmlAttribute(name = "path")
            private String path;
            
            @XmlAttribute(name = "type")
            private String type;
            
        }
    }
    
    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlRootElement(name = "executables")
    public static class ExecutableList {
    
        @XmlElement(name = "executable")
        private List<Executable> executables;
    
        @Data
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlRootElement(name = "executable")
        public static class Executable {
    
            @XmlElement(name = "source")
            private Source source;
    
            @XmlElement(name = "binary")
            private Binary binary;
        
        }
        
    }
    
}
