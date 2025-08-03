package cz.itnetwork;

import java.util.Scanner;

public class Cviceni_06_retezec_bez_ohledu_na_velikost_pismen {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadej řetězec: ");
        String vstup = scanner.nextLine();

        vstup = vstup.toLowerCase();
        System.out.println(vstup.contains("itnetwork"));
    }
}