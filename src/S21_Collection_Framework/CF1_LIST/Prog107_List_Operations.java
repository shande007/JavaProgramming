package S21_Collection_Framework.CF1_LIST;

import java.util.ArrayList;
import java.util.List;

public class Prog107_List_Operations {

    public static void main(String[] args) {
        List list = new ArrayList<>();

        list.add("1"); // 0
        list.add("2");  // 1
        list.add("3"); // 2
        list.add("3"); // 3
        list.add("Sidhant");  //4
        list.add(4);  //5
        list.add(true);  //6


        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("1"));
        System.out.println(list.contains(1));       // searching for integer 1
        System.out.println(list.indexOf("3")); //find the first occ of element in list
        System.out.println(list.lastIndexOf("3")); //find the first occ of element in list
    }
}
