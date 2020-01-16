package kg.krsu.file;

import java.io.IOException;
import java.io.InputStream;

public interface PackageScanner {
    InputStream readDescription(String packageName) throws IOException;
}
