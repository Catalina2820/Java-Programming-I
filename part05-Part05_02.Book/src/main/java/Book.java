
public class Book {

    private String autor;
    private String name;
    private int pages;

    public Book() {
    }

    public Book(String autor, String name, int pages) {
        this.autor = autor;
        this.name = name;
        this.pages = pages;
    }

    public String getAuthor() {
        return this.autor;
    }

    public String getName() {
        return this.name;
    }

    public int getPages() {
        return this.pages;
    }

    public String toString() {
        return this.autor + ", " + this.name + ", " + this.pages + " pages";
    }

}
