package S12_Inheritance.Multilevel;

public class Prog78_MultipleMain {

    public static void main(String[] args) {
        Son Sidhant = new Son();
        Sidhant.home();
        Sidhant.bhk3();
        Sidhant.gold();
        Sidhant.silver();

        Father f = new Father();
        f.gold();
        f.home();
        // f.extraMoney();

        GrandFather gf = new GrandFather();
        gf.gold();

        // Dynamic Dispatch
        GrandFather g1 = new Son();
        Father f1 = new Son();
        g1.gold();
        f1.gold();
        System.out.println();

        //Son s1 = new GrandFather();
        //Son s2 = new Father();


    }
}