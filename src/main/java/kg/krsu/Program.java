package kg.krsu;

import java.io.File;
import java.io.InputStream;

import kg.krsu.enums.TaskType;
import kg.krsu.file.PackageScanner;
import kg.krsu.file.impl.ZipPackageScanner;
import kg.krsu.parser.PackageParserFactory;

public class Program {
    
    private PackageScanner packageScanner;
    private PackageParserFactory packageParserFactory;
    
    public Program() {
        this.packageScanner = new ZipPackageScanner();
        this.packageParserFactory = PackageParserFactory.DEFAULT;
    }
    
    public void process(String packageName, String format) {
        try {
            final InputStream inputStream = packageScanner.readDescription(packageName);
            packageParserFactory = PackageParserFactory.DEFAULT;
            packageParserFactory.getParserForFormat(format).parse(inputStream);
        } catch (Exception e) {
            System.out.println(String.format("Internal error: %s", e.getMessage()));
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Input format: [FORMAT] [PACKAGE]");
            return;
        }
        
        final String format = args[0];
        final String packageName = args[1];
    
        try {
            TaskType.valueOf(format);
        } catch (Exception e) {
            System.out.println("Unsupported format");
            return;
        }
        
        if (!new File(packageName).exists()) {
            System.out.println("File can not be found");
            return;
        }
        
        if (!packageName.endsWith(".zip")) {
            System.out.println("Package is not zip file");
            return;
        }
    
        final Program program = new Program();
        program.process(packageName, format);
    }
    
}
