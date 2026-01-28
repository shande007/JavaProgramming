package S5_UserDefined_Functions;

import java.util.Scanner;

public class Prog39_CalculatorFunction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = readInt(sc, "Enter a First Number");
        int y = readInt(sc, "Enter a Second Number");

        int sum_result = sum(x, y);
        int sub_result = sub(x, y);
        int mul_result = mul(x, y);
        int div_result = div(x, y);
        int mod_result = mod(x, y);

        System.out.println("Summation is :"+sum_result);
        System.out.println("Substraction is :"+sub_result);
        System.out.println("Multiplication is :"+mul_result);
        System.out.println("Division is :"+div_result);
        System.out.println("MOdulus  is :"+mod_result);


        sc.close();
    }

    static int readInt(Scanner sc, String prompt)
    {
        System.out.println(prompt);
        if(sc.hasNextInt())
        {
            return sc.nextInt();
        }
        else
        {
            System.out.println("Enter the integer only");
            System.exit(0);
            return 0;
        }
    }
    static int sum(int a, int b)
    {
        return a+b;
    }
    static int sub(int a, int b)
    {
        return a-b;
    }
    static int mul(int a, int b)
    {
        return a*b;
    }
    static int div(int a, int b)throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
            return a / b;
    }
    static int mod(int a, int b)
    {
        return a%b;
    }
}
