package AreaCalc;

public class Triangle extends Shape implements Print_Text {
    public double height;
    public double seat;

    public Triangle(double height, double seat) {
        this.height = height;
        this.seat = seat;
    }

    @Override
    public void message() {
        System.out.print("Triangle's area is - ");
    }

    @Override
    public double calculateArea() {
        return (height * seat) / 2;
    }
}
