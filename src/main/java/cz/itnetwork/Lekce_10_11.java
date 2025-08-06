package cz.itnetwork;

import java.util.Scanner;

public class Lekce_10_11 {

    public static void main(String[] args) {

        /*
        System.out.println("Knock");
        System.out.println("Knock");
        System.out.println("Knock");
        System.out.println("Penny!");
         */

        /*
        for (int i = 0; i < 3; i++) {
            System.out.println("Knock");
        }
        System.out.println("Penny!");
         */

        /*
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
         */

        /*
        System.out.println("Malá násobilka pomocí dvou cyklů");
        for (int j = 1; j <= 10; j++) {
            for (int i = 1; i <= 10 ; i++){
                System.out.print((i * j) + " ");
            }
            System.out.println();
        }
         */

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mocninátor");
        System.out.println("==========");
        System.out.println("Zadejte základ mocniny: ");
        int zaklad = Integer.parseInt(scanner.nextLine());
        System.out.println("Zadejte exponent: ");
        int exponent = Integer.parseInt(scanner.nextLine());

        int vysledek = 1;
        for (int i = 0; i < exponent; i++) {
            vysledek = vysledek * zaklad;
        }

        System.out.println("Výsledek: " + vysledek);
        System.out.println("Děkuji za použití mocninátoru");
         */

        /*
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
         */

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vítejte v kalkulačce");
        String pokracovat = "ano";
        while (pokracovat.equals("ano")){
            System.out.println("Zadejte první číslo");
            double a = Double.parseDouble(scanner.nextLine());
            System.out.println("Zadejte druhé číslo");
            double b = Double.parseDouble(scanner.nextLine());
            System.out.println("Zvolte si operaci");
            System.out.println("1 - sčítání");
            System.out.println("2 - odčítání");
            System.out.println("3 - násobení");
            System.out.println("4 - dělení");
            int volba = Integer.parseInt(scanner.nextLine());
            double vysledek = 0;
            switch (volba) {
                case 1:
                    vysledek = a + b;
                    break;
                case 2:
                    vysledek = a - b;
                    break;
                case 3:
                    vysledek = a * b;
                    break;
                case 4:
                    vysledek = a / b;
                    break;
            }
            if ((volba > 0) && (volba < 5)) {
                System.out.println("Výsledek: " + vysledek);
            } else {
                System.out.println("Neplatná volba");
            }
            System.out.println("Přejete si zadat další příklad? [ano/ne]");
            pokracovat = scanner.nextLine();
        }
        System.out.println("Děkuji za použití kalkulačky");
         */

    }
}
