package control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;


/**
 * Data Access Object.
 * @author aitor
 */
public class DAO {
    private Statement stmt = null;
    private ResultSet rs = null;
    private Connection conn = null;
    
    private ResourceBundle configFile;
    private String user;
    private String password;
    private String connectionString;
    
    /**
     * DAO constructor, initilizes the DB attributes for the connection.
     */
    public DAO() {
        try {
            this.configFile = ResourceBundle.getBundle("Control.BDConfig");
            this.user = configFile.getString("DBUser");
            this.password = configFile.getString("DBPass");
            this.connectionString = configFile.getString("Conn");
            Class.forName(configFile.getString("Driver")).newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            System.out.println("ERROR: DAO constructor.");
            System.out.println("SQLException: " + e.getMessage());
        }
    }

    /**
     * Opens a connection tothe DB
     * @return 
     */
    public void openConnection() {
        try {
            conn = DriverManager.getConnection(
                    connectionString + "?user=" + user + "&password=" + password + "&useSSL=false");
            
        } catch (SQLException e) {
            System.out.println("ERROR: Connect.");
            System.out.println("SQLException: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
            
        }
    }

    /**
     * Closes the connection to the DB
     */
    public void closeConnection() {
        try {
            if(rs != null)
                rs.close();        
            if(stmt != null)
                stmt.close();            
            if(conn != null)
                conn.close();
        } catch (SQLException e) {
            System.out.println("ERROR: Disconnect.");
            System.out.println("SQLException: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
        }
    }
    
    /**
     * Returns a greeting from the DB
     * @return A greeting.
     */
    public String getGreeting() {
        String ret = null;
        /*try{
            openConnection();
            stmt = conn.createStatement();
            stmt.execute("select greeting from greeting");
            rs = stmt.getResultSet();
            while(rs.next()){
                ret = rs.getString("greeting");
            }
            closeConnection();
            
        } catch(SQLException e){
            System.out.println("ERROR: Cannot access the database.");
            System.out.println("SQLException: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
        }*/
        ret= "Hola Mundo";
        return ret;
    }
    
    /**
     * Returns the DB Connection object
     * @return The DB connection
     */
    public Connection getConnection(){
        return conn;
    }
}