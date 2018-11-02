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
public class Play {
    private Game game = Game.createInstance();
    public void runGame(){
        for (int i = 0; i < 100; i++) {
            int points = game.getPoints();
            System.out.println("Points: " + game.getPoints());
            game.setPoints(points + 1);
            System.out.println("Points: " + game.getPoints());
        }
        
    }
}
