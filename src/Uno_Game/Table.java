package Uno_Game;

public class Table {
    public static void main(String[] args) {
        Deck deck =new Deck("yellow, green, blue, red",108,19,"skip, reverse, draw two, wild, wild draw four");
        System.out.println("Cards' colors: " + (deck.colors = "yellow, green, blue, red"));
        System.out.println("Total a number of cards: " + (deck.numbersOfCards = 108));
        System.out.println("Total a number of cards for each color - " + (deck.eachColor = 19));
        System.out.println("Rest of the cards' types - " + (deck.types = "skip, reverse, draw two, wild, wild draw four"));

        System.out.println(deck);

        Player player = new Player("ygh5",9, 7,"yeahh");
        System.out.println(player);
    }
}
