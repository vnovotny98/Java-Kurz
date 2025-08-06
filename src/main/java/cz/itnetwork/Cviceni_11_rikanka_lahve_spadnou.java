package cz.itnetwork;

public class Cviceni_11_rikanka_lahve_spadnou {
    public static void main(String[] args) {

        for (int i = 10; i > 0; i--) {
            if (i > 4) {
                System.out.println(i + " zelených láhví stojí na stole a jedna láhev spadne");
            }
            else {
                System.out.println(i + " zelené láhve stojí na stole a jedna láhev spadne");
            }
        }
    }
}