package ProBank;

import java.util.Scanner;

public class BankInfo extends SecuritySide {
    private String accountNumber;
    private double balance;
    private double deposit;
    private double transferAmount;
//    private double left = getBalance() - getTransferAmount();


    public void withdrawAmount() {
        if (balance < 0) {
            throw new ArithmeticException("You can't add negative amount in your balance");
        }
    }

    public void transferNew(Scanner scanner) {
        while (true) {
            BankInfo info = new BankInfo();
            System.out.print("How much money do you want to transfer? - ");
            double money = scanner.nextDouble();
            info.setTransferAmount(money);

            if (info.getTransferAmount() < 0 || info.getTransferAmount() > getBalance()) {
                System.out.println("It cannot be higher than balance or equal (lower than zero...)");
                info.withdrawAmount();
            } else {
                System.out.println("Process loading...");
                double a;
                System.out.println(a = getBalance() - info.getTransferAmount());
                System.out.println(a + " left");
            }
        }
    }

    public void confirmation(Scanner scanner) {
        while (true) {
            BankInfoOld info = new BankInfoOld();
            System.out.println("Please enter the account number: ");
            info.setAccountNumber(scanner.next());

            if (info.getAccountNumber().length() != 16) {
                System.out.println("Account number's length must be 16.");
                continue;
            }

            System.out.println("Is '" + info.getAccountNumber() + "' the right account?");
            System.out.print("Please confirm with yes or no: ");
            String confirmYesNo = scanner.next();

            if (confirmYesNo.equalsIgnoreCase("yes")) {
                System.out.println("Thank you " + getName() + ", nice to see you");
                break;
            } else {
                continue;
            }
        }
    }

    public double balanceMoney(Scanner scanner) {
        while (true) {
            BankInfo info = new BankInfo();
            System.out.print("How much money do you have in your account? - ");
            info.setBalance(scanner.nextDouble());

            if (info.getBalance() < 0) {
                System.out.println("You can't have '" + info.getBalance() + "' in your account");
                System.out.println("Please try again.");
                continue;
            } else {
                System.out.println("You have '" + info.getBalance() + "' in your account");
                break;
            }

        }
        return getBalance();
    }

    public double depositMoney(Scanner scanner) {
        while (true) {
            BankInfo info = new BankInfo();
            System.out.print("How much money do you want to set as deposit? - ");
            info.setDeposit(scanner.nextDouble());

            if (info.getDeposit() > info.getBalance() || info.getDeposit() <= 0) {
                System.out.println("Deposit can't be higher than balance or deposit can't be equal or lower than 0");
            } else {
                System.out.println("'" + info.getDeposit() + "' set as deposit.");
                double left = balance -= deposit;
                System.out.println("'" + left + "' amount left in your account");
                break;
            }

        }
        return depositMoney(scanner);
    }

    public double transfer(Scanner scanner) {
        while (true) {
            BankInfo info = new BankInfo();
            System.out.print("Enter the amount how much money do you want to send? - ");
            info.setTransferAmount(scanner.nextDouble());
            System.out.println("Do you want to update your balance?");
            System.out.println("Please confirm with yes or no.");
            String yesOrNo = scanner.next();

            if (yesOrNo.equalsIgnoreCase("yes")) {
                System.out.print("Please enter updated amount: ");
                double updated = scanner.nextDouble();
                if (updated > 0) {

                    double balance = updated;
                    double transferAmount = getTransferAmount();
                    System.out.println("Balance: " + getBalance());
                    System.out.println("Transfer Amount: " + info.getTransferAmount());

                    double result = getBalance() - info.getTransferAmount();
                    System.out.println("Result: " + result);
                    System.out.println("Money successfully transferred");
                    System.out.println("Your balance successfully updated. You have '" + updated + "' in your account.");
                } else {
                    System.out.println("It can't be negative.");
                    continue;
                }
            }
            if (yesOrNo.equalsIgnoreCase("no")) {
                System.out.println(getName() + ", thank you for using OurBank");
                break;
            } else {
                System.out.println("Enter only yes or no");
                continue;
            }

//            info.balanceMoney(scanner);

//            if (info.getTransferAmount() < 0) {
//                System.out.println("It can't be zero");
//                continue;
//            }
        }


        return transfer(scanner);
    }

    public double getTransferAmount() {
        return transferAmount;
    }

    public void setTransferAmount(double transferAmount) {
        this.transferAmount = transferAmount;
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

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }
}
