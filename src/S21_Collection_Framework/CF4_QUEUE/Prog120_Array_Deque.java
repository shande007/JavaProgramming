package S21_Collection_Framework.CF4_QUEUE;

import java.util.ArrayDeque;
import java.util.Deque;

public class Prog120_Array_Deque {

    public static void main(String[] args) {
        Deque<Integer> deck = new ArrayDeque();
        deck.push(5);
        deck.push(1);
        deck.push(4);
        deck.push(2);
        deck.push(9);
        deck.push(7);

        System.out.println(deck);       // FILO [7, 9, 2, 4, 1, 5]
    }
}
