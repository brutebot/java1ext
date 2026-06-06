// Practical 6 - Inheritance and Interface (Smart Vehicle System)...
interface ElectricVehicle {
    void charge();
}

class Vehicle {
    String name;

    void show() {
        System.out.println("Vehicle Name: " + name);
    }
}

class Car extends Vehicle {
    void type() {
        System.out.println("This is a Car");
    }
}

class Bike extends Vehicle {
    void type() {
        System.out.println("This is a Bike");
    }
}

class ElectricCar extends Car implements ElectricVehicle {
    public void charge() {
        System.out.println("Battery Charging...");
    }
}

public class SmartVehicleSystem {
    public static void main(String[] args) {
        Car c = new Car();
        c.name = "Toyota";
        c.show();
        c.type();
        System.out.println();

        Bike b = new Bike();
        b.name = "Honda";
        b.show();
        b.type();
        System.out.println();

        ElectricCar e = new ElectricCar();
        e.name = "Tesla";
        e.show();
        e.type();
        e.charge();
    }
}
