package S21_Collection_Framework.CF1_LIST;

import java.util.*;

public class Prog105_List {

    public static void main(String[] args) {

        List fruits = List.of("orange", "apple", "guava", "mango", "watermelon");   // this is immutable list due to listof and
        // you cannot modify it
        System.out.println(fruits);

//        fruits = new ArrayList();

//        List mylist = new List();
        List arrayList = new ArrayList();
        arrayList.add("Sidhant");
        arrayList.add(123);
        arrayList.add(true);
//        fruits.add("banana");   // it will show only banana becuase you used arraylist where it create another list
//        System.out.println(fruits);
        System.out.println(arrayList);
    }
}

/*
OUTPUT -

[orange, apple, guava, mango, watermelon]
[banana]
[Sidhant, 123, true]
*/