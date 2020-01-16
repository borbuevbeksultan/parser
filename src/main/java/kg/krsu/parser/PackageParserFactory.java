package kg.krsu.parser;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import kg.krsu.parser.impl.CatsParser;
import kg.krsu.parser.impl.KrsuParser;

public class PackageParserFactory {
    
    public static PackageParserFactory DEFAULT;
    
    static {
        DEFAULT = new PackageParserFactory();
    }
    
    private FormatResolver formatResolver;
    private List<Parser> parsers;
    
    private PackageParserFactory() {
        this.formatResolver = new FormatResolver();
        this.parsers = new ArrayList<>();
        parsers.add(new KrsuParser());
        parsers.add(new CatsParser());
    }
    
    public Parser getParserForFormat(String format) throws Exception {
        final Class<?> targetType = formatResolver.resolveType(format);
        final Optional<Parser> optionalParser = this.parsers
                .stream()
                .filter(parser -> parser.getType().isAssignableFrom(targetType))
                .findFirst();
    
        if (optionalParser.isPresent()) {
            return optionalParser.get();
        } else {
            throw new Exception();
        }
    }
    
}
