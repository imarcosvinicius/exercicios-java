package space.mavitech.beecrowd.beginner;

import java.util.Scanner;

public class bee1001 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int x = a + b;

        System.out.printf("X = %d\n", x);

        scan.close();
    }

}