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
public class StrategyExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TextStrategy strategy = new AddDogsStrategy();
        TextContext context = new TextContext(strategy);
        
        String text = "My pretty text...";
        System.out.println(text);
        System.out.println("Doing strategy...");
        String after = context.executeStrategy(text);
        System.out.println("New text: " + after);
        
        TextStrategy strat2 = new LowerCaseStrategy();
        String afterafter = strat2.useStrategy(after);
        System.out.println("Afterafter: " + afterafter);
    }
    
}
