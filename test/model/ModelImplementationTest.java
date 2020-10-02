package model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests the ModelImplementation methods
 * @author aitor
 */
public class ModelImplementationTest {

    /**
     * Test of getGreeting method, of class ModelImplementation.
     */
    @Test
    public void testGetGreeting() {
        ModelImplementation instance = new ModelImplementation();
        String expResult = "Hola Mundo";
        String result = instance.getGreeting();
        
        assertEquals("Return an unexpected message", expResult, result);
    }
    
}
