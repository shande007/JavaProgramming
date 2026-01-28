package T2_SelfTest2_Strings;

import java.util.Scanner;

public class Test1_CountStringChars {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String word = sc.nextLine();
        int count = 0;
        for(int i = 0; i < word.length();i++)
        {
            if(word.charAt(i) == ' ')
            {
                continue;
            }
            count++;
        }
        System.out.println("Total char count (excluding space) of string is "+count);
        sc.close();
    }
}
