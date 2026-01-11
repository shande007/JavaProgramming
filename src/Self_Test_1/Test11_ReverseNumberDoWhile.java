package Self_Test_1;

import java.util.Scanner;

public class Test11_ReverseNumberDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int rev = 0;
        if(num < 0)
        {
            num = -(num);
        }

        do {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        } while(num != 0);

        System.out.println("Reversed number: " + rev);
    }
}
