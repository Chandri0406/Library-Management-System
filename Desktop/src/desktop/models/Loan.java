package desktop.models;

import java.util.Date;

public class Loan {
    private String LoanID;
    private String BookID;
    private Date StartDate;
    private Date EndDate;
    private String LibraryCardID;

    public Loan(String loanID, String bookID, Date startDate, Date endDate, String libraryCardID) {
        LoanID = loanID;
        BookID = bookID;
        StartDate = startDate;
        EndDate = endDate;
        LibraryCardID = libraryCardID;
    }

    public Loan(String loanID, String bookID, Date startDate, Date endDate) {
        LoanID = loanID;
        BookID = bookID;
        StartDate = startDate;
        EndDate = endDate;
    }

    public Loan(String bookID, Date startDate, Date endDate) {
        BookID = bookID;
        StartDate = startDate;
        EndDate = endDate;
    }

    public Loan() {
    }

    public String getLoanID() {
        return LoanID;
    }

    public String getBookID() {
        return BookID;
    }

   public java.sql.Date getStartDate() {
        return (java.sql.Date) StartDate;
    }

    public java.sql.Date getEndDate() {
        return (java.sql.Date) EndDate;
    }

    public String getLibraryCardID() {
        return LibraryCardID;
    }

    public void setLoanID(String loanID) {
        LoanID = loanID;
    }

    public void setBookID(String bookID) {
        BookID = bookID;
    }

    public void setStartDate(Date startDate) {
        StartDate = startDate;
    }

    public void setEndDate(Date endDate) {
        EndDate = endDate;
    }

    public void setLibraryCardID(String libraryCardID) {
        LibraryCardID = libraryCardID;
    }
}
