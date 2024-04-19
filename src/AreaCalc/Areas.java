package AreaCalc;

import java.util.Scanner;

public class Areas {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Please enter the radius of circle: ");
        Circle circle = new Circle(scanner.nextDouble());
        circle.message();
        System.out.println(circle.calculateArea());
        System.out.println("\n" + "Please enter height and seat of triangle:");
        Triangle triangle = new Triangle(scanner.nextDouble(), scanner.nextDouble());
        triangle.message();
        System.out.println(triangle.calculateArea());
        System.out.println("\n" + "Enter the long seat, short seat, and height of trapezoid: ");
        Trapezoid trapezoid = new Trapezoid(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
        trapezoid.message();
        System.out.println(trapezoid.calculateArea());
    }
}
