package University;

import java.util.Scanner;

public class Checking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number, which is between 1-10: ");
        int[] array = new int[scanner.nextInt()];
        int count = 1;

        try {
            for (int i = 0; i < array.length; i++) {
                System.out.print("Enter " + count++ + ". element - ");
                int number = scanner.nextInt();
            }
        } catch (ExceptionInInitializerError e){
            System.out.println("ERROR!!!");
        }

    }
}
