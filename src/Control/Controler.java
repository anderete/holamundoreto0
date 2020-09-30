package Control;

import Model.Model;
import View.View;


public class Controler {

    public void run(View view, Model model) {
        view.showGreeting(model.getGreeting());
    }
    
}
