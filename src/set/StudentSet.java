/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 24-Nov-20
 *  Time: 10:39 AM
 */
package set;

import databean.Student;

import java.util.HashSet;
import java.util.Set;

//creating set of user-defined class
public class StudentSet {
    public static void main(String[] args) {
        Set<Student> studentSet = new HashSet<>();
        Student s1 = new Student();
        s1.setRollNo(11);
        s1.setName("Ramesh");
        Student s2 = new Student();
        s2.setRollNo(12);
        s2.setName("Vikas");
        Student s3 = new Student();
        s3.setRollNo(11);
        s3.setName("Ramesh");

        System.out.println(studentSet.add(s1));
        System.out.println(studentSet.add(s2));
        System.out.println(studentSet.add(s3));

        //printing the set
        System.out.println(studentSet);

    }
}
