
package desktop.models;

public class Book {
    private int BookID;
    private String Title;
    private String Genre;
    private int YearOfPublication;
    private String AuthorID;

    public Book(int BookID, String Title, String Genre, int yearOfPublication, String AuthorID) {
        this.BookID = BookID;
        this.Title = Title;
        this.Genre = Genre;
        YearOfPublication = yearOfPublication;
        this.AuthorID = AuthorID;
    }
    
    public Book(int BookID, String Title, String Genre, int yearOfPublication) {
        this.BookID = BookID;
        this.Title = Title;
        this.Genre = Genre;
        YearOfPublication = yearOfPublication;
    }

    public Book(String title, String genre, int yearOfPublication) {
        Title = title;
        Genre = genre;
        YearOfPublication = yearOfPublication;
    }

    public Book() {
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

    public int getYearOfPublication() {
        return YearOfPublication;
    }

    public String getAuthorID() {
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

    public void setYearOfPublication(int yearOfPublication) {
        YearOfPublication = yearOfPublication;
    }

    public void setAuthorID(String AuthorID) {
        this.AuthorID = AuthorID;
    }
}
