package Book;

public class PersonalBook extends Book {
    public PersonalBook(String name, int pages, String author, String genre) {
        super(name, pages, author, genre);
    }

    @Override
    public void book() {
        super.book();
    }

    @Override
    public String toString() {
        return "PersonalBook{" +
                "name='" + name + '\'' +
                ", pages=" + pages +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
