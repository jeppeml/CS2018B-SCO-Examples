/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopsandarchitecturecandyshop.dal;

import java.util.ArrayList;
import java.util.List;
import loopsandarchitecturecandyshop.be.Candy;

/**
 *
 * @author jeppjleemoritzled
 */
public class CandyData {
    public List<Candy> getAllCandy()
    {
        ArrayList<Candy> candyList = new ArrayList();
        Candy gummiBear = new Candy();
        gummiBear.setName("Gummi Bear");
        gummiBear.setPrice(5.6);
        
        Candy jellyBeans = new Candy();
        jellyBeans.setName("Jelly Beans");
        jellyBeans.setPrice(4.3);
        
        Candy twix = new Candy();
        twix.setName("Twix");
        twix.setPrice(9.7);
        
        candyList.add(gummiBear);
        candyList.add(jellyBeans);
        candyList.add(twix);
        return candyList;
    }
}
