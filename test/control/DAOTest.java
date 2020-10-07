package control;

import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests the DAO methods
 * @author aitor
 */
public class DAOTest {
    
    public DAOTest() {
    }

    /**
     * Test of openConnection method, of class DAO.
     * @throws java.sql.SQLException
     */
    @Test
    public void testOpenConnection() throws SQLException {
        DAO instance = new DAO();
        instance.openConnection();
        
        assertFalse("The connection is null", instance.getConnection().isClosed());
    }

    /**
     * Test of closeConnection method, of class DAO.
     * @throws java.sql.SQLException
     */
    @Test
    public void testCloseConnection() throws SQLException {
        DAO instance = new DAO();
        instance.openConnection();
        instance.closeConnection();
        
        assertTrue("The connection wasn't closed succesfully", instance.getConnection().isClosed());
    }

    /**
     * Test of getGreeting method, of class DAO.
     */
    @Test
    public void testGetGreeting() {
        DAO instance = new DAO();
        String expResult = "Hola Mundo";
        String result = instance.getGreeting();
        assertEquals("Unexpected value was returned", expResult, result);
    }
    
}
