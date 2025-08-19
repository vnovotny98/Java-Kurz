package cz.itnetwork;

import java.util.Scanner;

public class Cviceni_17_retezec_palindrom {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadej palindrom: ");
        String slovo = scanner.nextLine();

        int index = slovo.length();
        String opacneSlovo = "";

        for (int i = index - 1 ; i >= 0; i--) {
            char znak = slovo.charAt(i);
            opacneSlovo += znak;
        }

        System.out.printf("Opačné slovo: %s\n", opacneSlovo);

        // kontrola palindromu
        if (slovo.equals(opacneSlovo)) {
            System.out.println("Slovo je palindrom.");
        } else {
            System.out.println("Slovo není palindrom.");
        }

    }
}
