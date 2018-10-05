/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchinglistsandarrays;

import java.util.Random;

/**
 *
 * @author jeppjleemoritzled
 */
public class SearchingListsAndArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        int size = 100;
        int[] myInts = new int[size];
        for (int i = 0; i < myInts.length-1; i++) {
            myInts[i] = rand.nextInt(size);
            System.out.println(i+": "+myInts[i]);
        }
        myInts[size-1] = size+1;
        System.out.println(size-1+": "+myInts[size-1]);
        
        int whatImSearchingFor = size+1;
        
        int index = linearSearch(myInts, whatImSearchingFor);
        System.out.println("index: " + index);
        
        
        // TODO code application logic here
    }
    
    public static int linearSearch(int[] arr, int lookingFor)
    {
        for (int i = 0; i < arr.length; i++) 
            if(lookingFor==arr[i])
                return i;
        
        return -1;
    }
    
}
