/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclassesandinterfaces.people;

/**
 *
 * @author jeppjleemoritzled
 */
public class Student extends Person {

    private double gradeavg;

    public double getGradeavg() {
        return gradeavg;
    }

    public void setGradeavg(double gradeavg) {
        this.gradeavg = gradeavg;
    }

    @Override
    protected String toNiceString() {
        return super.toNiceString() +
               " Grade average: " + gradeavg;
    }

}
