import java.io.IOException;
import java.util.List;

public interface FileWriter {
    void write(String filePath, List<String> lines) throws IOException;
}
