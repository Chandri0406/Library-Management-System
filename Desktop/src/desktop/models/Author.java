package desktop.models;

public class Author {
    private String AuthorID;
    private String FirstName;
    private String LastName;
    private String Publisher;

    public Author(String authorID, String firstName, String lastName, String publisher) {
        AuthorID = authorID;
        FirstName = firstName;
        LastName = lastName;
        Publisher = publisher;
    }

    public Author(String firstName, String lastName, String publisher) {
        FirstName = firstName;
        LastName = lastName;
        Publisher = publisher;
    }

    public Author() {
    }

    public String getAuthorID() {
        return AuthorID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setAuthorID(String authorID) {
        AuthorID = authorID;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setPublisher(String publisher) {
        Publisher = publisher;
    }
}
