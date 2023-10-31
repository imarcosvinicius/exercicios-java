package space.mavitech.beecrowd.beginner;

import java.util.Locale;
import java.util.Scanner;

public class bee1006MediaPonderada {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        double pa = 2;
        double pb = 3;
        double pc = 5;

        double media = (a * pa + b * pb + c * pc) / (pa + pb + pc);

        System.out.printf("MEDIA = %.1f\n", media);

        scan.close();
    }

}