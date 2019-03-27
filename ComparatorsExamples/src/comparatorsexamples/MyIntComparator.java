/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparatorsexamples;

import java.util.Comparator;

/**
 *
 * @author jeppjleemoritzled
 */
public class MyIntComparator implements Comparator<Integer>{

    private boolean descending;

    public MyIntComparator() {
        descending=false;
    }
    
    public MyIntComparator(boolean descending) {
        this.descending=descending;
    }

    
    @Override
    public int compare(Integer o1, Integer o2) {
        if (descending)
            return o2-o1;
        
        return o1-o2;
    }
    
}
