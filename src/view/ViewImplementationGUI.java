package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

/**
 * View implementation to show a greeting in a GUI
 * @author aitor
 */
public class ViewImplementationGUI implements View{
    JLabel label;
    
    /**
     * Shows a window with a label showing a greeting
     * @param greeting The text to be shown
     */
    @Override
    public void showGreeting (String greeting){
        JFrame frame = new JFrame("Window");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(250,100);

        label = new JLabel(greeting);
        frame.getContentPane().add(label);
        frame.setVisible(true);
    }
    
    /**
     * Return the label containing the greeting
     * @return A label
     */
    public JLabel getLabel(){
        return label;
    }
}
