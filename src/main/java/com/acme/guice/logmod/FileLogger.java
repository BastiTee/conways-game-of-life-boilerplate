package cloud.bastis.guice.logmod;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileLogger implements Logger {

    private static final Path LOG_PATH = Paths.get("target/output/logfile.txt");

    @Override
    public void log(String message) {
        try {
            Files.createDirectories(LOG_PATH.getParent());
            Files.write(LOG_PATH, (message + "\n").getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            // Don't care
        }
    }
}
