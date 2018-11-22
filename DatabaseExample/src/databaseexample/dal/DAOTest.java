/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseexample.dal;

import databaseexample.be.Person;

/**
 *
 * @author jeppjleemoritzled
 */
public class DAOTest {
    public static void main(String[] args) {
        PersonDAO pdao = new PersonDAO();
        /*List<Person> persons = pdao.getAllPersons();
        
        for (Person person : persons) {
            System.out.println(person);
        }*/
        
        Person peter = pdao.createPerson("324-34-5424", 
                "Piotr Stregovskij", "Slacker");
        
        Person p = pdao.getPerson(peter.getCpr());
        System.out.println("Fetched person: " + p);
        
        p.setJob("Über Slacker 2.0");
        p.setName("Piotr Gormanov Stregovskij");
        pdao.updatePerson(p);
        
        p = pdao.getPerson(peter.getCpr());
        System.out.println("Fetched UPDATED person: " + p);
        
        pdao.deletePerson(p);
        p = pdao.getPerson(peter.getCpr());
        if(p==null)
            System.out.println("Success, Person is gone forever");
        else
            System.out.println("ERROR!!! ERROR!!!");
    }
}
