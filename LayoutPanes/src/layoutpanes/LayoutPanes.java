/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layoutpanes;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;

/**
 *
 * @author jeppjleemoritzled
 */
public class LayoutPanes extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Pane root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        
        for (Node node : root.getChildren()) {
            if(node instanceof HBox){
                for (int i = 0; i < 10; i++) {
                    Button button = new Button("Testing " + i);
                    ((HBox) node).getChildren().add(button);
                }
            }
            
        }
        for (Node node : root.getChildren()) {
            if(node.getId().equals("vboxtop"))
            {
                for (int i = 0; i < 10; i++) {
                    Button button = new Button("vboxtop " + i);
                    ((VBox) node).getChildren().add(button);
                    button.setOnAction(e->{
                        ((Button)e.getSource()).setText("Rhello!");
                    });
                }
                node.setStyle(node.getStyle()+"-fx-background-color:lightblue");
            }
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
