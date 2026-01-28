package S2_Conditional_Statements;

public class Prog18_If_Else_Try {
    public static void main(String[] args) {

        int a = -45, b = -45;

        if(a>b)
        {
            System.out.println("a is greater than b");
        }
        else
        {
            if (a == b) {
                System.out.println("Both a and b is equal");
            }
            else {
                System.out.println("b is greater than a");
            }
        }
    }
}
