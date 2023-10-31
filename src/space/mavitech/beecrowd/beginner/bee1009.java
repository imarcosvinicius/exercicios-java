package space.mavitech.beecrowd.beginner;

import java.util.Locale;
import java.util.Scanner;

public class bee1009 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        String nome = scan.nextLine();
        double salarioFixo = scan.nextDouble();
        double totalVendas = scan.nextDouble();

        double percentual = 15.0 / 100.0;
        double comissao = salarioFixo + (percentual * totalVendas);

        System.out.printf("TOTAL = R$ %.2f\n", comissao);

        scan.close();
    }

}