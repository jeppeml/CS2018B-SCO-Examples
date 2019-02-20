/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasetransactions.gui;

import databasetransactions.Person;
import databasetransactions.bll.BLLManager;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

/**
 *
 * @author jeppjleemoritzled
 */
public class MainController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button button;
    @FXML
    private TableView<Person> tablePersons;
    @FXML
    private TableColumn<Person, String> colName;
    @FXML
    private TableColumn<Person, Integer> colId;
    @FXML
    private TableColumn<Person, Float> colBalance;
    
    
    @FXML
    private TextField txtName;
    BLLManager bllmgr = new BLLManager();
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tablePersons.getItems().clear();
        tablePersons.getItems().addAll(bllmgr.getAll());

        colId.setCellValueFactory(
                cell->cell.getValue().idProperty().asObject());
        colName.setCellValueFactory(
                cell->cell.getValue().nameProperty());
        colBalance.setCellValueFactory(
                cell->cell.getValue().balanceProperty().asObject());
    }    

    @FXML
    private void btnSaveBalanceClick(ActionEvent event) {
    }
    
}
