package Array_Single;

import java.util.Scanner;

/*
        *
        * *
        * * *
        * * * *
        * * * * *
*/

public class Prog63_Star_RightTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n for the pattern, e.g n = 3");
        int n = scanner.nextInt(); // 3
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");

        }
    }
}
