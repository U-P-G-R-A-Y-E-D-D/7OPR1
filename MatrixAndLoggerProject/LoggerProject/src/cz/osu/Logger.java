package cz.osu;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Logger {
    private static Logger instance;
    private String fileName = "./logs.txt";

    private Logger() {}

    public static Logger getInstance() {
        if (instance == null) instance = new Logger();

        return instance;
    }

    public void log(String text) {
        try {
            FileWriter writer = new FileWriter(fileName, true);
            LocalDateTime dateTime = LocalDateTime.now();
            writer.write(dateTime + " - " + text + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void delete() {
        File file = new File(fileName);
        file.delete();
    }

    public void setLogPath(String path) {
        fileName = path;
    }
}
