/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasetransactions.dal;

import databasetransactions.Person;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jeppjleemoritzled
 */
public class PersonDAOMock implements PersonDAO {
    @Override
    public void add(Person p){
        // do stuff
    }
    
    @Override
    public void remove(Person p){
        // do stuff
    }
    
    @Override
    public Person get(int id){
        return null;
    }
    
    @Override
    public void update(Person p){
        // do stuff
    }

    @Override
    public List<Person> getAll() {
        ArrayList<Person> persons = new ArrayList();
        
        Person peter = new Person();
        peter.setId(1337666);
        peter.setName("Peter Stegger");
        
        persons.add(peter);
        
        Person peter2 = new Person();
        peter2.setId(0066600);
        peter2.setName("Piotr Strigenovskinov");
        
        persons.add(peter2);
        return persons;
        
    }

    @Override
    public void withdraw(Person p, float amount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
