package S20_Wrapper_Class;

public class Prog102_Autoboxing_Unboxing {

    public static void main(String[] args) {
        int a= 10;
        Integer b = a; // Instance Variable to Wrapper
        System.out.println(b); //  b has not attribute, methods -1
        // Boxing - Primitive data type is converted wrapper - Automatic JVM will do it


        Integer aa = 43;
        int a1 = aa; // UnBoxing -> Wrapper to instance variable
        System.out.println(a1); //  aa lost the attribute and behaviour

        int i = Integer.parseInt("123");

    }
}
