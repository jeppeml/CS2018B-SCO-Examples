/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxsingletonexample.gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.control.ListView;
import javafxsingletonexample.bll.BLLManager;

/**
 * FXML Controller class
 *
 * @author jeppjleemoritzled
 */
public class StockViewController implements Initializable {

    @FXML
    private ListView<String> listInventory;
    BLLManager bll = BLLManager.getInstance();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void clickRefresh(ActionEvent event) {
        System.out.println("You refreshed");
        listInventory.getItems().clear();
        listInventory.getItems().addAll(bll.getAllToys());
    }
    
}
