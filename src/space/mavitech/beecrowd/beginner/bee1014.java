package space.mavitech.beecrowd.beginner;

import java.util.Locale;
import java.util.Scanner;

public class bee1014 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int km = scan.nextInt();
        double litros = scan.nextDouble();

        double meida = km / litros;

        System.out.printf("%.3f km/l\n", meida);

        scan.close();
    }
}