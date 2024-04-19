package Bank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankAccount {
    private String username;
    private String accountNumber;
    private double balance;
    private double transferAmount;
    private double deposit;

    public double deposit() {
        return deposit += balance;
    }

    public String generally() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the account number");
        accountNumber = scanner.nextLine();

        if (accountNumber.length() != 16) {
            System.out.println("It must contain 16 integer characters");
            generally();
        }

        System.out.println("Enter your balance: ");
        balance = scanner.nextDouble();

        if (balance <= 0) {
            throw new ArithmeticException("It can't be 0 or negative...");
        }
        System.out.println("Do you want to transfer money to another account?");
        System.out.print("Please answer only yes or no: -");
        while (true) {
            try {
                String answer = scanner.nextLine();

                if (answer.equalsIgnoreCase("yes")) {

                    System.out.println("How much money do you want to transfer?");
                    transferAmount = scanner.nextDouble();

                    if (transferAmount < 0 || transferAmount > balance) {
                        System.out.println();
                    } else {
                        double last = balance - transferAmount;
                        System.out.println("'" + last + "' azn left");
                        System.out.println("Your money transferred successfully!");
                    }
                } else if (answer.equalsIgnoreCase("no")) {
                    System.out.println("\n" + "Thank you for using our bank!");
                } else {
                    System.out.println("Please enter only yes or no:");
                    continue;
                }
            } catch (RuntimeException e) {
                System.out.println("It can't be negative or higher than your balance");
            }
        }
    }

    public void withdrawAmount() throws InsufficientFundsException {
        if (balance < 0 || transferAmount > balance) {
            throw new ArithmeticException("Unfortunately, it's impossible...");
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getTransferAmount() {
        return transferAmount;
    }

    public void setTransferAmount(double transferAmount) {
        this.transferAmount = transferAmount;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "username='" + username + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", transferAmount=" + transferAmount +
                ", deposit=" + deposit +
                '}';
    }
}
