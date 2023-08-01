package org.example;

import java.util.List;

public class StudentGroupService {
    private StudentGroup studentGroup;

    public StudentGroupService(StudentGroup studentGroup){
        this.studentGroup = studentGroup;
    }

    public StudentGroupService(){
        this.studentGroup = new StudentGroup();
    }

    public void setStudentGroup(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }

    public boolean removeStudent(String firstName, String secondName, String lastName){
        Student removeStudent = new Student(null, secondName, firstName, lastName);
        if (studentGroup.getStudents()==null) return false;
        List<Student> studentList = studentGroup.getStudents();
        for (Student student: studentList) {
            if (student.equals(removeStudent)){
                studentList.remove(student);
                return true;
            }
        }
        return false;
    }

}
