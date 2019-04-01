/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmapexample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

/**
 *
 * @author jeppjleemoritzled
 */
public class HashMapExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String, Integer> citySizes = new HashMap();
        int i = 2;
        Integer iCool = 6;
        iCool.hashCode();
        iCool = null;
        
        citySizes.put("Esbjerg", 70_000);
        citySizes.put("Varde", 20_000);
        citySizes.put("Tokyo", 10_000_000);
        citySizes.put("Trump City", 5_498);
        
        // Expensive 
        for (Entry e: citySizes.entrySet()) {
            System.out.println("Key: " + e.getKey());
            System.out.println("Value: " + e.getValue());
        }
        
        ArrayList<Integer> sizes = 
                new ArrayList(citySizes.values());
        
        for (Integer size : sizes) {
            System.out.println(size);
        }
        
        // Very efficient O(1)
        System.out.println(citySizes.get("Esbjerg"));
        
    }
    
}
