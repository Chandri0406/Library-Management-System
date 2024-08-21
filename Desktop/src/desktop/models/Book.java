
package desktop.models;

public class Book {
    private int BookID;
    private String Title;
    private String Genre;
    private double Price;
    private int AuthorID;

    public Book(int BookID, String Title, String Genre, double Price, int AuthorID) {
        this.BookID = BookID;
        this.Title = Title;
        this.Genre = Genre;
        this.Price = Price;
        this.AuthorID = AuthorID;
    }
    
    public Book(int BookID, String Title, String Genre, double Price) {
        this.BookID = BookID;
        this.Title = Title;
        this.Genre = Genre;
        this.Price = Price;
    }

    public Book(String title, String genre, double price) {
        Title = title;
        Genre = genre;
        Price = price;
    }

    public int getBookID() {
        return BookID;
    }

    public String getTitle() {
        return Title;
    }

    public String getGenre() {
        return Genre;
    }

    public double getPrice() {
        return Price;
    }

    public int getAuthorID() {
        return AuthorID;
    }

    public void setBookID(int BookID) {
        this.BookID = BookID;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public void setGenre(String Genre) {
        this.Genre = Genre;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public void setAuthorID(int AuthorID) {
        this.AuthorID = AuthorID;
    }
}
