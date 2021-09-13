package hanna_aleksieitseva.hw17_files.task1;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class FileTask {
    public static void main(String[] args) throws IOException {
        Path dir = Paths.get("src\\hanna_aleksieitseva\\hw17_files\\task1\\info_" + System.currentTimeMillis());
        Files.createDirectory(dir);
        Path propertyFile = Paths.get("src\\hanna_aleksieitseva\\hw17_files\\task1\\file.properties");
        Properties properties = new Properties();
        properties.load(Files.newBufferedReader(propertyFile));
        String fileName = properties.getProperty("file.name");
        Path file = Files.createFile(Paths.get(fileName));
        String fileContent = "hello world\nit's new line";
        Files.write(file, fileContent.getBytes());
        Path pathToMovedFile = Files.move(file, dir.resolve(fileName));
        Files.readAllLines(pathToMovedFile).forEach(System.out::println);
    }
}