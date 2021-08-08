package az.cbar.service.writer;

import java.util.List;

public interface BaseWriter<T> {
    List<T> write(List<T> t);
}
