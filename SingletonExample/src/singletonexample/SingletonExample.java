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
public class SingletonExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Play p = new Play();
        p.runGame();
        
        ScoreViewer sv = new ScoreViewer();
        sv.printCurrentScore();
    }
    
}
