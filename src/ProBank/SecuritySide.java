package ProBank;

import java.util.Scanner;

public class SecuritySide {
    private String name;
    private String password;

    public void askPass(Scanner scanner) {
        while (true) {
            SecuritySide security = new SecuritySide();
            String numbers = ".*\\d+.*";
            String lowers = ".*[a-z].*";
            String uppers = ".*[A-Z].*";
            System.out.print("Please enter the password: ");
            security.setPassword(scanner.next());

            if (security.getPassword().length() != 8) {
                System.out.println("*** Password's length must be 8 chars ***" + "\n");
                continue;
            }
            if (!security.getPassword().matches(numbers)) {
                System.out.println("*** Password must contain at least 1 number ***" + "\n");
                continue;
            }
            if (!security.getPassword().matches(lowers)) {
                System.out.println("*** Password must contain at least an lowercase ***" + "\n");
                continue;
            }
            if (!security.getPassword().matches(uppers)) {
                System.out.println("*** Password must contain at least an uppercase ***" + "\n");
                continue;
            }

            System.out.print("Please confirm the password: ");
            String checkPass = scanner.next();

            if (security.getPassword().equals(checkPass)) {
                System.out.println("\n" + "Welcome to the OurBank " + name + "!");
                break;
            } else {
                System.out.println("-------------------------------------------------");
                System.out.println("Please try again");
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
