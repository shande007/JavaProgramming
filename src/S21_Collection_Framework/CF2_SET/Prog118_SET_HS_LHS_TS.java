package S21_Collection_Framework.CF2_SET;

import java.util.*;

public class Prog118_SET_HS_LHS_TS {

    public static void main(String[] args) {
        Set<String> hs = new HashSet();
        // NO order will maintain, no duplicates
        hs.add("apple");
        hs.add("Orange");
        hs.add("WaterMelon");
        hs.add("WaterMelon");
        hs.add(null);
        hs.add(null);
        //hs.add(123);
        System.out.println(hs);
        System.out.println(" ---------------------------");


        Set lhs = new LinkedHashSet();
        // LinkedList mechanism to store the element,
        // order will maintain as per code or order maintain in code, no duplicates

        lhs.add("Dpple");
        lhs.add("apple");
        lhs.add("Orange");
        lhs.add("WaterMelon");
        lhs.add("waterMelon");
        lhs.add(null);
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("Apple"));  // False as Case sensetive
        System.out.println(lhs.size());


        System.out.println(" ---------------------------");
        Set ts = new TreeSet();
        // Black and Red Tree mechanism to store the element.
        // Natural Sorting order is maintained.
        ts.add("Dapple");
        ts.add("Apple");
        ts.add("Orange");
        ts.add("WaterMelon");
        ts.add("WaterMelon");
        System.out.println(ts);
        //ts.add(123);
        //ts.add(null);

    }
}
