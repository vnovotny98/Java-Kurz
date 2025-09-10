package cz.itnetwork;

import java.util.Scanner;

public class Cviceni_18_vigenerova_sifra {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadejte text k zašifrování: ");
        String puvodniZprava = scanner.nextLine();

        System.out.println("Zadejte heslo: ");
        String heslo = scanner.nextLine();

        char[] zasifrovanaZprava = new char[puvodniZprava.length()];

        for (int i = 0; i < puvodniZprava.length(); i++) {
            int posun = heslo.charAt(i % heslo.length()) - 96; // 'a' => 1

            System.out.printf("i je: %d a heslo.length je: %d \n", i , heslo.length());

            int znak = puvodniZprava.charAt(i) - 97;           // 'a' => 0

            znak = (znak + posun) % 26; // posun v abecedě

            zasifrovanaZprava[i] = (char) (znak + 97); // zpět na 'a'–'z'
        }

        System.out.printf("Zašifrovaná zpráva: %s\n", new String(zasifrovanaZprava));
    }
}
        /*
        for (int i = 0; i < puvodniZprava.length(); i++) {
            hesloAscii[i] = (int) heslo.charAt(i);
        }

        int[] hesloAscii = new int [puvodniZprava.length()];


        for (int value : hesloAscii) {
            System.out.print(value + " ");
        }

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


         */

