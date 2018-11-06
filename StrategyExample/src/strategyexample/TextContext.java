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
public class TextContext {
    private TextStrategy strategy;
    
    public TextContext(TextStrategy strategy) {
        this.strategy = strategy;
    }

    public TextStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(TextStrategy strategy) {
        this.strategy = strategy;
    }
    
    public String executeStrategy(String input)
    {
        return strategy.useStrategy(input);
    }
    
}
