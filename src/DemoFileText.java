import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DemoFileText {
    public static void main(String[] args) {
        processTempFile(args[0]);
    }
    private static void processTempFile(String imputfile) {
        //read file
        //get all the values
        //print them
        Path filePath = Paths.get(imputfile);
        try {
            byte[] fileContent = Files.readAllBytes(filePath);
            String content = new String(fileContent);
            System.out.println(content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
