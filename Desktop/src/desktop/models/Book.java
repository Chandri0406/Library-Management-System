
package desktop.models;

public class Book {
    private String BookID;
    private String Genre;
    private int YearOfPublication;
    private String Status;
    private String AuthorID;

    public Book(String BookID, String Genre, int yearOfPublication, String status, String AuthorID) {
        this.BookID = BookID;
        this.Genre = Genre;
        YearOfPublication = yearOfPublication;
        Status = status;
        this.AuthorID = AuthorID;
    }
    
    public Book(String BookID, String Genre, int yearOfPublication, String status) {
        this.BookID = BookID;
        this.Genre = Genre;
        YearOfPublication = yearOfPublication;
        Status = status;
    }

    public Book(String genre, int yearOfPublication, String status) {
        Genre = genre;
        YearOfPublication = yearOfPublication;
        Status = status;
    }

    public Book() {
    }

    public String getBookID() {
        return BookID;
    }

    public String getGenre() {
        return Genre;
    }

    public int getYearOfPublication() {
        return YearOfPublication;
    }

    public String getStatus() {
        return Status;
    }

    public String getAuthorID() {
        return AuthorID;
    }

    public void setBookID(String BookID) {
        this.BookID = BookID;
    }

    public void setGenre(String Genre) {
        this.Genre = Genre;
    }

    public void setYearOfPublication(int yearOfPublication) {
        YearOfPublication = yearOfPublication;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public void setAuthorID(String AuthorID) {
        this.AuthorID = AuthorID;
    }
}
