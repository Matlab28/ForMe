package Book;

public class DisplayBook {
    public static void main(String[] args) {
        PersonalBook book = new PersonalBook("Weapons, gems, microbes", 671, "Jane Diamond", "Politicial");
        book.author = "Jane Diamond";
        System.out.println(book);

    }
}
