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
public class Lawnmower extends Robot{

    @Override
    public void doSomething() {
        cutTheGrass();
    }

    @Override
    public String getName() {
        return super.getName() + " Lawnmower"; //To change body of generated methods, choose Tools | Templates.
    }
    
    public void cutTheGrass()
    {
        System.out.println("Cutting the grass");
    }
    
}
