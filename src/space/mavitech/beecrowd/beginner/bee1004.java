package space.mavitech.beecrowd.beginner;

import java.util.Scanner;

public class bee1004 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        int result = a + b;

        System.out.printf("SOMA = %s\n", result);

        scan.close();
    }

}