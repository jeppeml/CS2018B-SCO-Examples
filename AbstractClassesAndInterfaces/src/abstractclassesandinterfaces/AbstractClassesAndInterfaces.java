/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclassesandinterfaces;

import java.util.ArrayList;

/**
 *
 * @author jeppjleemoritzled
 */
public class AbstractClassesAndInterfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person p = new Teacher();
        Person p2 = new Student();
        // Teacher t = new Person(); not allowed
        
        ArrayList<Student> studentList = new ArrayList();
        ArrayList<Teacher> teacherList = new ArrayList();
        
        Teacher t1 = new Teacher();
        t1.setName("Peter");
        t1.setCprno("030303-0302");
        t1.setSalary(5000.0);
        teacherList.add(t1);
        
        Teacher t2 = new Teacher();
        t1.setName("Jeppe");
        t1.setCprno("050505-0305");
        t1.setSalary(15000.0);
        teacherList.add(t2);
        
        System.out.println("Teachers:");
        System.out.println("-------------------");
        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }
        System.out.println("-------------------");
        
        System.out.println("Students:");
        System.out.println("-------------------");
        for (Student student : studentList) {
            System.out.println(student);
        }
        System.out.println("-------------------");
    }
    
}
