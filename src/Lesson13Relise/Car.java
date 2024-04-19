package Lesson13Relise;

public class Car extends Vehicle {
    private int numDoors;

    public Car(String make, String model, int year, int numDoors) {
        super(make, model, year);
        int numDoors1 = this.numDoors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numDoors=" + numDoors +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
