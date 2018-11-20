/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseexample.dal;

import databaseexample.be.Person;
import java.util.List;

/**
 *
 * @author jeppjleemoritzled
 */
public class DAOTest {
    public static void main(String[] args) {
        PersonDAO pdao = new PersonDAO();
        List<Person> persons = pdao.getAllPersons();
        
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
