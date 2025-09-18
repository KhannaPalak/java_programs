

class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
        System.out.println("Vehicle brand: " + brand);
    }
}

class Car extends Vehicle {
    String model;

    Car(String brand, String model) {
        super(brand);   // call Vehicle constructor
        this.model = model;
        System.out.println("Car model: " + model);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Car c = new Car("Tesla", "Model S");
    }
}