package Uno.Uno_Random;

import java.util.Scanner;

public class Generally {
    public String colors() {
        return "red, green, blue, yellow";
    }

    public int computer() {
        int random = (int) (Math.random() * 4) + 1;
        String yourColor;
        switch (random) {
            case 1:
                yourColor = "Red";
                break;
            case 2:
                yourColor = "Yellow";
                break;
            case 3:
                yourColor = "Green";
                break;
            case 4:
                yourColor = "Blue";
                break;
        } return random;
    }

    public int generalInfo(Scanner scanner) {
        System.out.println("Please enter your color: ");
        System.out.println("Please select your color by numbers...");
        System.out.println("\n" + "1 - Red, 2 - Yellow, 3 - Green, 4 - Blue.");
        int colors = scanner.nextInt();
        String userColor;

        switch (colors) {
            case 1:
                userColor = "Red";
                break;
            case 2:
                userColor = "Yellow";
                break;
            case 3:
                userColor = "Green";
                break;
            case 4:
                userColor = "Blue";
                break;
        }
        return colors;
    }
}
