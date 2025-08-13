package cz.itnetwork;

import java.util.Scanner;
import java.util.Arrays;

public class Cviceni_14_pole_ovoce_zelenina {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] zelenina = {"zelí", "okurka", "rajče", "paprika", "ředkev", "mrkev", "brokolice"};
        String[] ovoce = {"jablko", "hruška", "pomeranč", "jahoda", "banán", "kiwi", "malina"};

        int pocetslov = 0;
        String pokracovat = "ano";
        while (pokracovat.equals("ano")) {
            System.out.println("Zadej název libovolného ovoce nebo zeleniny:");
            String plodina = scanner.nextLine().toLowerCase();
            pocetslov +=1;

            Arrays.sort(zelenina);
            Arrays.sort(ovoce);
            int pozicezelenina = Arrays.binarySearch(zelenina, plodina);
            int poziceovoce = Arrays.binarySearch(ovoce, plodina);
            if (pozicezelenina >= 0) {
                System.out.println("Zadal jsi zeleninu");
            } else if (poziceovoce >= 0) {
                System.out.println("Zadal jsi ovoce");
            } else {
                System.out.println("Tvoje slovo nemám v seznamu");
            }
            System.out.println("Přejete si zadat další slovo? [ano/ne]");
            pokracovat = scanner.nextLine();
        }
        System.out.printf("Zadal jsi %d slov", pocetslov);
    }
}
