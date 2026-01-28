package T2_SelfTest2_Strings;

import java.util.Scanner;

public class Test4_Compare2Strings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        if (str1.equals(str2)) {
            System.out.println("Both strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        sc.close();
    }
}
