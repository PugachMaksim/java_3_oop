package org.example;

import java.util.ArrayList;
import java.util.List;

public class StudentGroup implements Iterable<Student> {
    private List<Student>students;
    public StudentGroup(){
        students = new ArrayList<>();
    }
//    public StudentGroup(List<Student>students){
//        setStudents(students);
//    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
    public void addStudents(Student student){
        if(students != null){
            students.add(student);
        }
    }
    @Override
    public String toString() {
        return "StudentGroup{" +
                "students=" + students +
                '}';
    }

    @Override
    public StudentGroupIterator iterator() {
        return new StudentGroupIterator(this);
    }
}
