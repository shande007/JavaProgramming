package S11_OOPs.Constructors;

public class Prog75_Constructor4 {
    public static void main(String[] args) {

        Car t = new Car();
        System.out.println(t.name);     // Unknown car
        Car p = new Car("xuv");
        System.out.println(p.name);     // xuv

        Car p1 = new Car("tesla","2016");

        System.out.println(p1.name);    // tesla
        System.out.println(p1.model);   // 2016

        LoginPage_Prog75 l0 = new LoginPage_Prog75();   // DC - LoginPage_Prog75
        LoginPage_Prog75 l1 = new LoginPage_Prog75("sidhant@gmail.com","123");
        LoginPage_Prog75 l2 = new LoginPage_Prog75("abc@gmail.com","143","Yes",10);

        System.out.println(l1.email);   // sidhant@gmail.com
        System.out.println(l2.email);   // abc@gmail.com
        System.out.println(l2.a);       // 10
    }
}

class Car {

    String name;
    int year;
    String model;

    Car() {
        name = "Unknown Car";
        year = 1991;
        model = "XxX";
    }
    Car(String nameGiven){
        this.name = nameGiven;
    }
    Car(String nameGiven,String modelGiven){
        this.name = nameGiven;
        this.model = modelGiven;
    }
}
