package T1_Self_Test_1;


import java.util.Scanner;

public class Test2_EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number");
        int a = sc.nextInt();

        if(a<=0)
        {
            a = -(a);
            System.out.println("Number :"+a);
        }
        if(a%2 == 0)
        {
            System.out.println("Number is Even");
        }
        else {
            System.out.println("Number is Odd");
        }
    }
}
