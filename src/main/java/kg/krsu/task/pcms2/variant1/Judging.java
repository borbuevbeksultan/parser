package kg.krsu.task.pcms2.variant1;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import lombok.Data;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "judging")
public class Judging {
    
    @XmlAttribute(name = "cpu-name")
    private String cpuName;
    
    @XmlAttribute(name = "cpu-speed")
    private String cpuSpeed;
    
    @XmlAttribute(name = "input-file")
    private String inputFile;
    
    @XmlAttribute(name = "output-file")
    private String outputFile;
    
    @XmlElement(name = "testset")
    private TestSet testSet;
    
    @Data
    @XmlType(name = "JudgingTestset")
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlRootElement(name = "testset")
    public static class TestSet {
    
        @XmlAttribute(name = "name")
        private String name;
    
        @XmlElement(name = "time-limit")
        private Integer timeLimit;
        
        @XmlElement(name = "memory-limit")
        private Long memoryLimit;
        
        @XmlElement(name = "test-count")
        private Integer testCount;
    
        @XmlElement(name = "input-path-pattern")
        private String inputPathPattern;
        
        @XmlElement(name = "answer-path-pattern")
        private String answerPathPattern;
    
        @XmlElement(name = "tests")
        private TestList testList;
    
        @Data
        @XmlType(name = "JudgingTestList")
        @XmlRootElement(name = "tests")
        @XmlAccessorType(XmlAccessType.FIELD)
        public static class TestList {
    
            @XmlElement(name = "test")
            private List<Test> tests;
        
            @Data
            @XmlType(name = "JudgingTestSet")
            @XmlRootElement(name = "test")
            @XmlAccessorType(XmlAccessType.FIELD)
            public static class Test {
            
                @XmlAttribute(name = "group")
                private String group;
            
                @XmlAttribute(name = "method")
                private String method;
            
                @XmlAttribute(name = "sample")
                private String sample;
            
                @XmlAttribute(name = "cmd")
                private String cmd;
            
                @XmlAttribute(name = "from-file")
                private String fromFile;
            
            }
        }
        
    }
}
