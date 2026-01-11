package Self_Test_1;

import java.util.Scanner;

public class Test3_ExplicitTypeCast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter double value : ");
        double d = sc.nextDouble();

        int i = (int)d; // explicit type cast
        System.out.println(" Double : "+d);
        System.out.println("integer : "+i);
    }
}
