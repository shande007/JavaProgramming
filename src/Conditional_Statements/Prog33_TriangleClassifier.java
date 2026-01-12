package Conditional_Statements;

import java.util.Scanner;

public class Prog33_TriangleClassifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first angle of triangle");
        int angle1 = sc.nextInt();
        System.out.println("Enter Second angle of triangle");
        int angle2 = sc.nextInt();
        System.out.println("Enter Third angle of triangle");
        int angle3 = sc.nextInt();


        if((angle1 == angle2) && (angle2 == angle3) && (angle1 == angle3))
        {
            System.out.println("Triangle is equilateral");
        }
        else if((angle1 == angle2) || (angle2 == angle3) || (angle1 == angle3))
        {
            System.out.println("Triangle is Isosceles");
        }
        else {
            System.out.println("Triangle is Scalene");
        }
    }
}
