/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests the ViewImplementation methods
 * @author aitor
 */
public class ViewImplementationTest {

    /**
     * Test of showGreeting method, of class ViewImplementation.
     */
    @Test
    public void testShowGreeting(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        String expectedResult = "Hola Mundo\n";
        ViewImplementation instance = new ViewImplementation();
        instance.showGreeting("Hola Mundo");
        
        assertEquals(expectedResult, outContent.toString());
        
    }
    
}
