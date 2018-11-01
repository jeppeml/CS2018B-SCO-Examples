/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclassesandinterfaces;

/**
 *
 * @author jeppjleemoritzled
 */
public abstract class Person {
    private String cprno;
    private String name;
    private String nationality;
    
    public abstract String toNiceString();

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
