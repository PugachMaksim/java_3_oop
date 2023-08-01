package org.example;

import java.util.Objects;

public class Student{
    private Integer numberOfStudent;
    private String secondName;
    private String firstName;
    private String lastName;
    public Student(Integer numberOfStudent, String secondName, String firstName, String lastName){
        this.firstName = firstName;
        this.numberOfStudent = numberOfStudent;
        this.lastName = lastName;
        this.secondName = secondName;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public void setNumberOfStudent(int numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(secondName, student.secondName) && Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(secondName, firstName, lastName);
    }

    @Override
    public String toString() {
        return "Student{" +
                "numberOfStudent=" + numberOfStudent +
                ", secondName='" + secondName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }


}
