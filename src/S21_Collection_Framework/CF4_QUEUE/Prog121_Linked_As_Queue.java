package S21_Collection_Framework.CF4_QUEUE;

import java.util.*;

public class Prog121_Linked_As_Queue {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(6);
        queue.add(1);
        queue.add(8);

        System.out.println(queue.peek());   // 6

        System.out.println( " ------ ");

        Iterator<Integer> iterator = queue.iterator();
        while(iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println(value);
        }
    }
}
