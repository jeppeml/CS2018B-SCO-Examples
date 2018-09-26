/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringmanipulation;

import java.util.Scanner;

/**
 *
 * @author jeppjleemoritzled
 */
public class StringManipulation{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Rhello! World");
        // get from keyboard input
        Scanner scanner = new Scanner(System.in); 
        // halt and wait for System.in
        
        String userInput = scanner.nextLine(); 
        String mystring = "";
        char ch = 'c';
      
        for (int i = 0; i < userInput.length(); i++) {
            char firstCharacter = userInput.toCharArray()[i];
            // or use: 
            // char firstCharacter = userInput.charAt(i);
            System.out.println("Input: " + firstCharacter);
        }
    }
}
