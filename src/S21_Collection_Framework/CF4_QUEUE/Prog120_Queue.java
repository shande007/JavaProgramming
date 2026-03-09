package S21_Collection_Framework.CF4_QUEUE;

import java.util.PriorityQueue;

public class Prog120_Queue {

    public static void main(String[] args) {
        // Queue -> 0.001% in Automation
        // FIFO
        PriorityQueue q = new PriorityQueue();
        q.add("Rutuja");
        q.add("Sidhant");
        q.add("Hande");


        System.out.println(q); // natural sorting

        System.out.println(q.peek());   // Top after sorting ie Hande
        System.out.println(q);
        System.out.println(q.poll());   // Show and Remove top element
        System.out.println(q);
    }
}
