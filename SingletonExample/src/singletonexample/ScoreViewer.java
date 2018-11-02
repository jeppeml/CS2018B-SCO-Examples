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
public class ScoreViewer {
    private Game game = Game.createInstance();
    public void printCurrentScore() {
        System.out.println("Current score: " + game.getPoints());
    }
    
}
