package space.mavitech.beecrowd.beginner;

import java.util.Locale;
import java.util.Scanner;

public class bee1002AreaDoCirculo {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double n = 3.14159;
        double raio = scan.nextDouble();

        double area = Math.pow(raio,2) * n;

        System.out.printf("A=%.4f\n", area);

        scan.close();
    }

}