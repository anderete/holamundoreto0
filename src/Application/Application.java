package Application;
import Model.ModelFactory;
import Model.ModelImplementation;
import View.ViewFactory;
import View.ViewImplementation;
import Control.Controler;
import java.util.ResourceBundle;

/**
 * This is the application class for this hello world mvc app.
 * Saludos 
 */
public class Application {
    
    public static void main(String[] args) {
        ViewFactory viewFactory = new ViewFactory();
        ModelFactory modelFactory = new ModelFactory();
        ResourceBundle properties = ResourceBundle.getBundle("Model.Properties");
        
        int viewInstance = Integer.valueOf(properties.getString("viewInstance"));
        int modelInstance = Integer.valueOf(properties.getString("modelInstance"));
        
        Controler controler = new Controler();
        controler.run(viewFactory.getView(viewInstance),
                modelFactory.getModel(modelInstance));
    }
    
}
