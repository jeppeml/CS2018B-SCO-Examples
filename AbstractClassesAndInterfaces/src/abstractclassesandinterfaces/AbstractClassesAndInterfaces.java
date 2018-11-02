/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclassesandinterfaces;

import abstractclassesandinterfaces.people.Student;
import abstractclassesandinterfaces.people.Person;
import abstractclassesandinterfaces.people.Teacher;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jeppjleemoritzled
 */
public class AbstractClassesAndInterfaces{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JeppeList jl = new JeppeList();
        
        Person p = new Teacher();
        Person p2 = new Student();
        // Teacher t = new Person(); not allowed
        
        List<Student> studentList = new ArrayList();
        List<Teacher> teacherList = new ArrayList();
        
        Teacher t1 = new Teacher();
        t1.setName("Peter");
        t1.setCprno("030303-0302");
        t1.setSalary(5000.0);
        teacherList.add(t1);
        
        Teacher t2 = new Teacher();
        t2.setName("Jeppe");
        t2.setCprno("050505-0305");
        t2.setSalary(15000.0);
        teacherList.add(t2);
        
        Student s1 = new Student();
        s1.setName("Bent");
        s1.setCprno("070809-1405");
        s1.setGradeavg(7.33);
        studentList.add(s1);
        
        
        List<Person> allPersons = new ArrayList();
        allPersons.addAll(teacherList);
        allPersons.addAll(studentList);
        
        System.out.println("Teachers:");
        System.out.println("-------------------");
        for (Teacher teacher : teacherList) {
            System.out.println(teacher.toString());
        }
        System.out.println("-------------------");
        
        System.out.println("Students:");
        System.out.println("-------------------");
        for (Student student : studentList) {
            System.out.println(student.toString());
        }
        System.out.println("-------------------");
        
        System.out.println("All Persons:");
        System.out.println("-------------------");
        for (Person person : allPersons) {
            System.out.println(person.toString());
        }
        System.out.println("-------------------");
    }
    
}
