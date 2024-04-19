package Uno.Uno_Random;

import java.util.Scanner;

public class GameTable {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Generally generally = new Generally();
        generally.generalInfo(scanner);
        generally.computer();

        if (generally.generalInfo(scanner) == generally.computer()) {

        }
        System.out.println(generally);
    }
}
