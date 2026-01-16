package UserDefined_Functions;

public class Prog38_MainFunctionOverride {

    // in this program we have created different main methods which are overloaded with main method.
    // Here in this case JVM will take the decision that which main will be run. on the basis of signature
    // It will go only inside single main and other will be ignored.
    // So it will print Inside main 1 only.
    // Sequence of main doesn't matter as it is search by JVM on the basis of signature



    public static void main(String args) {  // [] is removed
        System.out.println("Inside main 2");
    }

    public static int main(int args) {      // Passing argument and return type is int
        System.out.println("Inside main 3");
        return 10;
    }
    public static String main1(String args) {      // Passing argument and return type is string
        System.out.println("Inside main 4");
        return "10";
    }
    public static void main(String[] args) {
        System.out.println("Inside main 1");
    }
    public static boolean main(boolean args) {      // Passing argument and return type is boolean
        System.out.println("Inside main 5");
        return true;
    }
}
