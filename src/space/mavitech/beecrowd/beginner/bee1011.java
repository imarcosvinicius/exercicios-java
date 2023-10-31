package space.mavitech.beecrowd.beginner;

import java.util.Locale;
import java.util.Scanner;

public class bee1011 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double area = scan.nextDouble();

        final double PI = 3.14159;

        double volume = ((4/3.0) * PI * Math.pow(area, 3));

        System.out.printf("VOLUME = %.3f\n", volume);

        scan.close();
    }

}