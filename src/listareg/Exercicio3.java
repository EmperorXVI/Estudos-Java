package listareg;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o preço inicial do produto: ");
        double precoInicial = scan.nextDouble();

        float icms = 17/100f;
        double confins = 7.6/100;
        double pisPasep = 1.65/100;

        double precoFinal = (1 + icms + confins + pisPasep) * (precoInicial);
        System.out.println("O preço final do seu produto é: " + precoFinal);

    }
}
