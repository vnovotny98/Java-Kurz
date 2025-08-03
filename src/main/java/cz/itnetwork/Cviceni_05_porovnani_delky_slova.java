package cz.itnetwork;

import java.util.Scanner;

public class Cviceni_05_porovnani_delky_slova {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadejte delší slovo: ");
        String delsiSlovo = scanner.nextLine();

        System.out.println("Zadejte kratší slovo: ");
        String kratsiSlovo = scanner.nextLine();

        System.out.printf("Slova se líší délkou o %d znaků ",delsiSlovo.length()-kratsiSlovo.length());
    }

}
