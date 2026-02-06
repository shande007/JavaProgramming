package S12_Inheritance.SingleInheritance;

public class Prog76_SingleMain {
    public static void main(String[] args) {
        Son sid = new Son();
        System.out.println(sid.gold_f);
        sid.bhk2();
        sid.bhk3();

        Father f1 = new Father();
        System.out.println(f1.gold_f);
        f1.bhk2();;
        // f1.bhk3();       // father will not access son properties



    }
}
