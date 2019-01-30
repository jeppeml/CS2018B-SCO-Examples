/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menusanddynamicloading;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;

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
    private AnchorPane internalPane;

    @FXML
    private BorderPane topBorderPane;
        
    AnchorPane otherPane = null;
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        label.setText("");
        if(otherPane==null){
            label.setText("Hello World!");
            otherPane = FXMLLoader.load(getClass().getResource("Other.fxml"));
            
            AnchorPane.setTopAnchor(otherPane, 47d);
            internalPane.getChildren().add(otherPane);
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        MenuBar bar = new MenuBar();
        Menu fileMenu = new Menu("File");
        bar.getMenus().add(fileMenu);
        MenuItem close = new MenuItem("Close");
        fileMenu.getItems().add(close);
        close.setOnAction(new JeppesCloseEventHandler<>());
        close.setOnAction(new JeppesOtherEventHandler<>());
        close.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Handling with anonymous class"); 
        }});
        
        close.setOnAction((ActionEvent event) -> {
            System.out.println("Handling with lambda class (anon class as well)"); 
        });
        
        close.setOnAction(    
            event -> {
                System.out.println("Handling close with lambda, unnamed parameter");
                System.exit(0);
            });
    
        
        topBorderPane.setTop(bar);
        
        ContextMenu ctx = new ContextMenu();
        MenuItem whatIs = new MenuItem("What is?");
        ctx.getItems().add(whatIs);
        
        whatIs.setOnAction(e->{System.out.println("Is: " + e.getSource());});
        
        button.addEventHandler(MouseEvent.MOUSE_CLICKED, 
            new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event) {
                if(event.getButton()==MouseButton.SECONDARY)
                    ctx.show(button, event.getScreenX(), event.getScreenY());
                    
            }
        });
        
    }    
    private class JeppesOtherEventHandler<ActionEvent> implements EventHandler{

        @Override
        public void handle(Event event) {
            System.out.println("Other ALLIIVIVE!");
        }
        
    }
}
