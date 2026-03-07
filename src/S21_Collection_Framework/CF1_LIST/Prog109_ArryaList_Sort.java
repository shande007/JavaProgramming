package S21_Collection_Framework.CF1_LIST;

import java.util.*;

public class Prog109_ArryaList_Sort {

    public static void main(String[] args) {
        List marks = new ArrayList();
        marks.add(91);
        marks.add(95);
        marks.add(56);
        marks.add(89);

        System.out.println(marks);
        marks.sort(null);             // need comparator to sort arraylist so we passed null as parameter
        System.out.println(marks);

        Collections.sort(marks);        // collections class used for the sorting the list
        System.out.println(marks);
    }
}
