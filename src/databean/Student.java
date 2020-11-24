/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 24-Nov-20
 *  Time: 10:38 AM
 */
package databean;

import java.util.Objects;

public class Student implements Comparable{
    private int rollNo;
    private String name;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("equals");
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getRollNo() == student.getRollNo() &&
                Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        System.out.println("hash code");
        return Objects.hash(getRollNo(), getName());
    }

    @Override
    public int compareTo(Object o) {
        if(this == o){
            return 0;
        }
        else{
            if(o instanceof Student) {
                return (this.getRollNo() - ((Student) o).getRollNo());
            }

        }
        return 0;
    }
}
