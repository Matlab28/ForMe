package RealBank;

import java.util.Scanner;

public class GeneralSystem extends SecurityOfBank {
    private String accountNumber;
    private double balance;
    private double deposit;
    private double transferAmount;

    public static double left() {
        GeneralSystem generalSystem = new GeneralSystem();
        double leftAzn = generalSystem.getBalance() - generalSystem.getTransferAmount();
        return leftAzn;
    }

    public void confirmation(Scanner scanner) {
        while (true) {
            GeneralSystem generalSystem = new GeneralSystem();
            StringBuilder builder = new StringBuilder();
            System.out.println("Please enter the account number:");
            generalSystem.setAccountNumber(scanner.next());

            String uppers = ".*[A-Z].*";
            String lowers = ".*[a-z].*";

            if (generalSystem.getAccountNumber().matches(uppers) || generalSystem.getAccountNumber().matches(lowers)) {
                throw new ArithmeticException("It can't contain any letters.");
            }
            if (generalSystem.getAccountNumber().length() != 16) {
                System.out.println("Account number's length must be 16 characters.");
                continue;
            }

            for (int i = 0; i < generalSystem.getAccountNumber().length(); i += 4) {
                int endIndex = Math.min(i + 4, generalSystem.getAccountNumber().length());
                String substring = generalSystem.getAccountNumber().substring(i, endIndex);
                builder.append(substring);

                if (endIndex < generalSystem.getAccountNumber().length()) {
                    builder.append(" ");
                }
            }

            System.out.println("Is '" + (builder.toString()) + "' the right account number?");

            System.out.print("Please confirm with yes or no: ");
            String yesNo = scanner.next();

            if (yesNo.equalsIgnoreCase("yes")) {
                System.out.println("Thank you " + getUsername() + "!");
                break;
            } else if (yesNo.equalsIgnoreCase("no")) {
            }
        }
    }

    public double addBalance(Scanner scanner) {
        while (true) {
            GeneralSystem generalSystem = new GeneralSystem();
            System.out.print("How much money do you have in your account? - ");
            generalSystem.setBalance(scanner.nextDouble());

            if (generalSystem.getBalance() <= 0) {
                throw new RuntimeException("You can't have balance lower or equal to zero.");
            }

            System.out.println("You have '" + generalSystem.getBalance() + "' azn in your account");
            break;
        }
        return this.getBalance();
    }

    public void addDeposit(Scanner scanner) {
        while (true) {
            GeneralSystem generalSystem = new GeneralSystem();
            System.out.print("How much money do you want set as a deposit? - ");
            generalSystem.setDeposit(scanner.nextDouble());

            if (getDeposit() > getBalance()) {
                System.out.println("It can't be higher than balance");
            } else {
                System.out.println("'" + generalSystem.getDeposit() + "' azn set as a deposit.");
                System.out.println("'" + left() + "' azn left in your account");
                break;
            }
        }
    }

    public void sendMoney(Scanner scanner) {
        while (true) {
            GeneralSystem generalSystem = new GeneralSystem();
            System.out.println("How much money do you want to send?");
            try {
                generalSystem.setTransferAmount(scanner.nextDouble());
            } catch (Exception e) {
                throw new RuntimeException("Something went wrong...");
            }

            if (generalSystem.getTransferAmount() > generalSystem.getBalance()) {
                System.out.println("Transfer amount cannot be higher than balance");
                continue;
            }
            if (generalSystem.getTransferAmount() < 0) {
                throw new ArithmeticException("It can't be lower than 0.");
            }

            System.out.println("'" + generalSystem.getTransferAmount() + "' transferred successfully.");
            System.out.println("'" + left() + "' azn left in your account");
            System.out.println("Thank you " + getUsername() + ", for using OurBank!");
            break;
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

    public double getTransferAmount() {
        return transferAmount;
    }

    public void setTransferAmount(double transferAmount) {
        this.transferAmount = transferAmount;
    }
}
