package az.cbar.service.parser;

import java.util.List;

public interface BaseParser<T> {
    List<T> parse();
}
