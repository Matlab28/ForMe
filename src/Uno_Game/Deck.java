package Uno_Game;

public class Deck extends Cards {
    public Deck(String colors, int numbersOfCards, int eachColor, String types) {
        super(colors, numbersOfCards, eachColor, types);
    }

    @Override
    public String toString() {
        return "Deck{" +
                "colors='" + colors + '\'' +
                ", numbersOfCards=" + numbersOfCards +
                ", eachColor=" + eachColor +
                ", types='" + types + '\'' +
                '}';
    }
}
