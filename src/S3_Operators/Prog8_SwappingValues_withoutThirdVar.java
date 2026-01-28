package S3_Operators;

public class Prog8_SwappingValues_withoutThirdVar {
    public static void main(String[] args) {

        int a = 18, b = 45;

        System.out.println("Swapping value without using third variable");

        System.out.println("Value of a and b before swapping : "+a+" "+b);

/*        a = a+b;    //a = 63
        b = a-b;    //b = 18
        a = a-b;    //a = 45*/

/*        a = a*b;    //a = 810
        b = a/b;    //b = 18
        a = a/b;    //a = 45*/

        a = a^b;    //a = 00010010 , b = 00101101, (a=a^b = 00010010 ^ 00101101 = 00111111  = 63)
        b = a^b;    // (b=a^b = 00111111 ^ 00101101 = 00010010   = 18)
        a = a^b;    // (a=a^b = 00111111 ^ 00010010 = 00101101   = 45)


        System.out.println("Value of a and b before swapping : "+a+" "+b);
    }
}
