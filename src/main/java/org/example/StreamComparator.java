package org.example;

/**
 * Метод реализующий сравнение количества групп, входящих в Поток
 */
public class StreamComparator implements Comparable<Potok> {
    private Potok potok;

    public StreamComparator(Potok potok){
        this.potok = potok;
    }
    /**
 * Метод упорядывания потоков*/

    @Override
    public int compareTo(Potok o) {
        if(this.potok.sizeStudentPotokList() > o.sizeStudentPotokList())
            return 1;
        else if(this.potok.sizeStudentPotokList() < o.sizeStudentPotokList())
            return -1;
        else
            return 0;
    }
}
