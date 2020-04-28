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
class Student extends Person{
    private String id;
    private int grade;
    private ArrayList<String> enrolledClasses=new ArrayList();

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    protected String getId() {
        return id;
    }

    protected void setId(String id) {
        this.id = id;
    }

    void enrollClass(String cls) {
        this.enrolledClasses.add(cls);
    }

    void drop(String cls) {
        this.enrolledClasses.remove(cls);
    }

    void copy(Student student) {
        super.copy(student);
        this.id=student.getId();
        this.grade=student.getGrade();
        
    }
    
    @Override
    public String toString() {
        String rt="ID:"+this.id+"\n";
        rt+="Name:"+this.name+"\n";
        rt+="Grade:"+this.grade+"\n";
        rt+="Enrolled Classes:";
        for (String cls:this.enrolledClasses) {
            rt+=cls+" ";
        }
        rt+="\n";
        return rt;
    }
    
    
    
    
}
