/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.sql.Connection;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aitor
 */
public class DAOTest {
    
    /**
     * Test of Connect method, of class DAO.
     */
    @Test
    public void testConnect() {
        DAO instance = new DAO();
        Connection result = instance.Connect();
        
        assertNotNull("", result);
        
    }

    /**
     * Test of Disconnect method, of class DAO.
     */
    @Test
    public void testDisconnect() {
        System.out.println("Disconnect");
        DAO instance = new DAO();
        instance.Disconnect();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGreetingBD method, of class DAO.
     */
    @Test
    public void testGetGreetingBD() {
        System.out.println("getGreetingBD");
        DAO instance = new DAO();
        String expResult = "";
        String result = instance.getGreetingBD();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
