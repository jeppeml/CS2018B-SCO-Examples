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
public class Robot {
    private String name; // Instance field
    
    private String brand;
    
    public void doSomething()
    {
        System.out.println("Dunno what to do?");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name; // return name;
    }
}
