package Uno;

public class Cards {
    public String colors() {
        return "red, green, yellow, blue";
    }

    public int TotalCards() {
        return 108;
    }

    public int skip() {
        return 8;
    }

    public int reversed() {
        return 8;
    }

    public int DrawTwo() {
        return 8;
    }

    public int wild() {
        return 4;
    }

    public int colorChanger() {
        return 4;
    }

    public int[] eachColor() {
        int[] array = {
                19, 19, 19, 19
        };
        return array;
    }

}
