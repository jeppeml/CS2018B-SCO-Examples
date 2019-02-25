/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasetransactions.dal;

import databasetransactions.Person;
import java.util.List;

/**
 *
 * @author jeppjleemoritzled
 */
public interface PersonDAO {

    public void add(Person p);

    public Person get(int id);
    
    public List<Person> getAll();

    public void remove(Person p);

    public void update(Person p);
    
    public void withdraw(Person p, float amount);
    
}
