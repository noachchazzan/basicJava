class Vehicle {
    String make;
    String model;
    int year;

    // contructor with parameters
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // starting
    public void start() {
        System.out.println("Starting...");
    }
}

public class ConstructorMethodWithParameters {
    public static void main(String[] args){
        // create ford object
        Vehicle ford = new Vehicle("ford", "f-250", 2039);
        // starting
        ford.start();
    }

}
