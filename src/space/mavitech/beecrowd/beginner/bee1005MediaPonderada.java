package space.mavitech.beecrowd.beginner;

import java.util.Locale;
import java.util.Scanner;

public class bee1005MediaPonderada {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double p1 = 3.5;
        double p2 = 7.5;

        double media = (a * p1 + b * p2) / (p1 + p2);

        System.out.printf("MEDIA = %.5f\n", media);

        scan.close();
    }

}