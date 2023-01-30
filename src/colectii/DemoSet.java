package colectii;

import java.util.HashSet;
import java.util.Set;

public class DemoSet {
    public static void main(String[] args) {
        // ana are mere si pere si ana are pere
        //mere
        //ana are si pere si ana are pere
        Set<String> u = new HashSet<>();
        Set<String> d = new HashSet<>();

        for(String s:args) {
            if (!u.add(s)) {
                d.add(s);
            }
        }
            u.removeAll(d);
            System.out.println("elemente unice: "+u);
            System.out.println("elemente duplicate: "+d);
    }
}
