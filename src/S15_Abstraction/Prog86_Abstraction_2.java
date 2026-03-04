package S15_Abstraction;

// this design ensures that every car type must implement start and stop behavior,
// but implementation can vary. This supports extensibility and maintainability.

public class Prog86_Abstraction_2 {


    public static void main(String[] args) {
        POLO car = new POLO();
        car.drive();
    }
}

abstract class Car1{
    abstract void startCar();
    abstract void stopCar();

}

class POLO extends Car1{

    @Override
    void startCar() {
        System.out.println("Starting a car POLO");
    }

    @Override
    void stopCar() {
        System.out.println("Stopping a car POLO");
    }

    void drive(){
        startCar();
        System.out.println("We are driving a Car");
        stopCar();
    }
}


