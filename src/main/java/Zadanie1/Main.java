package main.java.Zadanie1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {


        List<Integer> ListaInteger = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj ilosc wczytanych liczb od uzytkownika: ");

        /*int iloscOniegowPetliScanera = scan.nextInt();
        while((iloscOniegowPetliScanera--) > 0){
            int liczbaZaladowana = scan.nextInt();
            ListaInteger.add(liczbaZaladowana);
        }*/



        System.out.println("Ile elementow z listy ma byc podanych?");
        int odpowiedz = scan.nextInt();
        System.out.println("Ile elementow ma byc losowanych? ");
        int odpowiedz1 = scan.nextInt();

        System.out.println("Podaj" + odpowiedz + "liczb: ");
        for(int i = 0; i < odpowiedz; i++){
            int liczbaZaladowana = scan.nextInt();
            ListaInteger.add(liczbaZaladowana);
        }

        Random random = new Random();
        for(int i = 0; i < odpowiedz1; i++){
            int liczbaZaladowana = random.nextInt((int) 1000.);
            ListaInteger.add(liczbaZaladowana);
        }

        System.out.println("Lista elementow to: ");
        System.out.println(ListaInteger);

        int suma = 0;
        for(Integer elementListy : ListaInteger){
            suma += elementListy;
        }

        System.out.println("Suma elementow: " + suma);
        System.out.println("Srednia elementow: " + (suma / ListaInteger.size()));




    }
}