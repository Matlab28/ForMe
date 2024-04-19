package Uno;

import java.util.Scanner;

public class Players extends Cards{
    public int numberOfPlayers() {
        return 4;
    }

    public String playersSize(Scanner scanner) {
        System.out.println("Welcome to the uno!");
        System.out.println("How many players you are? -");
        int[] players = new int[scanner.nextInt()];
        int count = 1;

        for (int i = 0; i < players.length; i++) {
            System.out.print(count++ + ". player's name: ");
            String name = scanner.nextLine();
        }

        System.out.println("Hey " + players[0] + ", which color of card do you want to play?");
        String colorChoose = scanner.nextLine();

        if (colorChoose.equalsIgnoreCase("red")) {
            System.out.println("You can");
        }


        return playersSize(scanner);
    }


}
