/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cssstuff;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

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
    private AnchorPane potato;
    
    int rotation = 0;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        button.getStyleClass().clear();
        button.getStyleClass().add("specialhover");
        rotation += 15;
        // Almost never use setStyle
        button.setStyle("-fx-rotate:"+rotation);
        System.out.println("Style of button: " + button.getStyle());
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
