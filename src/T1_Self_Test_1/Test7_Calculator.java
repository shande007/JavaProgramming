package T1_Self_Test_1;

import java.util.Scanner;

public class Test7_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Choose operation: 1) + 2) - 3) * 4) /");
        int choice = sc.nextInt();

        switch(choice) {
            case 1: System.out.println("Sum: " + (a+b)); break;
            case 2: System.out.println("Difference: " + (a-b)); break;
            case 3: System.out.println("Multiplication: " + (a*b)); break;
            case 4: System.out.println("Division: " + (a/b)); break;
            default: System.out.println("Invalid choice");
        }
    }
}
