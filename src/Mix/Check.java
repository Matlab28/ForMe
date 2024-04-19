package Mix;

import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number, for calculating its factorial - ");
        int number = scanner.nextInt();

        int sum = 1;

        for (int i = 1; i <= number ; i++) {
            sum *= i;
        }
        System.out.println(sum + "!");
    }
}
