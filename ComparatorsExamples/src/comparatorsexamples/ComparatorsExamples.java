/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparatorsexamples;

import java.util.*;

/**
 *
 * @author jeppjleemoritzled
 */
public class ComparatorsExamples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[] ints = new Integer[5];
        Random r = new Random();
        for (int i = 0; i < ints.length; i++) {
            ints[i] = r.nextInt(15);
        }
        for (int i = 0; i < ints.length; i++) {
            Integer aInt = ints[i];
            System.out.println(i + ": " + aInt);
        }
        Comparator myComp = new MyIntComparator(true);
        
        Arrays.sort(ints,myComp);
        
        System.out.println("After sorting ;)");
        for (int i = 0; i < ints.length; i++) {
            Integer aInt = ints[i];
            System.out.println(i + ": " + aInt);
        }
    }
    
}
