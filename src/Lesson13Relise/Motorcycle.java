package Lesson13Relise;

public class Motorcycle extends Vehicle {
    private int numWheels;

    public Motorcycle(String make, String model, int year, int numWheels) {
        super(make, model, year);
        int wheels = this.numWheels;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "numWheels=" + numWheels +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
