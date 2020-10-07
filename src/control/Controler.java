package control;

import model.Model;
import view.View;

/**
 * Intermediary between the View and the Model.
 * @author aitor
 */
public class Controler {
    
    /**
     * Uses a View and a Model objects to show a greeting
     * @param view Defines the UI (text or GUI).
     * @param model Defines the greeting.
     */
    public void run(View view, Model model) {
        try{
            view.showGreeting(model.getGreeting());
        } catch(Exception e){
            System.out.println("ERROR: The specified View or Model instances in 'Properties' are not supported.");
        }
        
    }
    
}
