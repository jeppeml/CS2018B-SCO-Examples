/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxsingletonexample.bll;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jeppjleemoritzled
 */
public class BLLManager {
    private static BLLManager instance=null;
    List<String> toys = new ArrayList();
    
    private BLLManager(){
    }
    
    public static BLLManager getInstance(){
        if(instance==null)
            instance = new BLLManager();
        
        return instance;
    }
    
    public void addToy(String toy){
        toys.add(toy);
    }
    
    public void removeToy(String toy){
        toys.remove(toy);
    }
    
    public List<String> getAllToys(){
        return toys;
    }
}
