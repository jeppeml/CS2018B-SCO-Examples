/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jfeonixexamples;

import com.jfoenix.controls.JFXSlider;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.validation.NumberValidator;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.util.StringConverter;

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
    private JFXTextField txtSomeInput;
    @FXML
    private JFXSlider slide;
    @FXML
    private JFXTextField txtOther;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        NumberValidator nv = new NumberValidator("This doesn't look like a number?");
        nv.setMessage("WRONG!");
        txtSomeInput.setValidators(nv);
        txtSomeInput.setText("");
        txtSomeInput.textProperty().addListener(
                (observable, oldValue, newValue) -> {
                    
            //nv.validate();
            try{
                Double d = Double.parseDouble(newValue);
            }
            catch (NumberFormatException nfe)
            {
                txtSomeInput.setText(oldValue);
            }
        });
        
        slide.valueProperty().addListener((observable, oldValue, newValue) -> {
            txtSomeInput.setText(newValue+"");
        });
        
        //txtOther.textProperty().bind(txtSomeInput.textProperty());
        txtOther.textProperty().set("df");
        
        Bindings.bindBidirectional(
                txtOther.textProperty(), slide.valueProperty(), new StringConverter<Number>() {
            @Override
            public String toString(Number num) {
                return num.toString();
            }

            @Override
            public Number fromString(String string) {
                try{
                    Double d = Double.parseDouble(string);
                    return d;
                }
                catch (NumberFormatException nfe)
                {
                    return 0;
                }
            }
           
        });
    }    
    
}
