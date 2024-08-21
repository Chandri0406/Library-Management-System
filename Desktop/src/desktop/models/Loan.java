package desktop.models;

import java.util.Date;

public class Loan {
    private int LoanID;
    private int BookID;
    private Date StartDate;
    private Date EndDate;
    private int LibraryCardID;

    public Loan(int loanID, int bookID, Date startDate, Date endDate, int libraryCardID) {
        LoanID = loanID;
        BookID = bookID;
        StartDate = startDate;
        EndDate = endDate;
        LibraryCardID = libraryCardID;
    }

    public Loan(int loanID, int bookID, Date startDate, Date endDate) {
        LoanID = loanID;
        BookID = bookID;
        StartDate = startDate;
        EndDate = endDate;
    }

    public Loan(int bookID, Date startDate, Date endDate) {
        BookID = bookID;
        StartDate = startDate;
        EndDate = endDate;
    }

    public Loan() {
    }

    public int getLoanID() {
        return LoanID;
    }

    public int getBookID() {
        return BookID;
    }

    public Date getStartDate() {
        return StartDate;
    }

    public Date getEndDate() {
        return EndDate;
    }

    public int getLibraryCardID() {
        return LibraryCardID;
    }

    public void setLoanID(int loanID) {
        LoanID = loanID;
    }

    public void setBookID(int bookID) {
        BookID = bookID;
    }

    public void setStartDate(Date startDate) {
        StartDate = startDate;
    }

    public void setEndDate(Date endDate) {
        EndDate = endDate;
    }

    public void setLibraryCardID(int libraryCardID) {
        LibraryCardID = libraryCardID;
    }
}
