package org.example;

import java.util.Iterator;
import java.util.List;

public class PotokIterator implements Iterator<StudentGroup> {
    private int counter;
    private final List<StudentGroup> studentPotokList;
    public PotokIterator(Potok potok){
        this.studentPotokList = potok.getStudentPotokList();
        this.counter = 0;
    }

    @Override
    public void remove() {
        studentPotokList.remove(counter);
    }

    @Override
    public boolean hasNext() {
        return counter < studentPotokList.size()-1;
    }

    @Override
    public StudentGroup next() {
        if (!hasNext()){
            return null;
        }
        counter++;
        return studentPotokList.get(counter);
    }
}
