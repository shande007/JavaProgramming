package S11_OOPs.Constructors;

import org.w3c.dom.ls.LSOutput;

public class Prog73_Constructors2_Cats {

    public static void main() {
        Cat c1 = new Cat();
        Cat c2 = new Cat("mufasa");
        Cat c3 = new Cat("lucy");
        Cat c4 = new Cat("spicy");
        Cat c5 = new Cat("oggy");

        System.out.println(c2.name);
        System.out.println(c3.name);
        System.out.println(c4.name);
        System.out.println(c5.name);

        c2.running();
    }
}


class Cat{
    String name;

    Cat(){
        System.out.println("DC");
        System.out.println(this.name);          // print null as not name is assigned to default constructor from class object declaration

    }
    Cat(String nameGiven){
        this.name = nameGiven;      // nameGiven will be allocated in name variable which will use for printing. if you donot use this declaration then you will get null value
    }
    void running() {
        int local_var = 10; // Local varaible
        System.out.println("Who is running -> " + this.name);
    }
}
