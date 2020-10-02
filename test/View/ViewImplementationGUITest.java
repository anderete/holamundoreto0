/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests the ViewImplementationGUITest class methods
 * @author aitor
 */
public class ViewImplementationGUITest {
    
    /**
     * Test of showGreeting method, of class ViewImplementationGUI.
     */
    @Test
    public void testShowGreeting() {
        String greeting = "Hola Mundo";
        ViewImplementationGUI instance = new ViewImplementationGUI();
        instance.showGreeting(greeting);
        
        assertTrue("The label doesn't match the expected greeting",
                instance.getLabel().getText().equalsIgnoreCase(greeting));
        
    }
    
}
