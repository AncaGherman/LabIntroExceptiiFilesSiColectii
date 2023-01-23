import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Copy {
    public static void main(String[] args) {
        copy(args[0],args[1]);
    }
    private static void copy(String source, String destination) {
        //deschid un fisier sursa:
        //creez un fisier destinatie
        //copiez byte cu byte din unul in altul

//        Path p = Paths.get(source);
//        InputStream is = Files.newInputStream(p);
    }
}
