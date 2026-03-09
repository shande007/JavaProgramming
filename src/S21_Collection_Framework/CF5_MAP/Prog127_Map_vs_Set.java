package S21_Collection_Framework.CF5_MAP;

import java.util.*;

public class Prog127_Map_vs_Set {


    public static void main(String[] args) {
        Map<String,Object> student1 = new HashMap();
//        student1.put("name","Diwakar");
        student1.put("name","Pramod");
        student1.put("phone","976543210");
        student1.put("address","BLR");
        student1.put("home_address","BTM");


        System.out.println(student1);

        System.out.println(student1.getOrDefault("role_no",null));  // null

        Map<String,Object> student2 = new LinkedHashMap<>();
        student2.put("name","Diwakar");
        student2.put("phone","976543210");
        student2.put("address","DEL");
        student2.put("home_address","RG");

        System.out.println(student2);


        Set<String> book_read_items = new HashSet();
        book_read_items.add("Rich dad Poor Dad");
        book_read_items.add("Sapaiens");
        book_read_items.add("Secret");
        book_read_items.add("Atomic Habit");
        book_read_items.add("Atomic Habit");
        book_read_items.add("Eat the Frog");

        System.out.println(book_read_items);




    }
}
