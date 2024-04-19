package Book;

public class Book {
    public String name;
    public int pages;
    public String author;
    public String genre;

    public void book(){
        System.out.println("Book's name is - ");
        System.out.println("Book's author is - ");
        System.out.println("A number of pages - ");
        System.out.println("Book's genre - ");
    }

    public Book(String name, int pages, String author, String genre) {
        this.name = name;
        this.pages = pages;
        this.author = author;
        this.genre = genre;
    }
}
