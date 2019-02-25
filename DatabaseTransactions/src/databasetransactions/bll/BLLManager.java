/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasetransactions.bll;

import databasetransactions.Person;
import databasetransactions.dal.*;
import java.util.List;

/**
 *
 * @author jeppjleemoritzled
 */
public class BLLManager {
    PersonDAO persondao = new PersonDAODB();
    
    public void withdraw(Person p, float amount){
        persondao.withdraw(p, amount);
    }
    
    public void addPerson(Person p){
        persondao.add(p);
    }
    
    public List<Person> getAll(){
        return persondao.getAll();
    }

    public Person getPerson(int id){
        return persondao.get(id);
    }

    public void removePerson(Person p){
        persondao.remove(p);
    }

    public void updatePerson(Person p){
        persondao.update(p);
    }
}
