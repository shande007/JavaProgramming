package Self_Test_1;

import java.util.Scanner;

public class Test9_PrintNumberDoWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number till you want to print");
        int num = sc.nextInt();
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while(i <= num);

    }
}
