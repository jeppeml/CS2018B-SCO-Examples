/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparatorinagui.be.student;

import javafx.beans.property.*;

/**
 *
 * @author jeppjleemoritzled
 */
public class Student implements Comparable<Student>{

    private final IntegerProperty id = new SimpleIntegerProperty();
    private final StringProperty name = new SimpleStringProperty();
    private final IntegerProperty grade = new SimpleIntegerProperty();

    public Student() {
    }

    public Student(int id, String name, int grade) {
        this.id.set(id);
        this.name.set(name);
        this.grade.set(grade);
    }
    
    public int getGrade() {
        return grade.get();
    }

    public void setGrade(int value) {
        grade.set(value);
    }

    public IntegerProperty gradeProperty() {
        return grade;
    }

    public String getName() {
        return name.get();
    }

    public void setName(String value) {
        name.set(value);
    }

    public StringProperty nameProperty() {
        return name;
    }

    public int getId() {
        return id.get();
    }

    public void setId(int value) {
        id.set(value);
    }

    public IntegerProperty idProperty() {
        return id;
    }

    @Override
    public String toString() {
        return id.getValue() + ", name=" + 
               name.getValue() + ", grade=" + 
               grade.getValue();
    }

    @Override
    public int compareTo(Student other) {
        return this.id.getValue() - other.id.getValue();
    }

   
    
    
    
}
