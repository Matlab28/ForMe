package Mix;

import java.util.Scanner;

public class SCheck {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter a number, which is between 1-7 - ");
            int number = scanner.nextInt();

            if (number <= 7) {
                switch (number) {
                    case 1:
                        System.out.println("Monday");
                        break;
                    case 2:
                        System.out.println("Tuesday");
                        break;
                    case 3:
                        System.out.println("Wednesday");
                        break;
                    case 4:
                        System.out.println("Thursday");
                        break;
                    case 5:
                        System.out.println("Friday");
                        break;
                    case 6:
                        System.out.println("Saturday");
                        break;
                    case 7:
                        System.out.println("Sunday");
                        break;
                    default:
                        System.out.println("Please enter an integer, which is between 1-7");
                }
            } else {
                System.out.println("Wrong data");
            }
            System.out.println();
        }
    }
}
