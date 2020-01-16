package kg.krsu.file.impl;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import kg.krsu.file.PackageScanner;

public class ZipPackageScanner implements PackageScanner {
    
    @Override
    public InputStream readDescription(final String packageName) throws IOException {
        final File file = new File(packageName);
        final ZipFile zipFile = new ZipFile(file);
        final Stream<? extends ZipEntry> stream = zipFile.stream();
        final List<? extends ZipEntry> zipEntries = stream
                .filter(zipEntry -> zipEntry.getName().endsWith(".xml"))
                .collect(Collectors.toList());
        assert zipEntries.size() == 1;
        return zipFile.getInputStream(zipEntries.get(0));
    }
    
}
