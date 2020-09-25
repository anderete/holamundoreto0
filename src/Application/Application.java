package Application;
import Model.ModelFactory;
import Model.ModelImplementation;
import View.ViewFactory;
import View.ViewImplementation;
import Control.Controler;

/**
 * This is the application class for this hello world mvc app.
 * Saludos 
 */
public class Application {
    
    public static void main(String[] args) {
        ViewFactory viewFactory = new ViewFactory();
        ViewImplementation viewImplementation = new ViewImplementation();
        viewImplementation = (ViewImplementation) viewFactory.getView(1);
        
        ModelFactory modelFactory = new ModelFactory();
        ModelImplementation modelImplementation = new ModelImplementation();
        modelImplementation = (ModelImplementation) modelFactory.getModel();
        
        Controler controller = new Controler(viewImplementation, modelImplementation);
    }
    
}
