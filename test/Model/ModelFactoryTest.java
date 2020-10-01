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
public class ModelFactoryTest {

    /**
     * Test of getModel method, of class ModelFactory.
     */
    @Test
    public void testGetModel() {
        System.out.println("getModel() Test");
        int option = 1;
        ModelFactory instance = new ModelFactory();
        Model expResult = new ModelImplementation();
        Model result = instance.getModel(option);
        
        assertTrue("Returns an unexpected instance",
                expResult.getClass().equals(result.getClass()));
        
    }
    
}
