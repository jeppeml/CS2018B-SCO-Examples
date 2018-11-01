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
public class Teacher extends Person{
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    protected String toNiceString() {
        return super.toNiceString() +
               " Salary: " + salary;
    }
    
    
}
