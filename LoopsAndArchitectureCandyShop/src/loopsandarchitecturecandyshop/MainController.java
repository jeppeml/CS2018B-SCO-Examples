/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopsandarchitecturecandyshop;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import loopsandarchitecturecandyshop.be.Candy;
import loopsandarchitecturecandyshop.bll.BllManager;

/**
 *
 * @author jeppjleemoritzled
 */
public class MainController implements Initializable {

    @FXML
    private ListView<Candy> listCandy;
    
    @FXML
    private TextField txtAmount;
    
    private BllManager bll = new BllManager();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        List<Candy> candyList = bll.getAllCandy();
        listCandy.getItems().addAll(candyList);
    }    

    @FXML
    private void pressBuyButton(ActionEvent event) {
    }
    
}
