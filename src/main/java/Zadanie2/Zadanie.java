package main.java.Zadanie2;

import java.util.*;

public class Zadanie {

    public static void main(String[] args) {

        List<Integer> Lista = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int liczbaZaladowana = random.nextInt((int) 100.);
            Lista.add(liczbaZaladowana);
        }

        System.out.println("Lista elementow to: ");
        System.out.println(Lista);

        int suma = 0;
        for (Integer elementListy : Lista) {
            suma += elementListy;
        }

        System.out.println("Srednia elementow: " + (suma / Lista.size()));


        // kopiowanie elementoe listy A do listy B
        List<Integer> lisataB = new ArrayList<>(Lista);

        System.out.println("Suma elementow: " + suma);

        Collections.sort(lisataB);
        System.out.println(lisataB);


        if (lisataB.size() % 2 == 0) { // parzysta
            int indeksLewySrodkowy = (lisataB.size() / 2) - 1;
            int indeksPrawySrodkowy = (lisataB.size() / 2);

            double mediana = (lisataB.get(indeksLewySrodkowy) + lisataB.get(indeksLewySrodkowy)) / 2.0;
            System.out.println("Mediana: " + mediana);
        } else {
            int indeksSrodkowy = (lisataB.size() / 2);
            int mediana = lisataB.get(indeksSrodkowy);
            System.out.println("Mediana: " + mediana);
        }

        int min = Lista.get(0);
        int max = Lista.get(0);
        for (Integer elmentListy : Lista) {
            if (min > elmentListy) {
                min = elmentListy;
            }
            if (max < elmentListy) {
                max = elmentListy;
            }
        }
        System.out.println("Min: " + min + "   Max: " + max);

        // znajowanie indeksu max i min
        int indexMax = 0;
        int indexMin = 0;
        for (int i = 0; i < Lista.size(); i++) {
            if (max == Lista.get(i)) {
                indexMax = i;
            }
            if (min == Lista.get(i)) {
                indexMin = i;
            }
            System.out.println("Index max" + indexMax);
            System.out.println("Index min" + indexMin);
        }

            // znajdowanie indeksow maksymalnego i minimalnego elementu
            System.out.println("Index max (indexof) " + Lista.indexOf(max));
            System.out.println("Index min (indexof) " + Lista.indexOf(min));


        }
    }

