package Mix;

import java.util.Scanner;

public class Security {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your user name: ");
            String userName = scanner.nextLine();

            while (true) {
            System.out.print("Enter your password: ");
            String userPass = scanner.nextLine();

            System.out.print("Confirm your password: ");
            String passCheck = scanner.nextLine();

            if (userPass.equals(passCheck)) {
                System.out.println("Are you '" + userName + "'?");
                System.out.println("Confirm this answering yes or no - ");
                String confirmation = scanner.nextLine();

                if (confirmation.equalsIgnoreCase("yes")){
                    System.out.println("Welcome " + userName + "! Nice to see you.");
                    break;
                } else if (confirmation.equalsIgnoreCase("no")) {
                    System.out.println("Please enter right username...");
                } else {
                    System.out.println("Please enter only 'yes' or 'no'.");
                }
            } else if (!userPass.equals(passCheck)) {
                System.out.println("Please enter the right password");
            } else {
                System.out.println("Please enter right username or password");
            }

        }

    }
}
