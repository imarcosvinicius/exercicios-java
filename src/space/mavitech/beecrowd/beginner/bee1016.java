package space.mavitech.beecrowd.beginner;

import java.util.Scanner;

public class bee1016 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int km = scan.nextInt();

        int total = km * 2;

        System.out.println(total + " minutos");

        scan.close();
    }
}