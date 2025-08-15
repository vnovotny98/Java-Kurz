package cz.itnetwork;

import java.util.Scanner;
import java.util.Arrays;

public class Cviceni_15_vypocet_median {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadej počet čísel: ");
        int pocet = Integer.parseInt(scanner.nextLine());
        int[] zadanecisla = new int[pocet];
        for (int i=0; i < pocet; i++){
            System.out.printf("Zadej %d. číslo: \n", i + 1);
            zadanecisla[i] = Integer.parseInt(scanner.nextLine());
        }

        int[] serazenacisla = zadanecisla.clone();
        Arrays.sort(serazenacisla);
        double median = serazenacisla[pocet/2];

        for (int i=0; i < pocet; i++){
            System.out.printf("%d se od mediánu odchyluje o %f \n", zadanecisla[i],zadanecisla[i]-median);
        }
    }
}
