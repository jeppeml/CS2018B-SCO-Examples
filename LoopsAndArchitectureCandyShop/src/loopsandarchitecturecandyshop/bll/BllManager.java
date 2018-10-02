/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopsandarchitecturecandyshop.bll;

import java.util.List;
import loopsandarchitecturecandyshop.be.Candy;
import loopsandarchitecturecandyshop.dal.CandyData;

/**
 *
 * @author jeppjleemoritzled
 */
public class BllManager {
    CandyData candyDal = new CandyData();
    
    public List<Candy> getAllCandy()
    {
        return candyDal.getAllCandy();
    }
}
