package T2_SelfTest2_Strings;

import java.util.Scanner;

public class Test2_CheckStringLength {
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
        if(count > 10)
            System.out.println("String length is greater than 10 and lenght is (Excluding space) "+count);
        else
            System.out.println("String length is less than 10 and lenght is (Excluding space) "+count);
        sc.close();
    }
}
