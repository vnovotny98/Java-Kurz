package cz.itnetwork;

import java.util.Arrays;
import java.util.Scanner;

public class Lekce_12 {
    public static void main(String[] args){
        /*
        int[] cisla = new int[10];
        for (int i = 0; i < 10; i++) {
            cisla[i] = i + 1;
        }
        for (int i = 0; i < cisla.length; i++) {
            System.out.print(cisla[i] + " ");
        }
         */

        /*
        int[] cisla = new int[10];
        for (int i = 0; i < 10; i++) {
            cisla[i] = i + 1;
        }
        for (int cislo: cisla) {
            System.out.print(cislo + " ");
        }
         */

        /*
        String[] simpsonovi = {"Homer","Marge","Bart","Lisa","Maggie"};
        Arrays.sort(simpsonovi);
        for (String simpson: simpsonovi) {
            System.out.print(simpson + " ");
        }
        */

        /*
        Scanner scanner = new Scanner(System.in);
        String[] simpsonovi = {"Homer","Marge","Bart","Lisa","Maggie"};
        System.out.println("Zadej Simpsona (z rodiny Simpsonů): ");
        String simpson = scanner.nextLine();

        Arrays.sort(simpsonovi);
        int pozice = Arrays.binarySearch(simpsonovi, simpson);
        if (pozice >= 0) {
            System.out.println("Jo, to je  Simpson");
        }
        else {
            System.out.println("Hele, tohle není Simpson");
        }
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ahoj, spočítám ti průměr známek. Kolik známek zadáš?");
        int pocetZnamek = Integer.parseInt(scanner.nextLine());
        int[] znamky = new int[pocetZnamek];
        for (int i = 0; i < pocetZnamek; i++) {
            System.out.printf("Zadejte %d. číslo: \n", i + 1);
            znamky[i] = Integer.parseInt(scanner.nextLine());
        }
        // spočítání průměru
        int soucet = 0;
        for (int znamka: znamky) {
            soucet += znamka;
        }
        double prumer = soucet / (double)znamky.length;

        System.out.printf("Průměr tvých známek je: %.1f", prumer);
    }
}
