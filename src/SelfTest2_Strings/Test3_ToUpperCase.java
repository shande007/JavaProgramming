package SelfTest2_Strings;

import java.util.Scanner;

public class Test3_ToUpperCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = str.toUpperCase();
        System.out.println("Uppercase String: " + result);

        sc.close();
    }
}
