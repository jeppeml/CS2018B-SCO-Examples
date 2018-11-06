/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategyexample;

/**
 *
 * @author jeppjleemoritzled
 */
public class LowerCaseStrategy implements TextStrategy {

    @Override
    public String useStrategy(String input) {
        return input.toLowerCase();
    }
    
}
