/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentaministration;

import java.util.ArrayList;

/**
 *
 * @author zhuan
 */
public class StudentDatabase {
    private int runningId=0;
    private ArrayList<Student> db=new ArrayList();
    public void add(Student student) {
        this.runningId++;
        student.setId(Integer.toString(runningId));
        this.db.add(student);
    }

    public void remove(String id) {
        Student student=this.findById(id);
        if (student!=null)
            this.db.remove(student);
    }

    public Student findById(String id) {
        for (Student student:this.db) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    public void save(Student student) {
        Student st=findById(student.getId());
        if (st==student) return;
        st.copy(student);
    }

    ArrayList<Student> getAllStudents() {
        return this.db;
    }
    
    
}
