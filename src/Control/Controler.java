package Control;

import Model.ModelImplementation;
import View.ViewImplementation;


public class Controler {

    public Controler(ViewImplementation viewImplementation, ModelImplementation modelImplementation) {
        String greeting = modelImplementation.getGreeting();
        viewImplementation.showGreeting(greeting);
    }
    
}
