/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializationandobjects;

import java.io.Serializable;

/**
 *
 * @author jeppjleemoritzled
 */
public class Phone implements Serializable {
    private String make;
    private String model;

    public Phone( String make, String model) {
       
        this.make = make;
        this.model = model;
    }

    public Phone() {
    }
    
    

    

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" + "number=" + "removed" + ", make=" + make + ", model=" + model + '}';
    }
    
    
}
