package AreaCalc;

public class Trapezoid extends Shape implements Print_Text {
    public double longSeat;
    public double shortSeat;
    public double height;

    public Trapezoid(double longSeat, double shortSeat, double height) {
        this.longSeat = longSeat;
        this.shortSeat = shortSeat;
        this.height = height;
    }

    @Override
    public void message() {
        System.out.print("Trapezoid's area is - ");
    }

    @Override
    public double calculateArea() {
        return ((longSeat + shortSeat) / 2) * height;
    }
}
