package space.mavitech.beecrowd.beginner;

import java.util.Scanner;

public class bee1013 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int maiorAB = (a + b + Math.abs(a-b)) / 2;
        int maior = (maiorAB + c + Math.abs(maiorAB - c)) /2;

        System.out.println(maior + " eh o maior");

        scan.close();
    }

}