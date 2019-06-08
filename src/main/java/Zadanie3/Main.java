package main.java.Zadanie3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("123", "Piotr", "Nazwisko1", Gender.MESZCZYZNA));
        students.add(new Student("175", "Pawel", "Nazwisko2", Gender.MESZCZYZNA));
        students.add(new Student("224", "Patrycja", "Nazwisko3", Gender.KOBIETA));
        students.add(new Student("128", "Przemek", "Nazwisko4", Gender.MESZCZYZNA));
        students.add(new Student("133", "Marta", "Nazwisko5", Gender.KOBIETA));
        students.add(new Student("223", "Kasia", "Nazwisko6", Gender.KOBIETA));
        students.add(new Student("143", "MAgda", "Nazwisko7", Gender.MESZCZYZNA));

        // wypisanie pierwszego obiektu
        System.out.println(students.get(0));
        // wypisanie wszystkich, ustawienie zmiennej studentZListy
        for (Student studentZListy : students) {
            System.out.println(studentZListy);
        }
    }

}
