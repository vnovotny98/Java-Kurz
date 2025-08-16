package cz.itnetwork;

import java.util.Scanner;

public class Lekce_13_14 {

    public static void main(String[] args) {

        /*
        String jazyk = "Java";
        System.out.println(jazyk);
        System.out.println(jazyk.charAt(2));
        System.out.println(jazyk.indexOf('v'));

         */


        /*
        //řetězec který chceme analyzovat
        String hora = "Mount Everest";
        System.out.println(hora);
        hora = hora.toLowerCase();

        // inicializace počítadel
        int pocetSamohlasek = 0;
        int pocetSouhlasek = 0;

        // definice typků znaků
        String samohlasky = "aeiouyáéíóúůý";
        String souhlasky = "bcčdďfghjklmnpqrřsštťvwxyzž";

        // hlavní cyklus
        for (char znak : hora.toCharArray()) {
            if (samohlasky.contains(String.valueOf(znak))) {
                pocetSamohlasek++;
            } else if (souhlasky.contains(String.valueOf(znak))) {
                pocetSouhlasek++;
            }
        }
        System.out.printf("Samohlásek: %d\n", pocetSamohlasek);
        System.out.printf("Samohlásek: %d\n", pocetSouhlasek);
        System.out.printf("Nepísmenných znaků: %d\n", hora.length() - (pocetSamohlasek + pocetSouhlasek));

         */

        /*
        char znak; //znak
        int hodnotaAscii; //ordinální (ASCII) hodnota znaku

        //převedeme znak na jeho ASCII hodnotu
        znak = 'a';
        hodnotaAscii = (int)znak;
        System.out.printf("Znak %c jsme převedli na ASCII hodnotu %d%n", znak, hodnotaAscii);

        // Převedeme ASCII hnodotu na znak
        hodnotaAscii = 98;
        znak = (char)hodnotaAscii;
        System.out.printf("ASCII hodnotu %d jsme převedli na znak %c", hodnotaAscii, znak);

         */


        // CAESAROVA ŠIFRA

        // inicializace proměnných
        System.out.println("Zadej zprávu k šifrování");
        Scanner scanner = new Scanner(System.in);
        String puvodniZprava = scanner.nextLine();
        System.out.printf("Původní zpráva %s \n", puvodniZprava);
        String zasifrovanaZprava = "";
        int posun = 1;

        // cyklus projíždějící jednotlivé znaky
        for (char znak: puvodniZprava.toCharArray()) {
            int ascii = (int)znak;
            ascii += posun;
            // kontrola přetečení
            if (ascii > (int)'z') {
                ascii -=26;
            }
            znak = (char)ascii;
            zasifrovanaZprava += znak;
        }

        // výpis
        System.out.printf("Zašifrovaná zpráva: %s \n", zasifrovanaZprava);





    }
}

