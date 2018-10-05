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
        Random rand = new Random(2);
        int size = 100;
        int[] myInts = new int[size];
        for (int i = 0; i < myInts.length-1; i++) {
            myInts[i] = i;//rand.nextInt(size);
            System.out.println(i+": "+myInts[i]);
        }
        myInts[size-1] = size+1;
        System.out.println(size-1+": "+myInts[size-1]);
        
        int whatImSearchingFor = size+1;
        
        //int index = linearSearch(myInts, whatImSearchingFor);
        int index = binarySearch(myInts, whatImSearchingFor);
        System.out.println("index: " + index);
        
        
        // TODO code application logic here
    }
    
    public static int binarySearch(int[] arr, int lookingFor)
    {
        int count = 0;
        int first = 0;
        int last = arr.length-1;
        int mid = 0;
        
        while(first <= last)
        {
            count++;
            mid = (last+first)/2;
            if(lookingFor == arr[mid])
            {
                System.out.println("Count: " + count);
                return mid;
            }    
            else if(lookingFor<arr[mid])
                last = mid - 1;
            else // if(lookingFor>arr[mid])
                first = mid + 1;
        }
        return -1;
    }
    
    public static int linearSearch(int[] arr, int lookingFor)
    {
        for (int i = 0; i < arr.length; i++) 
            if(lookingFor==arr[i])
                return i;
        
        return -1;
    }
    
}
