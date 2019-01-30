/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menusanddynamicloading;

import javafx.event.*;

/**
 *
 * @author jeppjleemoritzled
 */
public class JeppesCloseEventHandler<ActionEvent> 
        implements EventHandler{

    @Override
    public void handle(Event event) {
        System.out.println("IT'S ALIIIIVE!");
    }
    
}
