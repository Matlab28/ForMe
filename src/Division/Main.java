package Division;

import java.awt.geom.Dimension2D;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter two integers:");
        Division division = new Division();
        try {
            division.divideNumbers(scanner.nextInt(), scanner.nextInt());
            System.out.println("The answer is - " + division);
        }catch (DivisionByZeroException e) {
            System.out.println(e + "Problemmmm");
        }

    }

}
