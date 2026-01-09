package Looping_Statement;

public class Prog28_PalindromeNumber {
    public static void main(String[] args) {
        int num = 121, temp = num, rev = 0;

        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }

        if (temp == rev)
            System.out.println("Number is Palindrome");
        else
            System.out.println("Number is Not Palindrome");
    }
}
