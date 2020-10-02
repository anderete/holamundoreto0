package model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests the ModelFactory methods
 * @author aitor
 */
public class ModelFactoryTest {

    /**
     * Test of getModel method, of class ModelFactory.
     */
    @Test
    public void testGetModel() {
        int option = 1;
        ModelFactory instance = new ModelFactory();
        Model expResult = new ModelImplementation();
        Model result = instance.getModel(option);
        
        assertTrue("Returns an unexpected instance",
                expResult.getClass().equals(result.getClass()));
        
    }
    
}
