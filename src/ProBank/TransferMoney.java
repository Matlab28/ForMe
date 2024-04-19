package ProBank;

import java.util.Scanner;

public class TransferMoney extends BankInfo {
    private double transferAmount;

    public double transfer(Scanner scanner) {
        while (true) {
            BankInfo info = new BankInfo();
            System.out.print("Enter the amount how much money do you want to send? - ");
            info.setTransferAmount(scanner.nextDouble());


            double balance = getBalance();
            double transferAmount = getTransferAmount();
            System.out.println("Balance: " + getBalance());
            System.out.println("Transfer Amount: " + info.getTransferAmount());

            double result = getBalance() - info.getTransferAmount();
            System.out.println("Result: " + result);
            System.out.println("Money successfully transferred");
        }

    }


}
