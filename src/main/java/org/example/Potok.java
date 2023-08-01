package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Potok implements Iterable<StudentGroup> {

    public static List<StudentGroup>studentPotokList;
    int number;

    /**
     * Конструктор потока
     */


    public Potok(){
        studentPotokList = new ArrayList<>();
    }
    public Potok(int number, List<StudentGroup> studentPotokList){
        this.number = number;
        this.setStudentPotokList(studentPotokList);
    }

    public static List<StudentGroup> getStudentPotokList() {
        return studentPotokList;
    }

    public static void setStudentPotokList(List<StudentGroup> studentPotokList) {
        Potok.studentPotokList = studentPotokList;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    //    public List<StudentGroup>getStudentPotokList(){
//        return studentPotokList;
//    }
//    public void setStudentPotokList(List<StudentGroup> studentPotokList){
//        this.studentPotokList = studentPotokList;
//    }

    public int sizeStudentPotokList(){
        return studentPotokList.size();
    }


    /**
     * Добавление в поток группы
     */
    public void addStudentPotokList(int number, StudentGroup studentGroup) {
        {
            this.number = number;
            studentPotokList.add(studentGroup);
        }
    }

    @Override
    public PotokIterator iterator() {
        return new PotokIterator(this);
    }

}
