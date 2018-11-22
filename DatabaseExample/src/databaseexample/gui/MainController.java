/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseexample.gui;

import databaseexample.be.Person;
import databaseexample.dal.PersonDAO;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

/**
 *
 * @author jeppjleemoritzled
 */
public class MainController implements Initializable {
    
    private Label label;
    @FXML
    private ListView<Person> lstPersons;
    
    private PersonModel model = new PersonModel();
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lstPersons.setItems(model.getPersons());
    }    

    @FXML
    private void clickLoadList(ActionEvent event) {
        // Load persons into list
        
        model.loadAllPersons();
    }

    @FXML
    private void clickDelete(ActionEvent event) {
        Person clickedPerson = 
                lstPersons.getSelectionModel().getSelectedItem();
        
        model.deletePerson(clickedPerson);
    }
    
}
