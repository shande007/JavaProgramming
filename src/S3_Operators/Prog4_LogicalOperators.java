package S3_Operators;

public class Prog4_LogicalOperators {
    public static void main(String[] args) {
        //Logical Operators
        System.out.println("Logical Operators");

        boolean x= true;
        boolean y= false;

        System.out.println("x && y : "+ (x&&y));
        System.out.println("x || y : "+ (x&&y));
        System.out.println("!x : "+ (!x));
        System.out.println("!y : "+ (!y));

        boolean b1 = 10>20;
        System.out.println(b1);  // false

        boolean b2 = 20>10;
        System.out.println(b2);  // true

        System.out.println(b1 && b2); //false
        System.out.println(b1 || b2); //true

        System.out.println((10<20) && (20>10)); //true
        System.out.println((10>20) || (20>10)); //true

        System.out.println(!(20>10)); //False


    }
}
