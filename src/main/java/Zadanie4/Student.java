package main.java.Zadanie4;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private List<Double> listaOcen = new ArrayList<>();
    private String indeks;
    private String Imie;
    private String Nazwisko;
    private int ocena;

    public String getIndeks() {
        return indeks;
    }

    public void setIndeks(String Indeks) {
        this.indeks = indeks;
    }

    public String getImie() {
        return Imie;
    }

    public void setImie(String imie) {
        Imie = imie;
    }

    public String getNazwisko() {
        return Nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        Nazwisko = nazwisko;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        ocena = ocena;
    }

    public List<Double> getListaOcen() {
        return listaOcen;
    }

    public void setListaOcen(List<Double> listaOcen) {
        this.listaOcen = listaOcen;
    }
}
