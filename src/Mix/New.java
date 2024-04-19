package Mix;

import com.sun.jdi.request.StepRequest;

import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner =new Scanner(System.in);
            System.out.println("How many numbers do you want to enter?");
            int[] array = new int[scanner.nextInt()];
            int count = 1;

            for (int i = 0; i < array.length; i++) {
                System.out.print(count++ + ") Please enter an integer - " );
                int number = scanner.nextInt();

                int reversedNumber = 0;
                int originalNumber =number;

                while (number != 0) {
                    int digit = number % 10;
                    reversedNumber = reversedNumber*10+digit;
                    number /= 10;
                }

                System.out.println("Reversed number - " + reversedNumber);

                if (reversedNumber == originalNumber) {
                    System.out.println("Your number " + originalNumber + " is a palindrome number");
                } else {
                    System.out.println("Your number " + originalNumber + " is not a palindrome number");
                }
                System.out.println();
            }
            System.out.println("By the way, just in case do you want to play again?");
            System.out.print("Please answer yes or no: ");
            String userSays = scanner.nextLine();

            if (userSays.equalsIgnoreCase("yes")) {
                continue;
            } else if (userSays.equalsIgnoreCase("no")) {
                break;
            } else {
                System.out.println("Please enter yes or no:");
            }
        }
    }
}
