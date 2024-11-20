import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class DefaultWriter implements FileWriter{
    @Override
    public void write(String filePath, List<String> lines) throws IOException {
        Files.write(Paths.get(filePath), lines);
    }
}
