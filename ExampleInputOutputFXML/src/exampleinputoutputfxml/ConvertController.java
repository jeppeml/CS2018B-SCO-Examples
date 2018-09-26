/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exampleinputoutputfxml;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author jeppjleemoritzled
 */
public class ConvertController implements Initializable {

    @FXML
    private TextField inputbox;
    @FXML
    private Label resultlabel;
    @FXML
    private Button buttonConvert;
    @FXML
    private RadioButton radioTag;
    @FXML
    private ToggleGroup mygroup;
    @FXML
    private RadioButton radioTrim;
    @FXML
    private RadioButton radioCaps;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void converttextclick(ActionEvent event) {
        System.out.println("Nice...");
        String someInput = inputbox.getText();
        int intInput = Integer.parseInt(someInput);
        resultlabel.setText(""+intInput*2);
        System.out.println("dkffd");
        char[] ch = new char[7];
        String s = new String(ch);
        
        StringBuilder sb = new StringBuilder();
        sb.append("some");
        sb.append("some more");
        
        /*
        if(radioTag.isSelected())
        {
            resultlabel.setText("<" + someInput + ">");
        }
        else if(radioCaps.isSelected())
        {
            resultlabel.setText(someInput.toUpperCase());
        }
        else if(radioTrim.isSelected())
        {
            resultlabel.setText(someInput.trim());
        }*/
    }
/*
    @FXML
    private void onMouseEntered(MouseEvent event) {
        buttonConvert.setLayoutX(Math.random()*640);
        buttonConvert.setLayoutY(Math.random()*400);
    }
    */
}
