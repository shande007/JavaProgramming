package S11_OOPs.Constructors;

public class Prog74_Contructors3 {
    public static void main(String[] args) {

        Baby b1 = new Baby();
        Baby b2 = new Baby("Sidhant");
        Baby b3 = new Baby("Rutuja", "10K");

        System.out.println(b2.name);
        System.out.println(b3.name);
        System.out.println(b3.pm);

    }
}
class Baby
{
    String name;
    String pm;
    Baby()
    {
        System.out.println("Default constructor called");
    }
    Baby(String nameGiven)
    {
        System.out.println("Parameterized Constructor called");
        this.name = nameGiven;
    }
//    Baby(String name)
//    {
//        this.name = name;   // here both instance and local variable has same variable name this for instance variable we use this keyword to recognize instance variable
//    }   // always use this for instance variable to avoid confusion

    Baby(String nameGiven, String pocketMoney)
    {
        System.out.println("Parameterized constructor called 2 argument");
        this.name = nameGiven;
        this.pm = pocketMoney;

    }
}


