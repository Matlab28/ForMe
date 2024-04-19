package Credit;

import java.util.Scanner;

public class Loan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BackData backData = new BackData();
        System.out.print("Hello, please enter the username ");
        backData.setUsernameForCredit(scanner.next());
        System.out.println("Welcome " + backData.getUsernameForCredit());
    }
}
