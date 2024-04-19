package ProBank;

import java.util.Scanner;

public class BankInfoOld extends SecuritySide {
    private String accountNumber;
    private double balance;
    private double deposit;

//    public void confirmation(Scanner scanner) {
//        while (true) {
//            BankInfoOld info = new BankInfoOld();
//            System.out.println("Please enter the account number: ");
//            info.setAccountNumber(scanner.next());
//
//            if (info.getAccountNumber().length() != 16) {
//                System.out.println("Account number's length must be 16.");
//                continue;
//            }
//
//            System.out.println("Is '" + info.getAccountNumber() + "' the right account?");
//            System.out.print("Please confirm with yes or no: ");
//            String confirmYesNo = scanner.next();
//
//            if (confirmYesNo.equalsIgnoreCase("yes")) {
//                System.out.println("Thank you " + getName() + ", nice to see you");
//                break;
//            } else {
//                continue;
//            }
//        }
//    }
//
//    public void balanceMoney(Scanner scanner) {
//        while (true) {
//            BankInfoOld info = new BankInfoOld();
//            System.out.print("How much money do you have in your account? - ");
//            info.setBalance(scanner.nextDouble());
//
//            if (info.getBalance() < 0) {
//                System.out.println("You can't have '" + info.getBalance() + "' in your account");
//                System.out.println("Please try again.");
//                continue;
//            } else {
//                break;
//            }
//        }
//    }
//
//    public double depositMoney(Scanner scanner) {
//        while (true) {
//            BankInfoOld info = new BankInfoOld();
//            System.out.print("How much money do you want to set as deposit? - ");
//            info.setDeposit(scanner.nextDouble());
//
//            if (info.getDeposit() > info.getBalance() || info.getDeposit() <= 0) {
//                System.out.println("Deposit can't be higher than balance or deposit can't be equal or lower than 0");
//                continue;
//            } else {
//                System.out.println("'" + info.getDeposit() + "' set as deposit.");
//                double left = balance -= deposit;
//                System.out.println("'" + left + "' amount left in your account");
//                break;
//            }
//
//        }
//        return depositMoney(scanner);
//    }

//    public void transfer(Scanner scanner) {
//        while (true) {
//            BankInfo info = new BankInfo();
//            System.out.print("How much money do you want to transfer? - ");
//            double transferAmount = scanner.nextDouble();
//
//            if (transferAmount > this.getBalance()) {
//                System.out.println("Transfer amount can't be higher than balance");
//                continue;
//            }
//            if (transferAmount <= 0) {
//                System.out.println("Transfer amount can't be equal or lower than 0.");
//                continue;
//            }
//            System.out.println("'" + transferAmount + "' sent successfully.");
//            this.balance -= transferAmount;
//            System.out.println("'" + this.balance + "' amount left in your bank account.");
//            System.out.println("Thank you for using OurBank " + getName() + "!");
//            break;
//
//        }
//    }


//    public void transfer(Scanner scanner){
//        while (true) {
//            System.out.print("Enter recipient account number: ");
//            String recipientAccountNumber = scanner.next();
//
//            boolean validRecipient = validateRecipientAccount(recipientAccountNumber);
//            if (!validRecipient) {
//                System.out.println("Invalid recipient account. Please try again.");
//                continue;
//            }
//            try {
//                System.out.println("How much money do you want to transfer?");
//                double transferAmount = scanner.nextDouble();
//                transferFunds(recipientAccountNumber, transferAmount);
//
//                System.out.println("'" + transferAmount + "' transferred successfully to account " + recipientAccountNumber);
////                this.balance -= transferAmount;
//                balance -= transferAmount;
//                System.out.println("'" + balance + "' amount left in your bank account.");
//                System.out.println("Thank you for using OurBank " + getName() + "!");
//                break;
//            } catch (Exception e) {
//                System.out.println("Transfer failed: " + e.getMessage());
//            }
//        }
//    }
//
//    private boolean validateRecipientAccount(String recipientAccountNumber) {
//        if (recipientAccountNumber.equals(this.accountNumber)) {
//            System.out.println("You cannot transfer to your own account.");
//            return false;
//        }
//        return false;
//    }
//
//    private void transferFunds(String recipientAccountNumber, double transferAmount) {
//
//    }

    public void transfer(Scanner scanner) {
        while (true) {
            BankInfoOld bankInfo = new BankInfoOld();
            System.out.print("Enter how much money do you want to transfer? - ");
            double transferAmount = scanner.nextDouble();



        }
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
