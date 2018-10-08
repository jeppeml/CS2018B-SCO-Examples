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
    public static void main(String[] args) throws InterruptedException {
        String[][] board = new String[3][3];
        
        board[1][1] = "O";
        
        
        
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
        
        int indexl = linearSearch(myInts, whatImSearchingFor);
        
        System.out.println("index linear: " + indexl);
        int index = binarySearch(myInts, whatImSearchingFor);
        System.out.println("index: " + index);
        
        
        // TODO code application logic here
    }
    
    public static int binarySearch(int[] arr, int lookingFor) throws InterruptedException
    {
        int count = 0;
        int first = 0;
        int last = arr.length-1;
        int mid = 0;
        
        while(first <= last)
        {
            Thread.sleep(100);
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
    
    public static int linearSearch(int[] arr, int lookingFor) throws InterruptedException
    {
        int count = 0;
        for (int i = 0; i < arr.length; i++) 
        {
            
            count++;
            Thread.sleep(100);
            if(lookingFor==arr[i])
            {
                System.out.println("Linear count: " + count);
                return i;
            }
        }
        
        return -1;
    }
    
}
