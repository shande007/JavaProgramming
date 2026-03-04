package S13_Polymorphism.Method_Overridding;

public class Prog81_Overriding1 {

    public static void main(String[] args) {
        Sidhant s1  = new Sidhant();
        s1.home();

        Father f1 = new Father();
        f1.home();

        Father f2 = new Sidhant(); // Dynamic Dispatch /
        f2.home();


        //  Sidhant s1 = new Father();
        // When father is getting born, child reference cannot be given to.


    }
}

class Father{
    void home(){
        System.out.println("2BHK");
    }
}

class Sidhant extends Father{

    @Override
    void home(){
        System.out.println("3BHK");
    }
}
