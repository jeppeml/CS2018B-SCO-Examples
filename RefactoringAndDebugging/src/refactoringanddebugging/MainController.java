/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactoringanddebugging;

import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import refactoringanddebugging.be.Patient;

/**
 *
 * @author jeppjleemoritzled
 */
public class MainController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
        Patient p = new Patient("230331-1756", "Peterino Stregoskyv");
        
        String note = p.getJournal().getNote();
        note = "Terminally ill";
        p.getJournal().setNote(note);
        long time = System.currentTimeMillis();
        String hey = "0";
        for (int i = 0; i < Integer.MAX_VALUE; i++)
        {
            if(hey.equals("0"))
            {}
            else if (hey.equals("1"))
                    {}
            else if (hey.equals("2")){}
        
        }
        /*switch (hey) {
            case "0":
                
                break;
            case "1":
                
                break;
            case "2":
                
                break;
            default:
                throw new AssertionError();
        }*/
        long end = System.currentTimeMillis();
        System.out.println("time = " + (end-time));
        System.out.println("Patients journal: " + p.getJournal());
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
