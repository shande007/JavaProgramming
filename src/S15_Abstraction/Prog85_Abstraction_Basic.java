package S15_Abstraction;

public class Prog85_Abstraction_Basic {

        public static void main(String[] args) {
            Son s1  = new Son();
            s1.loan50L();
            s1.load10L();
        }
    }

    abstract class Father{
        abstract void loan50L();
        // concrete - complete method
        void load10L(){
            System.out.println("Given!");
        }
    }

    class Son extends Father{

    @Override
    void loan50L()
    {
        System.out.println("Given by Son!");
    }
}
