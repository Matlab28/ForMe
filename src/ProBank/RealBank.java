package ProBank;

import java.util.Scanner;

public class RealBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankInfo bankInfo = new BankInfo();
        System.out.print("Please enter the username: ");
        bankInfo.setName(scanner.next());
//        System.out.println();
//        bankInfo.askPass(scanner);
//        System.out.println();
//        bankInfo.confirmation(scanner);
//        System.out.println();
        bankInfo.balanceMoney(scanner);
        System.out.println("\n" + "Do you want to set some deposit?");
//        while (true) {
//            System.out.println("Please confirm yes or no");
//            String depositTime = scanner.next();
//
//            if (depositTime.equalsIgnoreCase("yes")){
//                bankInfo.depositMoney(scanner);
//            } else if (depositTime.equalsIgnoreCase("no")) {
//                System.out.println("Alright");
//                break;
//            } else {
//                System.out.println("Please enter yes or no");
//
//            }
//        }
        System.out.println();
        while (true) {
            System.out.println("\n" + "Do you want to send money another account?");
            System.out.print("Please confirm with yes or no: ");
            String sending = scanner.next();

            if (sending.equalsIgnoreCase("yes")) {
//                bankInfo.confirmation(scanner);
//                bankInfo.transfer(scanner);
                bankInfo.transferNew(scanner);
            } else if (sending.equalsIgnoreCase("no")) {
                System.out.println();
                System.out.println("Alright " + bankInfo.getName() + ", thank you for using OurBank.");
                System.out.println("Have a good time!");
                break;
            } else {
                System.out.println("Please enter only yes or no:");
                continue;
            }
        }

    }
}
