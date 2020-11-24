/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 24-Nov-20
 *  Time: 10:48 AM
 */
package list;

import databean.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//creating ArrayList of user-defined class student
public class StudentList {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Student s1 = new Student();
        s1.setRollNo(11);
        s1.setName("Ramesh");
        Student s2 = new Student();
        s2.setRollNo(12);
        s2.setName("Vikas");
        Student s3 = new Student();
        s3.setRollNo(11);
        s3.setName("Ramesh");

        System.out.println(studentList.add(s1));
        System.out.println(studentList.add(s2));
        System.out.println(studentList.add(s3));

        System.out.println("list = " + studentList);

        //if you want to sort this list

        Collections.sort(studentList);
        System.out.println("list = " + studentList);
    }
}
