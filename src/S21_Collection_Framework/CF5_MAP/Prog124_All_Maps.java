package S21_Collection_Framework.CF5_MAP;

import java.util.*;

public class Prog124_All_Maps {

    public static void main(String[] args) {
        Map m1 = new HashMap();     // No Duplicate , no ordering

        // Map is key - value
        // name : Sidhant,
        // rollno : 1
        // phone : 9876543210
        m1.put("name", "Sidhant");
//        m1.put("name", "Hande");  // No Duplicate will allowed it will overlap and print latest that is Name = Hande.
        m1.put("rollno", 1);
        m1.put("phone", 987654321);
        System.out.println(m1);


        Map m2 = new LinkedHashMap();        // No Duplicate , Ordered as per insertion
        m2.put("name","Sidhant");
//        m2.put("name", "Hande");  // No Duplicate will allowed it will overlap and print latest that is Name = Hande.
        m2.put("rollno",1);
        m2.put("phone",987654321);
        System.out.println(m2);



        Map m3 = new TreeMap();     // No Duplicate , Natural Ordering
        // Map is key - value
        // name : Sidhant,
        // rollno : 1
        // phone : 9876543210
        m3.put("name","Sidhant");
//        m3.put("name", "Hande");  // No Duplicate will allowed it will overlap and print latest that is Name = Hande.
        m3.put("rollno",1);
        m3.put("phone",987654321);
        System.out.println(m3);
    }
}
