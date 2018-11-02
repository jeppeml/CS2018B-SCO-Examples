/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxsingletonexample.gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
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
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("StockView.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) new Stage();
            stage.setScene(scene);
            stage.show();
        }
        catch (IOException ex) {
            Logger.getLogger(StockViewController.class.getName()).log(Level.SEVERE, null, ex);
        }
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
