package Mix;

import java.util.Scanner;

public class Rs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers do you want to add? - ");
        int[] array = new int[scanner.nextInt()];
        int count = 1;

        for (int i = 0; i < array.length; i++) {
            System.out.print("Add " + (count++) + ". integer: ");
            int number = scanner.nextInt();

            int reversedNumber = 0;
            int originalNumber = number;

            while (number != 0) {
                int digit = number % 10;
                reversedNumber = reversedNumber * 10 + digit;
                number /= 10;
            }
            System.out.println("Reversed number is " + reversedNumber);

            if (reversedNumber==originalNumber) {
                System.out.println("Your number '" + originalNumber + "' is a palindrome number");
            }else {
                System.out.println("Your number '" + originalNumber + "' is not a palindrome number");
            }
            System.out.println();
        }
    }
}
