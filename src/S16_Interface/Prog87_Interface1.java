package S16_Interface;

public class Prog87_Interface1 {

    public static void main(String[] args) {
        Car c2 = new Car();
        c2.drive();
    }
}

interface Brakes {
    void applyBreak();
}

interface Engine1 {
    void startEngine();

    void stopEngine();

    default void testEngine() {
        System.out.println("testEngine concrete Default");
    }

    static void testEngineStatic() {
        System.out.println("testEngine concrete Static");
    }
}


class Car implements Brakes, Engine1 {

    void drive() {
        startEngine();
        applyBreak();
        testEngine();
        Engine1.testEngineStatic();     // Static method should call with interface name
        stopEngine();
    }


    @Override
    public void applyBreak() {
        System.out.println("applyBreak");
    }

    @Override
    public void startEngine() {
        System.out.println("startEngine");

    }

    @Override
    public void stopEngine() {
        System.out.println("stopEngine");
    }
}

