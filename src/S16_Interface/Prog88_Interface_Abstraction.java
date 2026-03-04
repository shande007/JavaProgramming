package S16_Interface;

public class Prog88_Interface_Abstraction {
    public static void main(String[] args) {

        SON s = new SON();

        s.home();       // from F1
        s.money();      // implemented in SON

        // Polymorphism examples

        Mother m = new SON();
        m.money();

        F1 f1 = new SON();
        f1.money();

        F2 f2 = new SON();
        f2.money();
    }
}

interface F1{
    void home();
    void money();
}

interface F2{
    void money();
}

abstract class Mother{
    abstract void money();
}

class SON extends Mother implements F1,F2 {


    @Override
    public void home() {
        System.out.println("SON home");

    }

    @Override
    public void money() {
        System.out.println("Son money Method!");
    }
}
