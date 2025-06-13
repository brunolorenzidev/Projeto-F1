package util;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static final String LOG_FILE = "system_log.txt";
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void logError(String message) {
        String timestamp = LocalDateTime.now().format(FORMATTER);
        String logMessage = String.format("[%s] [ERROR] %s%n", timestamp, message);
        try (FileWriter fw = new FileWriter(LOG_FILE, true)) {
            fw.write(logMessage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
