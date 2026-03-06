package S21_Collection_Framework.CF1_LIST;

import java.util.*;

public class Prog106_ArrayList {

    public static void main(String[] args) {
        List list = new ArrayList();        // in this list reference we are adding Integer, string and boolean data type
        list.add("1"); // 0
        list.add("2"); // 1
        list.add("3");// 2
        list.add("3"); // 3
        list.add(4);
        list.add(true);

        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("1"));
        System.out.println(list.contains(1));
        System.out.println(list.indexOf("3"));
        System.out.println(list.lastIndexOf("3"));


        System.out.println(list);

        System.out.println(" --- ");
        for (int i = 0; i < list.size(); i++) {     // printing all the elements using for loop
            System.out.println(list.get(i));
        }

        System.out.println(" --- ");
        for (Object o : list) {     // printing all the elements using for each loop
            System.out.println(o);
        }


        System.out.println(" ----- ");
        Iterator iterator = list.iterator();     // printing all the elements using iterators interface
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
