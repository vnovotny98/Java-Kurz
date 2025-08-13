package cz.itnetwork;

import java.util.Scanner;

public class Cviceni_13_deset_prvku_pole {
    public static void main(String[] args){

        int[] cisla = new int[10];
        for (int i = 0; i < 10; i++) {
            cisla[9-i] = i + 1;
        }
        for (int cislo: cisla) {
            System.out.print(cislo + " \n");
        }
    }
}
