package main.java.Zadanie4;

import java.util.*;

public class Dziennik {

    private Map<String, Student> studentMap = new HashMap<>();


    public void addStudent(Student student){
        // uniesc w mapie studenta
        // kluczem wpisu jest indeks, wartoscia obiektu student
        studentMap.put(student.getIndeks(), student);
    }


    // usuwanie studenta po numerze indeksu
    public void removeStudent(Student student){
        // parametrem jest indeks a niei obiekt studenta
        studentMap.remove(student.getIndeks());
    }

    // metoda zwraca studenta po indeksie - OPCJA 1
    public Optional<Student> zwrocStudenta(String indexs){
        if(studentMap.containsKey(indexs)){
            return Optional.ofNullable(studentMap.get(indexs));
        }return Optional.empty();
    }

    // OPCJA 2
    public Student zwrocStudenta2(String index) throws StudentNotFoundException {
        if (studentMap.containsKey( index )){
            return studentMap.get( index );
        }
        throw new StudentNotFoundException("Student nie zostal znaleziony");
    }


    // metoda która przyjmuje indeks studenta i zwraca średnią ocen studenta

    public double podajŚredniąStudenta(String indeks) throws StudentNotFoundException {
        double sum = 0.0;
        Student studentKtoregoSredniaLiczymy = zwrocStudenta2(indeks);
        for (Double ocena : studentKtoregoSredniaLiczymy.getListaOcen()){
            sum += ocena;
        }
        return sum / studentKtoregoSredniaLiczymy.getListaOcen().size();
    }

    public List<Student> zwrocZagrozonych(){
        List<Student> listaWynikowa = new ArrayList<>();

        for(String indeks : studentMap.keySet()){
            try {
                if(podajŚredniąStudenta(indeks) <= 2.0){
                    listaWynikowa.add(studentMap.get(indeks));
                }
            }catch (StudentNotFoundException e){
                System.out.println("Nie mozna bylo odnalezc studenta.");
            }
        }
        return listaWynikowa;
    }


    public List<Student> zwrocPosortowanaListeStudentow(){
        // kopiuje wszystkich studentow z mapy do listy
        List<Student>studentList = new ArrayList<>(studentMap.values());

        studentList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int indeks1 = Integer.parseInt(o1.getIndeks());
                int indeks2 = Integer.parseInt(o2.getIndeks());
                return Integer.compare(indeks1, indeks2);
            }
        });
        return studentList;
    }

}

