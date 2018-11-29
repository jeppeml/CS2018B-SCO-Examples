/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageonbuttonexample;

import com.sun.jndi.toolkit.url.Uri;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author jeppjleemoritzled
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button button;
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws MalformedURLException {
        Path dir = FileSystems.getDefault().getPath("./images/justin.jpg");
        Image image = new Image(dir.toUri().toURL().toExternalForm());
        button.setGraphic(new ImageView(image));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
