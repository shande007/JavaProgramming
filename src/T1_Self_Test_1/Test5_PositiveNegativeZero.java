package T1_Self_Test_1;

import java.util.Scanner;

public class Test5_PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();

        if(num < 0)
        {
            System.out.println("Number is Negative");
        }
        else if(num > 0)
        {
            System.out.println("Number is Positive");
        }
        else {
            System.out.println("Number is Zero");
        }
    }
}
