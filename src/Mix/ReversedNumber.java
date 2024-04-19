package Mix;

import java.util.Scanner;

public class ReversedNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers do you want to enter for playing? -");
        int[] array = new int[scanner.nextInt()];

        int count = 1;
        for (int i = 0; i < array.length; i++) {
            System.out.print(count++ + ") Enter an integer number - ");
            int number = scanner.nextInt();

            int reversedNumber = 0;
            int originalNumber = number;
            while (number != 0) {
                int digit = number % 10;
                reversedNumber = reversedNumber * 10 + digit;
                number /= 10;
            }

            System.out.println("Reversed nummber is " + reversedNumber);

            if (originalNumber == reversedNumber) {
                System.out.println("Your number - " + originalNumber + " is a palindrome number");
            } else {
                System.out.println("Your number - " + originalNumber + " is not a palindrome number");
            }
            System.out.println();


            System.out.println("By the way, just in case: Dyo you want to play again? (May be you changed your mind)");
            System.out.print("PS: Only yes/no -");
            String userChoose = scanner.nextLine();

            if (userChoose.equalsIgnoreCase("yes")) {
                continue;
            } else if (userChoose.equalsIgnoreCase("no")) {
                break;
            } else {
                System.out.println("PLease enter only yes or no-");
            }
        }

    }
}
