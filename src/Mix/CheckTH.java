package Mix;

import java.util.Scanner;

public class CheckTH {
    public static Object lock = new Object();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                try {
                    lock.wait();
                    System.out.print("How many attenders do you want to add? - ");
//                    System.out.println("And then add their names.");
                    String[] array = new String[scanner.nextInt()];
                    int count = 1;
                    int result =1;

                    for (int i = 0; i < array.length; i++) {
                        System.out.print(count++ + ". attender's name: ");
                        array[i] = scanner.next();
                    }
                    System.out.println("\n");
                    System.out.println("The list of attenders:");
                    for (String list : array) {
                        System.out.println(result++ +") " + list);
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread t2 = new Thread(() -> {
           synchronized (lock) {
               try {
                   lock.notify();
                   System.out.println("Which attender do you want to remove from list?");
                   int remove = scanner.nextInt();
               }catch (RuntimeException e) {
                   throw new RuntimeException(e);
               }
           }
        });

        t1.start();
        t2.start();
    }
}
