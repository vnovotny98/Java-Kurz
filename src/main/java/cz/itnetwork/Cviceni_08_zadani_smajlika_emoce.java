package cz.itnetwork;

import java.util.Scanner;

public class Cviceni_08_zadani_smajlika_emoce
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadej smajlíka: ");
        String smajlik = scanner.nextLine();

        switch (smajlik) {
            case ":-)" :
            case ":)" :
                System.out.println("Tvůj smajlík je veselý");
                break;
            case ":-(" :
            case ":(" :
                System.out.println("Tvůj smajlík je smutný");
                break;
            case ":-*" :
            case ":*" :
                System.out.println("Tvůj smajlík je zamilovaný");
                break;
            case ":-P" :
            case ":P" :
                System.out.println("Tvůj smajlík je s vyplazeným jazykem");
                break;
            default:
                System.out.println("Neznámý smajlík");
                break;
        }
    }
}
