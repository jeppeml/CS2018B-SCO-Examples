/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseexample.gui;

import databaseexample.be.Person;
import databaseexample.dal.PersonDAO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author jeppjleemoritzled
 */
public class PersonModel {
    PersonDAO pdao = new PersonDAO();
    private ObservableList<Person> persons = 
            FXCollections.observableArrayList();

    public ObservableList<Person> getPersons() {
        return persons;
    }
    
    public void deletePerson(Person p)
    {
        persons.remove(p);
        pdao.deletePerson(p); // Remove from DB
    }
    
    public void loadAllPersons()
    {
        persons.clear();
        persons.addAll(pdao.getAllPersons());
    }
    
}
