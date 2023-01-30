package interfprogcarte;

// Java program to demonstrate the
// working of a HashSet
import java.util.*;

public class HashSetDemo {

    // Main Method
    public static void main(String args[])
    {
        // Creating HashSet and
        // adding elements
        HashSet<String> hs = new HashSet<String>();

        hs.add("Geeks");
        hs.add("For");
        hs.add("For1");
        hs.add("Geeks");
        hs.add("Is");
        hs.add("Jay");
        hs.add("Very helpful");
        hs.add("W");
        hs.add("Jay");

        System.out.println(hs);
        // Traversing elements
        Iterator<String> itr = hs.iterator();
        System.out.println();
        while (itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }
    }
}

