package S2_Conditional_Statements;

public class Prog19_SmallestNumFromThree {
    public static void main(String[] args) {
        int a = 10, b = 10, c = 2;

        if (a == b && b == c) {
            System.out.println("All three numbers are equal: " + a);
        } else if (a == b && a < c) {
            System.out.println("a and b are equal and smallest: " + a);
        } else if (a == c && a < b) {
            System.out.println("a and c are equal and smallest: " + a);
        } else if (b == c && b < a) {
            System.out.println("b and c are equal and smallest: " + b);
        } else if (a < b && a < c) {
            System.out.println("Smallest number is: " + a);
        } else if (b < a && b < c) {
            System.out.println("Smallest number is: " + b);
        } else {
            System.out.println("Smallest number is: " + c);
        }
    }
}
