/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellomundo;

import control.DAO;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import model.ModelFactory;

/**
 *   
 * @author ander
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    public Label label;
    
    @FXML

    @Override
    public void initialize(URL url, ResourceBundle rb) {
       String opc = null;
      /* ModelFactory modelFactory = new ModelFactory();

       opc=modelFactory.getModel(1); no tira
       */
   
       label.setText(opc);
      
    }    
    
}
