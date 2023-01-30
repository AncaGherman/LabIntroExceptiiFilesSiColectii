package colectii;

import java.util.HashSet;
import java.util.Set;

public class DemoSet1 {
    public static void main(String[] args) {
        // ana are mere si pere si ana are pere
        //mere
        //ana are si pere si ana are pere
        Set<String> noDup = new HashSet<>();

        for(String s:args) {
           noDup.add(s);
        }
        System.out.println("Uite cate cuvinte fara duplicate ai :"+noDup.size());
        System.out.println("Uite cuvintele unice: "+noDup);
    }
}
