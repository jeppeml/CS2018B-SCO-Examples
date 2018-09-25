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
        Scanner scanner = new Scanner(System.in); // get from keyboard input
        String userInput = scanner.nextLine(); // halt and wait for System.in
        System.out.println("Input: " + userInput);
    }
}
