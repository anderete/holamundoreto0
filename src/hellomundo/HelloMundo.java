/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellomundo;

import control.Controler;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.ModelFactory;
import view.ViewFactory;

/**
 *
 * @author ander
 */
public class HelloMundo extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        
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
