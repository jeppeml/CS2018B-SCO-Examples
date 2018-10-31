/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceandpolymorphism;

/**
 *
 * @author jeppjleemoritzled
 */
public class Humanoid extends Robot{

    @Override
    public void doSomething() {
        talk("I'll be back!");
    }
    
    public void talk(String whatToSay)
    {
        System.out.println("Humanoid " + getName() + 
                " says: " + whatToSay);
    }

    @Override
    public String getName() {
        return super.getName() + " Humanoid";
    }
    
    
}
