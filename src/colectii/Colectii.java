package colectii;

import java.sql.SQLOutput;
import java.util.*;

public class Colectii {
    public static void main(String[] args) {
//        List list = new ArrayList();
//        list.add("Ionel este vanator");
//        list.add(2);
//        list.add(false);
//
//        Object o = list.get(0);
//        if (o instanceof Integer) {
//            int a = (Integer) list.get(0);
//            System.out.println(a);
//        }
//        else {
//            if ( o instanceof String) {
//                String a = (String ) list.get(0);
//                System.out.println(a);
//            }
//        }
//        System.out.println(o);
        List<String> list = new ArrayList<>();
        list.add("ana");
        list.add("ana-maria");
        list.add("66");
        list.add("maria");
        list.add("ana");
        list.add("maria");
        list.add("costel");

       // System.out.println(list.get(1));

        //traversari:
        System.out.println("Lista cu duplicate:");
        for(String s:list) {
            System.out.println(s);
        }
//        //sau:
//        System.out.println("Cu for normal:");
//        for (int i=0; i<list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//        //sau:
//        System.out.println("Cu iterator:");
//        Iterator<String> i = list.listIterator();
//        while (i.hasNext()) {
//            if (i.equals("ana-maria")) {
//                i.remove();
//            }
//            else {
//                System.out.println("ceva");
//            }
//            String s = i.next();
//            System.out.println(s);
//        }
//
//        System.out.println("Iara cu for-each:");
//        for(String s:list) {
//            System.out.println(s);
//        }

        System.out.println("Lista fara duplicate");
        Set<String> nodup = new HashSet<>(list);
        for(String s:nodup) {
            System.out.println(s);
        }


    }

}
