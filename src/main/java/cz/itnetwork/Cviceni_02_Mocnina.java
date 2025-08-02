package cz.itnetwork;

import java.util.Scanner;

public class Cviceni_02_Mocnina
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadej číslo k umocnění: ");
        int cislo = Integer.parseInt(scanner.nextLine());
        System.out.println("Výsledek: " + cislo*cislo);
    }
}
