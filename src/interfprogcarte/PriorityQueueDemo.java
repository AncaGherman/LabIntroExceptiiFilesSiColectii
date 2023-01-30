package interfprogcarte;
// Java program to demonstrate the working of
// priority queue in Java
import java.util.*;

class PriorityQueueDemo {

    // Main Method
    public static void main(String args[])
    {
        // Creating empty priority queue
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
        PriorityQueue<String> pQueue1 = new PriorityQueue<String>();

        // Adding items to the pQueue using add()
        pQueue.add(30);
        pQueue.add(20);
        pQueue.add(15);
        pQueue.add(10);
        pQueue.add(25);

        pQueue1.add("Serban");
        pQueue1.add("Anca");
        pQueue1.add("Maria");
        pQueue1.add("Nadia");
        pQueue1.add("Cristi");
        pQueue1.add("Bianca");

        // Printing the top element of PriorityQueue
        System.out.println(pQueue.peek());
        System.out.println(pQueue1.peek());

        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(pQueue.poll());
        System.out.println(pQueue1.poll());

        // Printing the top element again
        System.out.println(pQueue.peek());
        System.out.println(pQueue1.peek());

        Iterator<Integer> itr = pQueue.iterator();
        Iterator<String> itr1 = pQueue1.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next()+" ");
        }

        while (itr1.hasNext()) {
            System.out.println(itr1.next()+" ");
        }
        System.out.println(pQueue);
        System.out.println(pQueue1);
    }
}

