/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxsingletonexample.gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafxsingletonexample.bll.BLLManager;

/**
 *
 * @author jeppjleemoritzled
 */
public class MainViewController implements Initializable {

    @FXML
    private TextField txtToy;
    @FXML
    private ListView<String> listInventory;
    
    BLLManager bll = new BLLManager();
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addToyClick(ActionEvent event) {
        // listInventory.getItems().add(txtToy.getText());
        // Add by BLLManager
        bll.addToy(txtToy.getText());
        // Update the ListView
        
        listInventory.getItems().clear();
        listInventory.getItems().addAll(bll.getAllToys());
    }
    
}
