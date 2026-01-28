package T1_Self_Test_1;

import java.util.Scanner;

public class Test4_MaxOfTwo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int b = sc.nextInt();

        if(a==b)
        {
            System.out.println("Both are equal number");
        }
        else if(a>b)
        {
            System.out.println("a is greater than b");
        }
        else {
            System.out.println("b is greater than a");
        }

/*        int res = (a>b) ? a : b;     // Using ternory opertors
        System.out.println("Maximum number is "+res);*/
    }
}
