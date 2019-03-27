/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparatorinagui;

import comparatorinagui.be.student.Student;
import comparatorinagui.be.student.StudentComparator;
import java.net.URL;
import java.util.Collections;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

/**
 *
 * @author jeppjleemoritzled
 */
public class MainController implements Initializable {
    
    @FXML
    private ListView<Student> lstStudents;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        
        StudentComparator comp =
                new StudentComparator(StudentComparator.SortType.grade, StudentComparator.SortOrder.asc);
        Collections.sort(lstStudents.getItems(), comp);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Student peter = new Student(1, "Peter Stegger", -3);
        Student jeppe = new Student(0, "Jeppe M Led", 12);
        Student piotr = new Student(2, "Piotr Stegonovsky", 0);
        lstStudents.getItems().addAll(peter, jeppe, piotr);
    }    

    @FXML
    private void shuffleClick(ActionEvent event) {
        Collections.shuffle(lstStudents.getItems());
    }
    
}
