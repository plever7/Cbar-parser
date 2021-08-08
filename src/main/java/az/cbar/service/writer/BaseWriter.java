package az.cbar.service.writer;

import java.util.List;

public interface BaseWriter<T> {
    boolean write(List<T> t);
}
