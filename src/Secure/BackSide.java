package Secure;

import java.util.Scanner;

public class BackSide {
    private String name;
    private String password;


    public void askPass(Scanner scanner) {
        while (true) {
            BackSide backSide = new BackSide();
            String numbers = ".*\\d+.*";
            String lowers = ".*[A-Z].*";
            String uppers = ".*[a-z].*";
            System.out.print("Please enter the password: ");
            backSide.setPassword(scanner.next());

            if (backSide.getPassword().length() != 8) {
                System.out.println("*** Password must be at least 8 chars ***");
                continue;
            }
            if (!backSide.getPassword().matches(numbers)) {
                System.out.println("*** Password must contain at least 1 number ***");
                continue;
            }
            if (!backSide.getPassword().matches(lowers)) {
                System.out.println("*** Password must contain at least an lowercase ***");
                continue;
            }
            if (!backSide.getPassword().matches(uppers)) {
                System.out.println("*** Password must contain at least an uppercase ***");
                continue;
            }

            System.out.print("Please confirm the password: ");
            String checkPass = scanner.next();

            if (backSide.getPassword().equals(checkPass)) {
                System.out.println("Welcome to the system " + name + "!");
                break;
            } else {
                continue;
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
