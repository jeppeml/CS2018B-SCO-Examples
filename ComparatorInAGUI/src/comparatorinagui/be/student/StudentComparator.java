/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparatorinagui.be.student;

import java.util.Comparator;

/**
 *
 * @author jeppjleemoritzled
 */
public class StudentComparator 
        implements Comparator<Student>{
    
    public enum SortType{
        id, name, grade
    }
    
    public enum SortOrder{
        asc, desc
    }
    
    private SortType sortType = SortType.id;
    private SortOrder sortOrder = SortOrder.asc;

    public StudentComparator() {
    }
    
    public StudentComparator(SortType st, SortOrder so) {
        sortType = st;
        sortOrder = so;
    }
    
    @Override
    public int compare(Student student1, Student student2) {
        if(sortOrder == SortOrder.desc)
        {
            Student temp = student1;
            student1 = student2;
            student2 = temp;
        }
        switch (sortType) {
            case id:
                return student1.getId() - student2.getId();
            case name:
                return student1.getName().compareTo(
                        student2.getName());
            case grade:
                return student1.getGrade()-student2.getGrade();
            default:
                throw new AssertionError();
        }
    }
    
}
