package Day1_Java_Basic;

public class Prog1_Var_DataTypes {

    public static void main(String[] args)
    {
        System.out.println("This is my first program and it is about variables and data types in java");

        // Primitive Data Type

        int a = 301654654;
        float b = 10.00F; // we have to add f as literal in float
        long c = 99999999999L; // We have to add L literal if you want to assign large value, you can assign value without literal till 9 digits
        double d = 13455.121;
        short e = 1254;
        byte f = 12;
        char g = 'S';
        boolean h = true;
        System.out.println("Value of a is " + a);
        System.out.println("Value of b is "+ b);
        System.out.println("Value of c is "+ c);
        System.out.println("Value of d is "+ d);
        System.out.println("Value of e is "+ e);
        System.out.println("Value of f is "+ f);
        System.out.println("Value of g is "+ g);
        System.out.println("Value of h is "+ h);


        // Non- primitive data types

        String name = "Sidhant";
        System.out.println("Value of String is : "+ name);
    }
}
