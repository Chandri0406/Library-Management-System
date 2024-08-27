package GUI;

import desktop.models.Author;
import desktop.models.Book;
import desktop.models.Borrower;
import desktop.models.Loan;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;

public class DatabaseConnection
{
    private static final String Username = "Tester";
    private static final String Password = "5432";

    private  static final String DRIVER = "org.postgresql.Driver";
    private static final String JDBC_URL = "jdbc:postgresql://localhost:5432/LibraryDB";
    Connection con;
    public DatabaseConnection()
    {

    }
    public Connection connect() throws ClassNotFoundException{
        try{
            Class.forName(DRIVER);
            this.con = DriverManager.getConnection(JDBC_URL, Username, Password);
            if(this.con != null){
                System.out.println("Connected to DB");
            }
        }
        catch(SQLException ex){
            System.out.println("Could not connect: " + ex.getMessage());
        }
        return con;
    }

    public ArrayList<Author> Authorview() {
        ArrayList<Author> dataList = new ArrayList<>();
        try {
            String query = "SELECT * FROM \"Author\"";
            ResultSet table = this.con.createStatement().executeQuery(query);

            while (table.next())
            {
                String id = table.getString("AuthorID");
                String n = table.getString("FirstName");
                String s = table.getString("LastName");
                String p = table.getString("Publisher");
                Author row = new Author(id, n, s, p);
                dataList.add(row);
            }
            return  dataList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public ArrayList<Book> Bookview() {
        ArrayList<Book> dataList = new ArrayList<>();
        try {
            String query = "SELECT * FROM \"Book\"";
            ResultSet table = this.con.createStatement().executeQuery(query);

            while (table.next())
            {
                String bid = table.getString("BookID");
                String t = table.getString("Title");
                String g = table.getString("Genre");
                int yop = table.getInt("YearOfPublication");
                String status = table.getString("Status");
                String authorid = table.getString("AuthorID");
                Book row = new Book(bid, t, g, yop, status, authorid);
                dataList.add(row);
            }
            return dataList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public Author findAuthorOfBook(String authorid){
        Author author = new Author();
        try{
            //String query = "SELECT * FROM Author WHERE AuthorID = ?";
            PreparedStatement query = con.prepareStatement("SELECT * FROM \"Author\" WHERE \"AuthorID\" = ?");
            query.setString(1, authorid);
            
            
            ResultSet rs = query.executeQuery();
            
            while(rs.next()){
                String id = rs.getString("AuthorID");
                String n = rs.getString("FirstName");
                String s = rs.getString("LastName");
                String p = rs.getString("Publisher");
                author = new Author(id, n, s, p);
            }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return author;
    }
    
    public ArrayList<Borrower> Borrowerview() {
        ArrayList<Borrower> dataList = new ArrayList<>();
        try {
            String query = "SELECT * FROM \"Borrower\"";
            ResultSet table = this.con.createStatement().executeQuery(query);

            while (table.next())
            {
                String lcid = table.getString("LibraryCardID");
                String lcn = table.getString("Name");
                String lcs = table.getString("Surname");
                String lcadress = table.getString("Address");
                String lcphone = table.getString("Phone");
                String lcemail = table.getString("Email");
                Borrower row = new Borrower(lcid, lcn, lcs, lcadress, lcphone, lcemail);
                dataList.add(row);
            }
            return  dataList;
        } catch (SQLException e) {
            throw new RuntimeException(e);

        }

    }
    public ArrayList<Loan> Loanview() {
        ArrayList<Loan> dataList = new ArrayList<>();
        try {
            String query = "SELECT * FROM \"Loan\"";
            ResultSet table = this.con.createStatement().executeQuery(query);

            while (table.next())
            {
                String lid = table.getString("LoanID");
                String lbid = table.getString("BookID");
                Date lsd = table.getDate("StartDate");
                Date led = table.getDate("EndDate");
                String lcid = table.getString("LibraryCardID");
                Loan row = new Loan(lid, lbid, lsd, led, lcid);
                dataList.add(row);
            }
            return dataList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void addAuthor(Author author) {
        PreparedStatement query;
        try {
            query = con.prepareStatement("INSERT INTO \"Author\"(\"FirstName\", \"LastName\", \"Publisher\") VALUES(?, ?, ?)");
            query.setString(1, author.getFirstName());
            query.setString(2, author.getLastName());
            query.setString(3, author.getPublisher());

            query.executeUpdate();
            System.out.println("Author has been added");

        } catch (SQLException e) {
            System.out.println("Could not add author: " + e.getMessage());

        }
    }
        public void addBook(Book book) {
            PreparedStatement query;
            try {
                query = con.prepareStatement("INSERT INTO \"Book\"(\"Title\", \"Genre\", \"YearOfPublication\", \"Status\", \"AuthorID\") VALUES(?, ?, ?, ?, ?)");
                query.setString(1, book.getTitle());
                query.setString(2, book.getGenre());
                query.setInt(3, book.getYearOfPublication());
                query.setString(4, book.getStatus());
                query.setString(5, book.getAuthorID());

                query.executeUpdate();
                System.out.println("Book has been added");

            } catch (SQLException e) {
                System.out.println("Could not add book: " + e.getMessage());

            }
        }

            public void addLoan(Loan loan) {
                PreparedStatement query;
                try {
                    query = con.prepareStatement("INSERT INTO \"Loan\"(\"BookId\", \"StartDate\", \"EndDate\") VALUES(?, ?, ?)");
                    query.setString(2, loan.getBookID());
                    query.setDate(3, loan.getStartDate());
                    query.setDate(4, loan.getEndDate());
                    query.executeUpdate();
                    System.out.println("Loan has been added");

                } catch (SQLException e) {
                    System.out.println("Could not add Loan: " + e.getMessage());

                }
            }

                public void addBorrower(Borrower borrower) {
                    PreparedStatement query;
                    try {
                        query = con.prepareStatement("INSERT INTO \"Borrower\"(\"Name\", \"Surname\", \"Address\", \"Phone\", \"Email\") VALUES(?, ?, ?, ?, ?, ?)");
                        query.setString(2, borrower.getName());
                        query.setString(3, borrower.getSurname());
                        query.setString(4, borrower.getAddress());
                        query.setString(5, borrower.getPhone());
                        query.setString(6, borrower.getEmail());

                        query.executeUpdate();
                        System.out.println("Borrower has been added");

                    } catch (SQLException e) {
                        System.out.println("Could not add Borrower: " + e.getMessage());

                    }
                }

                public void UpdateAuthor(Author author)
                {
                    PreparedStatement query;
                    try{
                        query = con.prepareStatement("UPDATE \"Author\" SET \"FirstName\" = ?, \"LastName\" = ?, \"Publisher\" = ? WHERE \"AuthorID\" = ?");
                        query.setString(1, author.getFirstName());
                        query.setString(2, author.getLastName());
                        query.setString(3, author.getPublisher());
                        query.setString(4, author.getAuthorID());

                        query.executeUpdate();
                        System.out.println("Student successfully updated");
                    } catch (SQLException e) {
                        System.out.println("Could not update author: " + e.getMessage());
                    }

                }

    public void UpdateBook(Book book)
    {
        PreparedStatement query;
        try{
            query = con.prepareStatement("UPDATE \"Book\" SET \"Title\" = ?, \"Genre\" = ?, \"YearOfPublication\" = ?, \"Status\" = ?, \"AuthorID\" = ? WHERE \"BookID\" = ?");
            query.setString(1, book.getTitle());
            query.setString(2, book.getGenre());
            query.setInt(3, book.getYearOfPublication());
            query.setString(4, book.getStatus());
            query.setString(5, book.getAuthorID());
            query.setString(6, book.getBookID());

            query.executeUpdate();
            System.out.println("Book successfully updated");
        } catch (SQLException e) {
            System.out.println("Could not update Book: " + e.getMessage());
        }

    }

    public void UpdateBorrower(Borrower borrower)
    {
        PreparedStatement query;
        try{
            query = con.prepareStatement("UPDATE \"Borrower\" SET \"Name\" = ?, \"Surname\" = ?, \"Address\" = ?, \"Phone\" = ?, \"Email\" = ?, WHERE \"LibraryCardID\" = ?");
            query.setString(1, borrower.getName());
            query.setString(2, borrower.getSurname());
            query.setString(3, borrower.getAddress());
            query.setString(4, borrower.getPhone());
            query.setString(5, borrower.getEmail());
            query.setString(6, borrower.getLibraryCardID());

            query.executeUpdate();
            System.out.println("Borrower successfully updated");
        } catch (SQLException e) {
            System.out.println("Could not update Borrower: " + e.getMessage());
        }

    }


    public void UpdateLoan(Loan loan)
    {
        PreparedStatement query;
        try{
            query = con.prepareStatement("UPDATE \"Loan\" SET \"BookID\" = ?, \"StartDate\" = ?, \"LibraryCardID\" = ?, WHERE \"LoanID\" = ?");
            query.setString(1, loan.getBookID());
            query.setDate(2, loan.getStartDate());
            query.setString(3, loan.getLibraryCardID());
            query.setString(4, loan.getLoanID());

            query.executeUpdate();
            System.out.println("Borrower successfully updated");
        } catch (SQLException e) {
            System.out.println("Could not update Borrower: " + e.getMessage());
        }

    }

    public void DeleteAuthor(String id)
    {
        PreparedStatement query;

        try{
            query = con.prepareStatement("DELETE FROM \"Author\" WHERE \"AuthorID\" = ?");
            query.setString(1, id);

            query.executeUpdate();
            System.out.println("Author sucessfully deleted");
        } catch (SQLException e) {
            System.out.println("Could not delete Author: " + e.getMessage());
        }

    }
    public void DeleteBook(String id)
    {
        PreparedStatement query;

        try{
            query = con.prepareStatement("DELETE FROM \"Book\" WHERE \"BookID\" = ?");
            query.setString(1, id);

            query.executeUpdate();
            System.out.println("Book sucessfully deleted");
        } catch (SQLException e) {
            System.out.println("Could not delete Book: " + e.getMessage());
        }

    }

    public void DeleteBorrower(int id)
    {
        PreparedStatement query;

        try{
            query = con.prepareStatement("DELETE FROM \"Borrower\" WHERE \"LibraryCardID\" = ?");
            query.setInt(1, id);

            query.executeUpdate();
            System.out.println("Borrower sucessfully deleted");
        } catch (SQLException e) {
            System.out.println("Could not delete Borrower: " + e.getMessage());
        }

    }

    public void DeleteLoan(int id)
    {
        PreparedStatement query;

        try{
            query = con.prepareStatement("DELETE FROM \"Loan\" WHERE \"LoanID\" = ?");
            query.setInt(1, id);

            query.executeUpdate();
            System.out.println("Loan sucessfully deleted");
        } catch (SQLException e) {
            System.out.println("Could not delete Loan: " + e.getMessage());
        }

    }

    public ArrayList<Author> searchAuthor(String name) {
        ArrayList<Author> dataList = new ArrayList<>();
        try {
            String query = "SELECT * FROM \"Author\" WHERE \"FirstName\" = " + "'" + name + "'";
            ResultSet table = this.con.createStatement().executeQuery(query);

            while (table.next()) {
                String id = table.getString("AuthorID");
                String n = table.getString("FirstName");
                String s = table.getString("LastName");
                String p = table.getString("Publisher");
                Author row = new Author(id, n, s, p);
                dataList.add(row);
            }
            return dataList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Book> searchBook(String title) 
    {
        ArrayList<Book> dataList = new ArrayList<>();
        try {
            String query = "SELECT * FROM \"Book\" WHERE \"Title\" =  " + "'" + title + "'";
            ResultSet table = this.con.createStatement().executeQuery(query);

            while (table.next())
            {
                String bid = table.getString("BookID");
                String t = table.getString("Title");
                String g = table.getString("Genre");
                int yop = table.getInt("YearOfPublication");
                String status = table.getString("Status");
                String authorid = table.getString("AuthorID");
                Book row = new Book(bid, t, g, yop, status, authorid);
                dataList.add(row);
            }
            return dataList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
    }
    public ArrayList<Borrower> searchBorrower(String bname) {
        ArrayList<Borrower> dataList = new ArrayList<>();
        try {
            String query = "SELECT * FROM \"Borrower\" WHERE \"Name\" =  " +"'" + bname  +"'";
            ResultSet table = this.con.createStatement().executeQuery(query);

            while (table.next())
            {
                String lcid = table.getString("LibraryCardID");
                String lcn = table.getString("Name");
                String lcs = table.getString("Surname");
                String lcadress = table.getString("Address");
                String lcphone = table.getString("Phone");
                String lcemail = table.getString("Email");
                Borrower row = new Borrower(lcid, lcn, lcs, lcadress, lcphone, lcemail);
                dataList.add(row);
            }
            return  dataList;
        } catch (SQLException e) {
            throw new RuntimeException(e);

        }

    }
    public ArrayList<Loan> searchLoan(String loanId) {
        ArrayList<Loan> dataList = new ArrayList<>();
        try {
            String query = "SELECT * FROM \"Loan\" WHERE \"LoanID\" =  " +"'"+ loanId +"'";
            ResultSet table = this.con.createStatement().executeQuery(query);
            while (table.next())
            {
                String lid = table.getString("LoanID");
                String lbid = table.getString("BookID");
                Date lsd = table.getDate("StartDate");
                Date led = table.getDate("EndDate");
                String lcid = table.getString("LibraryCardID");
                Loan row = new Loan(lid, lbid, lsd, led, lcid);
                dataList.add(row);
            }
            return dataList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}











