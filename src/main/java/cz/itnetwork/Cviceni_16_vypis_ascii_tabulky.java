package cz.itnetwork;

public class Cviceni_16_vypis_ascii_tabulky {
    public static void main(String[] args) {

        System.out.println("ASCII tabulka");
        System.out.println("=============");
        for (int hodnotaAscii = 33; hodnotaAscii < 256; hodnotaAscii++) {
            char znak = (char) hodnotaAscii;
            System.out.printf("%d:%s\n",hodnotaAscii, znak);
        }
    }
}
