package GUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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
}
