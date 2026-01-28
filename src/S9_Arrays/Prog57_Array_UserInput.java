package S9_Arrays;

import java.util.Scanner;

public class Prog57_Array_UserInput {
    public static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of elements will be in array");
        int size = sc.nextInt();

        int marks [] = new int[size];

        for(int i = 0; i <= marks.length; i++){
            System.out.println("Enter the marks : ");
            marks[i] = sc.nextInt();
        }

        System.out.println("===========================");

        for(int j = 0; j <= marks.length; j++)
        {
            System.out.println(marks[j]);
        }
    }
}
