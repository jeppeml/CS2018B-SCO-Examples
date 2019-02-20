/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasetransactions;

import javafx.beans.property.*;

/**
 *
 * @author jeppjleemoritzled
 */
public class Person {

    private final StringProperty name = new SimpleStringProperty();
    private final IntegerProperty id = new SimpleIntegerProperty();
    private final FloatProperty balance = new SimpleFloatProperty();

    public float getBalance() {
        return balance.get();
    }

    public void setBalance(float value) {
        balance.set(value);
    }

    public FloatProperty balanceProperty() {
        return balance;
    }
    
    
    public int getId() {
        return id.get();
    }

    public void setId(int value) {
        id.set(value);
    }

    public IntegerProperty idProperty() {
        return id;
    }
    
    public String getName() {
        return name.get();
    }

    public void setName(String value) {
        name.set(value);
    }

    public StringProperty nameProperty() {
        return name;
    }
    

}
