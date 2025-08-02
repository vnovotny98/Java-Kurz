package cz.itnetwork;

import java.util.Scanner;

public class Cviceni_01_Bill_Gates {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ahoj, jak se jmenuješ?");
        String jmeno = scanner.nextLine();
        System.out.println("Jaký jsi?");
        String vlastnost = scanner.nextLine();
        System.out.println(jmeno + " je " + vlastnost);

    }
}