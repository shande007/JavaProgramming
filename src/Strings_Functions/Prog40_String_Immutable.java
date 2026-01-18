package Strings_Functions;

public class Prog40_String_Immutable {
    public static void main() {

        String name = "Sidhant";

//        boolean result = name.contains("n");
//        System.out.println(result);     // true

//        String are immutable in nature


//        name.toUpperCase();
//        System.out.println(name);   // Sidhant, because string is immutable and it pointing to same name varibale. toUpperCase is convert the string but can not reassign to name.

//        System.out.println(name.toUpperCase());       // SIDHANT

        name = name.toUpperCase();
        System.out.println(name);       // SIDHANT



    }
}
