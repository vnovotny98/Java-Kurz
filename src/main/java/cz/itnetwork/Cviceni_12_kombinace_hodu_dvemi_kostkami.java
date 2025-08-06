package cz.itnetwork;

public class Cviceni_12_kombinace_hodu_dvemi_kostkami {
    public static void main(String[] args) {

        System.out.println("Kombinace hodů dvěma šestistěnnými kostkami");
        for (int j = 1; j <= 6; j++) {
            for (int i = 1; i <= 6; i++) {
                System.out.printf("(%d, %d) ", j,i );
            }

        }
    }
}