package Bank_2;

import java.util.Scanner;

public class Account {
    private String username;
    private String accountNumber;
    private double balance;
    private double deposit;
    private double transferAmount;

    public void withdrawAmount() {
        if (balance < 0) {
            throw new ArithmeticException("You can't add negative amount in your balance");
        }
    }

    public double getDeposit() {
        return deposit + balance;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public String confirmation(Scanner scanner, Account account) throws InsufficientFundsException {
        System.out.println("Please enter the account number:");
        accountNumber = scanner.nextLine();

        if (accountNumber.length() != 16) {
            throw new InsufficientFundsException("It must contain 16 characters");
        }

        System.out.println("Is " + accountNumber + " the right account number?");
        System.out.println("Please confirm it answering yes or no:");
        String yesNo = scanner.nextLine();

        if (yesNo.equalsIgnoreCase("yes")) {
            System.out.println("How much money do you have in your account?");
            balance = scanner.nextDouble();
            withdrawAmount();
            System.out.println("Do you want to set some deposit?");
            System.out.println("Please confirm it answering yes or no:");
            String depositSet = scanner.next();

            if (depositSet.equalsIgnoreCase("yes")) {
                System.out.println("How much money do you want to set your account?");
                deposit = scanner.nextDouble();
                getDeposit();
                System.out.println("Your current balance is '" + getDeposit() + "'");
            } else if (depositSet.equalsIgnoreCase("no")) {
                System.out.println("Alright, your last updated amount is " + balance);
            } else {
                System.out.println("Enter only yes or no");
                String againEnter = depositSet;
            }

        } else if (yesNo.equalsIgnoreCase("no")) {
            confirmation(scanner, account);
        } else {
            System.out.println("Please enter only yes or no");
        }
        transfer(scanner, account);
        return confirmation(scanner, account);
    }

    public String transfer(Scanner scanner, Account account) {
        System.out.println("If you want to transfer money to another account, please write 'transfer', "
                + "if you don't want, just write 'exit'.");
        String trans = scanner.next();

        if (trans.equalsIgnoreCase("transfer")) {
            confirmation(scanner, account);
        } else if (trans.equalsIgnoreCase("exit")) {
            try {
                System.out.println("\n" + "Thank you for using our bank!");
            } catch (RuntimeException e) {
                System.out.println("Process ended");
            }

        } else {
            System.out.println("Please enter only 'transfer' or 'exit'...");
            String comeBack = trans;
        }
        return transfer(scanner, account);
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
}
