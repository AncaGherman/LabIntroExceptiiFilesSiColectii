package colectii;

import java.util.*;

public class DemoSet2 {
    public static void main(String[] args) {
        // ana are mere si pere si ana are pere
        //mere
        //ana are si pere si ana are pere
        Set<String> u = new HashSet<>();
        Set<String> d = new HashSet<>();

        for (String s : args) {
            if (!u.add(s)) {
                d.add(s);
            }
        }
        u.removeAll(d);
        System.out.println("elemente unice: " + u);
        System.out.println("elemente duplicate: " + d);
        //Map<String, Integer> nrAparitii = new HashMap<>();
        //Map<String, Integer> nrAparitii = new TreeMap<>(); //ca si HashMap, dar stringurile sunt in ordine alfabetica
        Map<String, Integer> nrAparitii = new LinkedHashMap<>();
        for(String s:args) {
            Integer nrAp = nrAparitii.get(s);
            nrAparitii.put(s,nrAp==null?1:nrAp+1);
        }
        System.out.println(nrAparitii);
    }
}