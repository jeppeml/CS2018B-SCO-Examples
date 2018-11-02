/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonexample;

/**
 *
 * @author jeppjleemoritzled
 */
public class Game {
    private static Game instance=null;
    
    private int points;
    
    public static Game createInstance()
    {
        if(instance==null)
            instance = new Game();
        
        return instance;
    }
    
    private Game()
    {
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
    
    
}
