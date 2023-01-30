package interfprogcarte;
import java.util.*;

public class TreeSetDemo {
    // Java program to demonstrate the
// working of a TreeSet  - set care le tine in permanenta ordonate
   // Main Method
        public static void main(String args[]) {
            // Creating TreeSet and
            // adding elements
            TreeSet<String> ts = new TreeSet<String>();

            ts.add("Sorina");
            ts.add("Maria");
            ts.add("Ana");
            ts.add("Isabela");
            ts.add("Nadia");
            ts.add("Anca");
            ts.add("Maria");
            ts.add("Ana");

            //printing elements with toprint:
            System.out.println(ts);
            // Traversing elements with iterator
            Iterator<String> itr = ts.iterator();
            while (itr.hasNext()) {
                System.out.println(itr.next());
            }
        }
}

