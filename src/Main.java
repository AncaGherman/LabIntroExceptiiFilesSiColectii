import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger("nume");
    public static void main(String[] args) {

        processFile();
    }
    private static void processFile() {
        String filename=null;
        boolean succes = false;
        while(!succes) {
            try {
                Scanner sc = new Scanner(System.in);
                filename = sc.nextLine();
                FileReader fr = new FileReader(filename);
                succes=true; // nu ajunge aici daca nu gaseste fisierul
                BufferedReader br = new BufferedReader(fr);
                String line;
                while ((line = br.readLine()) != null) {
                    String uppercase = line.toUpperCase();
                    System.out.println(uppercase); //tipareste textul din fisier cu majuscule
                }
            } catch (IOException e) {
                //e.printStackTrace();
                LOGGER.severe("Fisierul nu a fost gasit, mai incercam!");
            }
            //programul mai face si alte operatii, nu se intrerupe
            System.out.println("aici continuam sa facem altele");
        }
    }
}
