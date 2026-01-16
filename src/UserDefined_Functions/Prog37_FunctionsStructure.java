package UserDefined_Functions;

public class Prog37_FunctionsStructure {
    public static void main(String[] args) {

        // User Defined Functions.

        // 1.Without Parameters and Without Return Type
        // 2.Without Parameters but With Return Type
        // 3.With Parameters and Without Return Type
        // 4.With Parameters and With Return Type


        // 1.Without Argument / Parameters and Without Return Type.
        wop_wor_greet();
        System.out.println("Do not have any input and return type");
        //  2. Without Parameters but With Return Type
        String msg = wop_wr_greet_2();
        System.out.println(msg);

        //  3. With Parameters and Without Return Type ( 90%)
        greet_with_details("Sidhant", 65, 100);


        //  4. With Parameters and With Return Type
        int sum = sum_of_two_numbers(3, 4);
        System.out.println("Sum is :"+sum);
    }

    // 1.Without Argument / Parameters and Without Return Type.
    static void wop_wor_greet() {
        System.out.println("This is type one user defined function which is not returning anything and also no argument been passed");
    }

    //  2. Without Parameters but With Return Type
    static String wop_wr_greet_2() {
        System.out.println("This is the type2 user-defined function, which is returning something but there are no parameters or argument been passed");
        return "Hello";
    }

    //  3. With Parameters and Without Return Type ( 90%)
    static void greet_with_details(String hello, int i, int i1) {
        System.out.println("This is a type 3 user-defined function that does not return anything but has a parameter or argument being passed. ");
        System.out.println("Name is :"+hello);
        System.out.println("Obtained Mark is :"+i);
        System.out.println("Total Mark is :"+i1);
    }

    //  4. With Parameters and With Return Type
    static int sum_of_two_numbers(int p, int p1) {
        System.out.println("This is the type 4 user user-defined function, Which is returning something and also having a parameter or argument being passed  ");
        return p + p1;
    }






}
