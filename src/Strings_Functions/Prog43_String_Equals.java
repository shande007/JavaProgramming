package Strings_Functions;

public class Prog43_String_Equals {
    public static void main(String[] args) {

        String s1 = "Hello";        // SCP string constant pool -> using same string or memory
        String s4 = "Hello";        // SCP string constant pool -> using same string or memory

        String s2 = new String("Hello");        // Object area heap memory
        String s3 = new String("Hello");        // Object area heap memory
        String s5 = new String("hello");        // Object area heap memory

        // == Comparison - String check the ref in String.

        System.out.println(s1 == s3);       // false
        System.out.println(s1 == s2);       // false
        System.out.println(s2 == s3);       // false

        System.out.println(s1 == s4);       // true     as used SCP same string
        System.out.println(s3 == s5);       // false

        // equals ( content) -> value
        System.out.println(s1.equals(s2));      // true
        System.out.println(s1.equals(s3));      // true
        System.out.println(s3.equals(s5));      // false
        System.out.println(s3.equalsIgnoreCase(s5));      // true -> ignore the cases all will convert in lower case

        //  equalsIgnoreCase -> sidhant. Sidhant, SIDHANT , SIDhanT . sIdHaNt -> pramod
        //  == - check for the reference
        // equal operator assignment the value

    }
}
