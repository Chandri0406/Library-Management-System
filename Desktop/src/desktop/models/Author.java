package desktop.models;

import java.util.Date;

public class Author {
    private int AuthorID;
    private String Name;
    private String Surname;
    private Date DateOfBirth;

    public Author(int authorID, String name, String surname, Date dateOfBirth) {
        AuthorID = authorID;
        Name = name;
        Surname = surname;
        DateOfBirth = dateOfBirth;
    }

    public Author(String name, String surname, Date dateOfBirth) {
        Name = name;
        Surname = surname;
        DateOfBirth = dateOfBirth;
    }

    public Author() {
    }

    public int getAuthorID() {
        return AuthorID;
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    public void setAuthorID(int authorID) {
        AuthorID = authorID;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }
}
