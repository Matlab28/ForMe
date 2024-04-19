package Bank_2;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Account account = new Account();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, welcome to OurBank!");
        System.out.print("Please enter username: ");
        account.setUsername(scanner.nextLine());
        System.out.println("Welcome " + account.getUsername() + "!");
        account.confirmation(scanner, account);
        account.getDeposit();
        account.transfer(scanner, account);
        System.out.println(account);
    }
}
