package Lesson13Relise;

import java.util.Scanner;

public class DisplayIt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many cars do you want to add? - ");
        int cars = scanner.nextInt();
        System.out.print("How many motorcycles do you want to add? - ");
        int motors = scanner.nextInt();
        System.out.println();

        int[][] arrays = new int[cars][motors];

        boolean continueGame = true;
        while (true) {
            int count = 1;
            int count2 = 1;
            for (int i = 0; i < arrays.length; i++) {
                System.out.print(count + ") Enter the make of car - ");
                String make = scanner.next();
                System.out.print(count + ") Enter the model of car - ");
                String model = scanner.next();
                System.out.print(count + "Enter the year of car - ");
                int year = scanner.nextInt();
                System.out.print(count + "Enter the numbers of doors - ");
                int doors = scanner.nextInt();
                System.out.println();
                Car car = new Car(make, model, year, doors);
                System.out.println("Your car: " + car);

                for (int j = 0; j < arrays.length; j++) {
                    System.out.print(count2 + ") Enter the make of motorcycle - ");
                    String makeMotor = scanner.next();
                    System.out.print(count2 + ") Enter the model of motorcycle - ");
                    String modelMotor = scanner.next();
                    System.out.print(count2 + ") Enter the year of motorcycle - ");
                    int yearMotor = scanner.nextInt();
                    System.out.print(count2 + ") Enter the number of wheels - ");
                    int wheels = scanner.nextInt();
                    System.out.println();
                    Motorcycle motorcycle = new Motorcycle(makeMotor, modelMotor, yearMotor, wheels);
                    System.out.println("Your motorcycle - " + motorcycle);


                    count++;
                    count2++;
                }
            }


            System.out.print("Do you want to play again (yes/no)? -");
            String userSays = scanner.nextLine();
            if (userSays.equalsIgnoreCase("yes")) {
                continue;
            } else if (userSays.equalsIgnoreCase("no")) {
                continueGame = false;
            } else {
                System.out.println("Please enter only yes or no");
            }
            System.out.println();
        }
    }
}
