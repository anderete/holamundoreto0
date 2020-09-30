package Control;

import Model.Model;
import View.View;

/**
 * Intermediary between the View and the Model.
 * @author aitor
 */
public class Controler {
    
    /**
     * Gets the View and the Model and shows the output.
     * @param view Defines the UI (text or GUI).
     * @param model Defines the greeting.
     */
    public void run(View view, Model model) {
        view.showGreeting(model.getGreeting());
    }
    
}
