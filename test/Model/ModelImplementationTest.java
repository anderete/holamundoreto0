/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aitor
 */
public class ModelImplementationTest {

    /**
     * Test of getGreeting method, of class ModelImplementation.
     */
    @Test
    public void testGetGreeting() {
        System.out.println("getGreeting() Test");
        ModelImplementation instance = new ModelImplementation();
        String expResult = "Hola Mundo";
        String result = instance.getGreeting();
        assertEquals("Return an unexpected message", expResult, result);
    }
    
}
