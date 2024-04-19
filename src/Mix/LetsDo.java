package Mix;

import java.util.Scanner;

public class LetsDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        do {
            System.out.print("Enter an integer, which is between 1-10 - ");
            number++;
        } while (number <= 1 || number >= 10);
    }
}
