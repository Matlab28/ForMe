package AreaCalc;

public class Circle extends Shape implements Print_Text {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void message() {
        System.out.print("Circle's area is - ");
    }

    @Override
    public double calculateArea() {
        return Math.pow(radius, 2) * Math.PI;
    }
}
