package interfprogcarte;

// Java program to demonstrate the
// ArrayDeque class in Java

import java.util.*;

public class ArrayDequeDemo {
    public static void main(String[] args)
    {
        // Initializing an deque
        ArrayDeque<Integer> de_que = new ArrayDeque(10); /* nu tb pus neaparat nr de elemente */

        // add() method to insert
        de_que.add(10);
        de_que.add(20);
        de_que.add(30);
        de_que.add(40);
        de_que.add(50);

        System.out.println(de_que);

        Iterator<Integer> it = de_que.iterator();

        for (int i:de_que) {
            System.out.print(it.next()+" ");
        }

        // clear() method
        de_que.clear();

        // addFirst() method to insert the
        // elements at the head
        de_que.addFirst(564);
        de_que.addFirst(291);

        // addLast() method to insert the
        // elements at the tail
        de_que.addLast(24);
        de_que.addLast(14);

        System.out.println();
        System.out.println(de_que);
    }
}

