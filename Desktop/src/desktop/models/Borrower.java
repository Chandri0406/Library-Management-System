package desktop.models;

public class Borrower {
    private int LibraryCardID;
    private String Name;
    private String Surname;
    private String Address;
    private String Phone;
    private String Email;

    public Borrower(int libraryCardID, String name, String surname, String address, String phone, String email) {
        LibraryCardID = libraryCardID;
        Name = name;
        Surname = surname;
        Address = address;
        Phone = phone;
        Email = email;
    }

    public Borrower(String name, String surname, String address, String phone, String email) {
        Name = name;
        Surname = surname;
        Address = address;
        Phone = phone;
        Email = email;
    }

    public Borrower() {
    }

    public int getLibraryCardID() {
        return LibraryCardID;
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public String getAddress() {
        return Address;
    }

    public String getPhone() {
        return Phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setLibraryCardID(int libraryCardID) {
        LibraryCardID = libraryCardID;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
