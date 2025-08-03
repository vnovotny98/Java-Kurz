package cz.itnetwork;

import java.util.Scanner;

public class Cviceni_04_vek_uzivatele {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadej jméno: ");
        String jmeno = scanner.nextLine();

        System.out.println("Zadej příjmení: ");
        String prijmeni = scanner.nextLine();

        System.out.println("Zadej svůj věk");
        int vek = Integer.parseInt(scanner.nextLine());

        jmeno = jmeno.toUpperCase();
        prijmeni = prijmeni.toUpperCase();

        System.out.printf("%s %s\n",jmeno,prijmeni);
        System.out.printf("Za rok ti bude %d let.",vek+1);

    }
}
