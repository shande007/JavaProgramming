package Day1_Java_Basic;

public class Prog9_SwappingValues_withThirdVar {
    public static void main(String[] args) {

        System.out.println("Swapping value without using third variable");
        int a = 10, b = 77;
        System.out.println("Value of a and b before swapping : "+a+" "+b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Value of a and b before swapping : "+a+" "+b);
    }
}
