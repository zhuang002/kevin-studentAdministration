/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentaministration;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author zhuan
 */

public class StudentAministration {

    /**
     * @param args the command line arguments
     */
    static StudentDatabase studentDatabase=new StudentDatabase();
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        
        while (true) {
            System.out.print("StudentDB>>");
            String cmd=readInCommand();
            if (cmd.equalsIgnoreCase("quit"))
                break;
            else if (cmd.equalsIgnoreCase("help")) {
                printHelp();
            } else if (cmd.equalsIgnoreCase("add")) {
                addStudent();
            } else if (cmd.equalsIgnoreCase("remove")) {
                removeStudent();
            } else if (cmd.equalsIgnoreCase("profile")) {
                editProfile();
            } else if (cmd.equalsIgnoreCase("enroll")) {
                enrollClass();
            } else if (cmd.equalsIgnoreCase("drop")) {
                dropClass();
            }
            else if (cmd.equalsIgnoreCase("list")) {
                listStudents();
            }
            
        }
    }

    private static String readInCommand() {
        return sc.nextLine();
    }

    private static void printHelp() {
        System.out.println("cmd: [add, remove,quit,help,enroll,drop,profile,list]");
    }

    private static void addStudent() {

        Student student=new Student();
        System.out.print("StudentDB/add>Input name:");
        student.setName(sc.nextLine());
        System.out.print("StudentDB/add>Input age:");
        student.setAge(sc.nextInt());
        sc.nextLine();
        System.out.print("StudentDB/add>Input gender:");
        String gender=sc.nextLine();
        if (gender.equalsIgnoreCase("male")) 
            student.setGender(Gender.Male);
        else student.setGender(Gender.Female);
        System.out.print("StudentDB/add>Input grade:");
        student.setGrade(sc.nextInt());
        sc.nextLine();
        studentDatabase.add(student);
    }

    private static void removeStudent() {
        System.out.print("StudentDB/remove>Input student id:");
        String id=sc.nextLine();
        studentDatabase.remove(id);
    }

    private static void editProfile() {
        System.out.print("StudentDB/edit>Input student id:");
        String id=sc.nextLine();
        Student student=studentDatabase.findById(id);
        System.out.print("StudentDB/edit>Input name:");
        student.setName(sc.nextLine());
        System.out.print("StudentDB/edit>Input age:");
        student.setAge(sc.nextInt());
        sc.nextLine();
        System.out.print("StudentDB/edit>Input gender:");
        String gender=sc.nextLine();
        if (gender.equalsIgnoreCase("male")) 
            student.setGender(Gender.Male);
        else student.setGender(Gender.Female);
        System.out.print("StudentDB/edit>Input grade:");
        student.setGrade(sc.nextInt());
        sc.nextLine();
        studentDatabase.save(student);
    }

    private static void enrollClass() {
        System.out.print("StudentDB/enroll>Input student id:");
        String id=sc.nextLine();
        Student student=studentDatabase.findById(id);
        System.out.print("StudentDB/enroll>Input class id:");
        String cls=sc.nextLine();
        student.enrollClass(cls);
    }

    private static void dropClass() {
        System.out.print("StudentDB/drop>Input student id:");
        String id=sc.nextLine();
        Student student=studentDatabase.findById(id);
        System.out.print("StudentDB/drop>Input class id:");
        String cls=sc.nextLine();
        student.drop(cls);
    }

    private static void listStudents() {
        ArrayList<Student> students=studentDatabase.getAllStudents();
        for (Student st:students) {
            System.out.println(st);
        }
    }
    
    
    
    

    
}
