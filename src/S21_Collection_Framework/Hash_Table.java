package S21_Collection_Framework;

import java.util.*;

public class Hash_Table {

    public static void main(String[] args) {
        // Map - K, V,  null values allows
        // Hashtable K,V - Synchronised, Slow and Legacy Class - Thread Safe
        // T1, T2 - they will use one by one.

        Hashtable<Integer,String> ht1 = new Hashtable();    // NO duplicate, NO null allowed, Sort Descending 4,3,2,1
        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(4, "two");
//        ht1.put(4, "one");    // No duplicate id
        ht1.put(3, "three");
//        ht1.put(4, null);         // will give nullpointer exceptions
//        ht1.put(null, "three");   // will give nullpointer exceptions
        System.out.println(ht1);

        Map<Integer,String> ht2 = new HashMap<>();      // Null allowed, order as per hash, Ascending order
        ht2.put(1, "one");
        ht2.put(2, "two");
        ht2.put(6, "two");
        ht2.put(3, "three");
        ht2.put(3, "e");
        ht2.put(4, null);
        ht2.put(null, "three");
        System.out.println(ht2);
    }
}
