/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasetransactions;

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
    Person peter = new Person();
    @FXML
    private TextField txtName;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
        //peter.setName(txtName.getText());
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        peter.setId(1337666);
        peter.setName("Peter Stegger");
        txtName.setText(peter.getName());
        peter.nameProperty().bind(txtName.textProperty());
        tablePersons.getItems().add(peter);
        colId.setCellValueFactory(
                cell->cell.getValue().idProperty().asObject());
        colName.setCellValueFactory(
                cell->cell.getValue().nameProperty());
    }    
    
}
