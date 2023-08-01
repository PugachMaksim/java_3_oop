package org.example;

//        + Создать класс Поток, содержащий в себе список УчебныхГрупп и реализующий интерфейс Iterable;
//        + Создать класс StreamComparator, реализующий сравнение количества групп, входящих в Поток;
//        + Создать класс ПотокСервис, добавив в него метод сортировки списка потоков, используя созданный StreamComparator;
//        + Модифицировать класс Контроллер, добавив в него созданный сервис;
//        + Модифицировать класс Контроллер, добавив в него метод, сортирующий список потоков, путём вызова созданного сервиса
public class StudentController {
    private StudentGroupService studentGroupService;

    public static void main(String[] args){
        Student student1 = new Student(1, "Иванов", "Иван", "Иванович");
        Student student2 = new Student(2, "Иванова", "Светлана", "Юрьевна");
        Student student3 = new Student(3, "Захаров", "Петр", "Николаевич");
        Student student4 = new Student(4, "Захаров", "Вячеслав", "Николаевич");
        Student student5 = new Student(5, "Крючков", "Давид", "Александрович");
        Student student6 = new Student(6, "Синицына", "Ольга", "Максимавна");
        Student student7 = new Student(7, "Захарова", "Анастасия", "Викторовна");
        Student student8 = new Student(8, "Сажин", "Петр", "Маисеевич");

        StudentGroup studentGroup1 = new StudentGroup();
        StudentGroup studentGroup2 = new StudentGroup();
        StudentGroup studentGroup3 = new StudentGroup();

        studentGroup1.addStudents(student1);
        studentGroup1.addStudents(student2);
        studentGroup1.addStudents(student3);
        studentGroup1.addStudents(student4);
        studentGroup1.addStudents(student5);

        studentGroup2.addStudents(student6);
        studentGroup2.addStudents(student7);
        studentGroup2.addStudents(student8);

        studentGroup3.addStudents(student1);
        studentGroup3.addStudents(student2);


        StudentGroupService studentGroupService = new StudentGroupService();
        studentGroupService.setStudentGroup(studentGroup1);

        //System.out.println(studentGroup1);

        studentGroupService.removeStudent("Иванов", "Иван", "Иванович"); //Не удаляет, не найти ошибку...
        //System.out.println(studentGroup1);


        Potok potok1 = new Potok();
        Potok potok2 = new Potok();

        potok1.addStudentPotokList(1, studentGroup1);
        System.out.println("Количество групп в 1-м потоке -> " + potok1.sizeStudentPotokList());

        System.out.println(potok2.sizeStudentPotokList());
        potok2.addStudentPotokList(2, studentGroup2);
        potok2.addStudentPotokList(3, studentGroup3);

        System.out.println("Количество групп в 2-м потоке -> " + potok2.sizeStudentPotokList());

        StreamComparator p1 = new StreamComparator(potok1);
        StreamComparator p2 = new StreamComparator(potok2);


        System.out.println(p1.compareTo(potok2));
        System.out.println(p2.compareTo(potok1));






    }
}
