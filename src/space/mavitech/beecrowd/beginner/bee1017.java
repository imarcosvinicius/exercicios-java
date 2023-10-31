package space.mavitech.beecrowd.beginner;

import java.util.Locale;
import java.util.Scanner;

public class bee1017 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int tempoViagem = scan.nextInt();
        int velocidadeMedia = scan.nextInt();

        int autonomia = 12;

        double media = (double) (tempoViagem * velocidadeMedia) / autonomia;

        System.out.printf("%.3f\n", media);

        scan.close();
    }

}