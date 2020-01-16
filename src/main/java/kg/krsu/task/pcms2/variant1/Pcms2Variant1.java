package kg.krsu.task.pcms2.variant1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name = "problem")
@XmlAccessorType(XmlAccessType.FIELD)
public class Pcms2Variant1 {
    
    @XmlAttribute(name = "revision")
    private Integer revision;
    
    @XmlAttribute(name = "short-name")
    private String shortName;
    
    @XmlAttribute(name = "url")
    private String url;
    
    @XmlElement(name = "names")
    private NameList nameList;
    
    @XmlElement(name = "statements")
    private StatementList statementList;
    
    @XmlElement(name = "tutorials")
    private TutorialList tutorialList;
    
    @XmlElement(name = "judging")
    private Judging judging;
    
    @XmlElement(name = "files")
    private FileList fileList;
    
    @XmlElement(name = "assets")
    private AssetList assetList;
    
    @XmlElement(name = "properties")
    private PropertyList propertyList;
    
    @XmlElement(name = "stresses")
    private StressList stressList;
    
    @XmlElement(name = "documents")
    private DocumentList documentList;
    
    @XmlElement(name = "tags")
    private TagList tagList;
}
