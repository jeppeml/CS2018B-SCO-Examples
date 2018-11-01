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
public abstract class Person {
    protected String cprno;
    protected String name;
    protected String nationality;

    @Override
    public String toString() {
        return toNiceString();
    }
    
    protected String toNiceString(){
        return "Name : " + getName() +  " " +
               "CPR-Number : " + getCprno() + " " +
               "Nationality : " + getNationality();
    }

    public String getCprno() {
        return cprno;
    }

    public void setCprno(String cprno) {
        this.cprno = cprno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    
    
}
