package Security;

import java.util.Scanner;

public class EnterTheSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StructureOfParole structure = new StructureOfParole(null, null);
        System.out.print("Please enter the username - ");
        structure.setName(scanner.next());

        try {
            structure.askConfirmation(scanner);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
