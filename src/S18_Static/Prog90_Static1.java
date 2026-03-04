package S18_Static;

public class Prog90_Static1 {

    int nonstatic;
    static String static_a = "15";


    public static void main(String[] args) {
        int a = 10;
        // System.out.println(nonstatic);       // Cannot access non static things
        System.out.println(static_a);
        System.out.println(a);


    }
}
