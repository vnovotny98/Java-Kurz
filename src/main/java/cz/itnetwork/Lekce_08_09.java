package cz.itnetwork;

import java.util.Scanner;

public class Lekce_08_09 {

    public static void main(String[] args) {

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadej nějaké číslo, ze kterého spočítám odmocninu");
        int zaklad = Integer.parseInt(scanner.nextLine());
        if (zaklad >= 0) {
            System.out.println("Zadal jsi číslo větší nebo rovno 0, to znamená, že ho mohu odmocnit!");
            double odmocnina = Math.sqrt(zaklad);
            System.out.println("Odmocnina z čísla " + zaklad + " je " + odmocnina);
        }
        System.out.println("Děkuji za zadání");
        */

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadej nějaké číslo, ze kterého spočítám odmocninu");
        int zaklad = Integer.parseInt(scanner.nextLine());
        if (zaklad >= 0) {
            System.out.println("Zadal jsi číslo větší nebo rovno 0, to znamená, že ho mohu odmocnit!");
            double odmocnina = Math.sqrt(zaklad);
            System.out.println("Odmocnina z čísla " + zaklad + " je " + odmocnina);
        }
        else {
            System.out.println("Odmocnina ze záporného čísla neexistuje v oboru reálných čísel");
        }
        System.out.println("Děkuji za zadání");
        */


        /*
        int cislo = 0;

        if (cislo == 0) {
            cislo = 1;
        }
        else {
            cislo = 0;
        }

        System.out.println(cislo);
        */

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadej číslo v rozmezí 10-20: ");
        int cislo = Integer.parseInt(scanner.nextLine());
        if ((cislo >= 10) && (cislo <= 20)) {
            System.out.println("Zadal jsi správně");
        } else {
            System.out.println("Zadal jsi špatně");
        }
         */


        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadej číslo v rozmezí 10-20 nebo 30-40: ");
        int cislo = Integer.parseInt(scanner.nextLine());
        if (((cislo >= 10) && (cislo <= 20)) || ((cislo >=30) && (cislo <=40))) {
            System.out.println("Zadal jsi správně");
        } else {
            System.out.println("Zadal jsi špatně");
        }
         */

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vítejte v kalkulačce");
        System.out.println("Zadejte první číslo");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Zadejte druhé číslo");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Zvolte si operaci");
        System.out.println("1 - sčítání");
        System.out.println("2 - odčítání");
        System.out.println("3 - násobení");
        System.out.println("4 - dělení");
        int volba = Integer.parseInt(scanner.nextLine());
        double vysledek = 0;
        switch (volba) {
            case 1:
                vysledek = a + b;
                break;
            case 2:
                vysledek = a - b;
                break;
            case 3:
                vysledek = a * b;
                break;
            case 4:
                vysledek = a / b;
                break;
        }
        if ((volba > 0) && (volba < 5)) {
            System.out.println("Výsledek: " + vysledek);
        } else {
            System.out.println("Neplatná volba");
        }
        System.out.println();
        System.out.println("Děkuji za použití kalkulačky");
         */

    }
}
