
/*
Java does not support multiple inheritances with classes
 */
// Superclass
class Vehicle {
    void vehicleType() {
        System.out.println("This is a Vehicle");
    }
}

// Interface for fare
interface Fare {
    default void fareInfo() {
        System.out.println("Fare information");
    }
}

// Subclass 1: Single inheritance + multilevel
class Car extends Vehicle {
    void carType() {
        System.out.println("This is a Car");
    }
}

// Subclass 2: Hybrid inheritance (extends class + implements interface)
class Bus extends Vehicle implements Fare {
    void busType() {
        System.out.println("This is a Bus");
    }
}

public class MultipleInheritance{
    public static void main(String[] args) {
        Car car = new Car();
        car.vehicleType(); // inherited from Vehicle
        car.carType();     // specific to Car

        Bus bus = new Bus();
        bus.vehicleType(); // inherited from Vehicle
        bus.busType();     // specific to Bus
        bus.fareInfo();    // from Fare interface
    }
}