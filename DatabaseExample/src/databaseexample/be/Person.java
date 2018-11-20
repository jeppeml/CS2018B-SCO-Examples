/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseexample.be;

/**
 *
 * @author jeppjleemoritzled
 */
public class Person {
    private String cpr;
    private String name;
    private String job;

    public Person(String cpr, String name, String job) {
        this.cpr = cpr;
        this.name = name;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" + "cpr=" + cpr + ", name=" + name + ", job=" + job + '}';
    }
    
    public String getCpr() {
        return cpr;
    }

    public void setCpr(String cpr) {
        this.cpr = cpr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
    
    
}
