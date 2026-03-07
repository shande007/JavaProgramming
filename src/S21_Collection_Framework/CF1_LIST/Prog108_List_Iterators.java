package S21_Collection_Framework.CF1_LIST;

import java.util.*;

public class Prog108_List_Iterators {

    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("bread"); // 0
        list.add("milk");  // 1
        list.add("butter"); // 2
        list.add("paneer");  //3
        list.add("jam");  //4
        list.add("cheeze");  //5
        list.add(123);  //6
        list.add(true);  //7

        System.out.print("[ ");
                Iterator it = list.iterator();
        while(it.hasNext())
        {
            System.out.print(" " + it.next() + ",");
        }
        System.out.println(" ]");

        System.out.println(" ........................................... ");

        for(Object o : list)
        {
            System.out.println(o);
        }
    }
}
