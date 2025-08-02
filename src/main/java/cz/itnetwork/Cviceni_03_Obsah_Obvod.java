package cz.itnetwork;

import java.util.Scanner;

public class Cviceni_03_Obsah_Obvod
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadej poloměr kruhu (cm): ");

        Double polomer = Double.parseDouble(scanner.nextLine());
        System.out.println("Obvod zadaného kruhu je: " + 2 * 3.1415 * polomer);
        System.out.println("Jeho obsah je: " + 3.1415 * polomer * polomer);
    }
}
