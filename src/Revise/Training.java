package Revise;

import java.util.Objects;
import java.util.Scanner;

public class Training extends Thread {
    public static void main(String[] args) {
        final Objects lock = (Objects) new Object();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter how many people do you want to add in list? -");
        int[] array = new int[scanner.nextInt()];
        System.out.println("Add their names:");

        Thread thread1 = new Thread(() -> {
            synchronized (lock) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                int count = 1;
                for (int i = 0; i < array.length; i++) {
                    String names = scanner.nextLine();
                    System.out.print(count++ + ". attender - ");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (lock) {
                lock.notify();
                int result = 1;
                for (int list : array) {
                    System.out.println("\n" + "Your list is:");
                    System.out.println(result++ + list);
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
