package main.java.Zadanie3;

public class Student {

    private String index;
    private String imie;
    private String nazwisko;
    private Gender gender;

    public Student(String Index, String imie, String nazwisko, Gender gender) {
        this.index = index;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.gender = gender;


    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getIndex() {
        return imie;
    }

    public void setIndex(String imie) {
        this.imie = imie;
    }

    @Override
    public String toString() {
        return "Student{" +
                "index='" + index + '\'' +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", gender=" + gender +
                '}';
    }
}
