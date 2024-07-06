package exerciciosIfElseSwitchCase;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o primeiro número:");
        double n1 = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        double n2 = sc.nextDouble();

        if (n1 > n2) {
            System.out.println("O primeiro número é o maior = " + n1);
        } else {
            System.out.println("O segundo número é o maior = " + n2);
        }
    }
}
