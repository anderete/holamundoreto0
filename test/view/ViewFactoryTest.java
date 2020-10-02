package view;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests the ViewFactory class methods
 * @author aitor
 */
public class ViewFactoryTest {

    /**
     * Test of getView method, of class ViewFactory.
     * Tests if the returned instance is ViewImplementation
     */
    @Test
    public void testGetViewFirstInstanceTest() {
        int option = 1;
        ViewFactory instance = new ViewFactory();
        View result = instance.getView(option);
        
        assertTrue("Returns an unexpected instance of View",
                result instanceof View);
        assertNotNull("The returned object is null", result);
        
    }
    
    /**
     * Test of getView method, of class ViewFactory.
     * Tests if the returned instance is ViewImplementationGUI
     */
    @Test
    public void testGetViewSeccondInstanceTest() {
        int option = 2;
        ViewFactory instance = new ViewFactory();
        View result = instance.getView(option);
        
        assertTrue("Returns an unexpected instance of View",
                result instanceof View);
        assertNotNull("The returned object is null", result);
        
    }
    
}
