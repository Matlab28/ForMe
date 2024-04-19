package Secure;

import java.util.Scanner;

public class Checking extends Thread {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BackSide backSide = new BackSide();
        System.out.print("Please enter your name: ");
        backSide.setName(scanner.next());
        backSide.askPass(scanner);
    }
}
