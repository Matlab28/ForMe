package Security;

import java.util.Scanner;

public class StructureOfParole extends Exception {
    private String name;
    private String password;
    private String confirmPass;

    public StructureOfParole(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public void askConfirmation(Scanner scanner) throws Exception {
        while (true) {
            StructureOfParole structure = new StructureOfParole(getName(), null);
            System.out.print("Please enter the password: ");
            structure.setPassword(scanner.next());
            System.out.print("Please confirm your password: ");
            structure.setConfirmPass(scanner.next());

            try {
                if (password.length() != 8) {
                    System.out.println("It must contain at least 8 characters.");
                    continue;
                } else if (password.toLowerCase().equals(false)) {
                    System.out.println("it must contain at least one lower char.");
                    continue;
                } else if (password.toUpperCase().equals(false)) {
                    System.out.println("it must contain at least one upper char.");
                    continue;
                } else if (!password.contains("1234567890")) {
                    System.out.println("it must contain at least one number");
                    continue;
                }
            } catch (Exception e) {
                throw new Exception(e.getMessage());
            }


            if (structure.getPassword().equals(structure.getConfirmPass())) {
                System.out.println("Welcome to the system " + structure.getName() + "!");
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

    public String getConfirmPass() {
        return confirmPass;
    }

    public void setConfirmPass(String confirmPass) {
        this.confirmPass = confirmPass;
    }
}
