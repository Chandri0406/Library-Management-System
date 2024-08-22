package GUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection
{
private  static final String DRIVER = "org.postgresql.Driver";
private static final String JDBC_URL = "jdbc:postgresql://localhost:5432/LibraryDB";
Connection con;
public DatabaseConnection()
{

}
public void connect() throws ClassNotFoundException{
    try{
        Class.forName(DRIVER);
        this.con = DriverManager.getConnection(JDBC_URL);
        if (this.con == null)
        {
            System.out.println("Connected to the database");
        }
    }
    catch (SQLException ex)
    {
        ex.printStackTrace();
    }
}
}
