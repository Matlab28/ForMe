package Mix;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("PLease, enter how many numbers do you want to add? - ");
            int[] arraySize = new int[scanner.nextInt()];
            int count = 1;

            for (int i = 0; i < arraySize.length; i++) {
                System.out.print(count++ + ") Enter an integer - ");
                int number = scanner.nextInt();

                int reversedNumber = 0;
                int originalNumber = number;

                while (number != 0) {
                    int digit = number % 10;
                    reversedNumber = reversedNumber * 10 + digit;
                    number /= 10;
                }

                System.out.println("Reversed number is - " + reversedNumber);

                if (reversedNumber == originalNumber) {
                    System.out.println("Your number ;" + originalNumber + "' is a palindrome number");
                } else {
                    System.out.println("Your number '" + originalNumber + "' is not a palindrome number");
                }
                System.out.println();
            }

            System.out.print("Do you want to play again (yes/no)? - ");
            String userSays = scanner.next();

            if (userSays.equalsIgnoreCase("yes")) {
                continue;
            } else if (userSays.equalsIgnoreCase("no")) {
                break;
            } else {
                System.out.println("Please enter only yes/no");
            }
        }
    }
}