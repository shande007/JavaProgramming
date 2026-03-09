package S21_Collection_Framework.CF1_LIST;

import java.util.*;

public class Prog115_Convert_Arrays_To_List {
    public static void main(String[] args) {
        String arr[] = {"Java","Python","C#"};
        List<String> list = Arrays.asList(arr);
        System.out.println(list);
    }
}
