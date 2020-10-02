/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

/**
 *
 * @author aitor
 */
public class ViewImplementationGUI implements View{
    JLabel label;
    
    @Override
    public void showGreeting (String greeting){
        JFrame frame = new JFrame("Window");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(250,100);

        label = new JLabel(greeting);
        frame.getContentPane().add(label);
        frame.setVisible(true);
    }
    
    public JLabel getLabel(){
        return label;
    }
}
