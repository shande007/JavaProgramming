package T2_SelfTest2_Strings;

import java.util.Scanner;

public class Test5_ReverseString {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String input = sc.nextLine();
        String revString = "";

        for (int i = input.length() - 1; i >= 0; i--)
        {
            revString = revString + input.charAt(i);
        }
        System.out.println(revString);
        sc.close();
    }
}