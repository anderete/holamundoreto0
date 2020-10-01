/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aitor
 */
public class ViewFactoryTest {

    /**
     * Test of getView method, of class ViewFactory.
     * Tests if the returned instance is ViewImplementation
     */
    @Test
    public void testGetViewFirstInstanceTest() {
        System.out.println("getView");
        int option = 1;
        ViewFactory instance = new ViewFactory();
        View expResult = new ViewImplementation();
        View result = instance.getView(option);
        
        assertTrue("Returns an unexpected instance of View",
                expResult.getClass().equals(result.getClass()));
        
    }
    
    /**
     * Test of getView method, of class ViewFactory.
     * Tests if the returned instance is ViewImplementationGUI
     */
    @Test
    public void testGetViewSeccondInstanceTest() {
        System.out.println("getView");
        int option = 2;
        ViewFactory instance = new ViewFactory();
        View expResult = new ViewImplementationGUI();
        View result = instance.getView(option);
        
        assertTrue("Returns an unexpected instance of View",
                expResult.getClass().equals(result.getClass()));
        
    }
    
}
