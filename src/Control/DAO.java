package control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;


/**
 * Data Access Object.
 * @author Martin Angulo
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
     * DAO constructor, initilizes the driver for the connection.
     */
    public DAO() {
        try {
            this.configFile = ResourceBundle.getBundle("Control.BDConfig");
            Class.forName(configFile.getString("Driver")).newInstance();
            this.user = configFile.getString("DBUser");
            this.password = configFile.getString("DBPass");
            this.connectionString = configFile.getString("Conn");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            // handle any errors
            System.out.println("ERROR: DAO constructor.");
            System.out.println("SQLException: " + ex.getMessage());
        }
    }

    /**
     * Connects to the database.
     * @return Connection
     */
    public Connection Connect() {
        try {
            return DriverManager.getConnection(connectionString +"?user=" + user +"&password="+ password +"&useSSL=false");
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("ERROR: Connect.");
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
            return null;
        }
    }

    /**
     * Disconnects from the database.
     */
    public void Disconnect() {
        try {
            if(rs != null)
                rs.close();        
            if(stmt != null)
                stmt.close();            
            if(conn != null)
                conn.close();
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("ERROR: Disconnect.");
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }
    
    /**
     * Returns a greeting.
     * @return A greeting.
     */
    public String getGreetingBD() {
        String greeting = "no funciona genio";
        try{
            stmt = Connect().createStatement();
            stmt.execute("select greeting from greeting");
            rs = stmt.getResultSet();
            while(rs.next()){
                greeting = rs.getString("greeting");
            }
            Disconnect();
            
        } catch(SQLException e){
            System.out.println("Data Base error.");
        }
        return greeting;
    }
}