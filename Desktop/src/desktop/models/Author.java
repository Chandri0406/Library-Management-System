package desktop.models;

public class Author {
    private String AuthorID;
    private String Name;
    private String Surname;
    private String Publisher;

    public Author(String authorID, String name, String surname, String publisher) {
        AuthorID = authorID;
        Name = name;
        Surname = surname;
        Publisher = publisher;
    }

    public Author(String name, String surname, String publisher) {
        Name = name;
        Surname = surname;
        Publisher = publisher;
    }

    public Author() {
    }

    public String getAuthorID() {
        return AuthorID;
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setAuthorID(String authorID) {
        AuthorID = authorID;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public void setPublisher(String publisher) {
        Publisher = publisher;
    }
}
