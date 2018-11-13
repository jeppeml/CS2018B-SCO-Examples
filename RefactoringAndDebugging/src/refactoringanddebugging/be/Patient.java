/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactoringanddebugging.be;

/**
 *
 * @author jeppjleemoritzled
 */
public class Patient {
    private String cpr;
    private String name;
    private Journal journal;

    public Patient(String cpr, String name) {
        Integer.parseInt(cpr.charAt(0)+""); // check if first letter is number
        this.cpr = cpr;
        this.name = name;
        this.journal = new Journal();
    }

    public Journal getJournal() {
        return journal;
    }

    public String getCpr() {
        return cpr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
