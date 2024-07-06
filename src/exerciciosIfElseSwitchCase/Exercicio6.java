package exerciciosIfElseSwitchCase;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro:");
        int num1 = sc.nextInt();

        System.out.println("Digite o segundo número inteiro:");
        int num2 = sc.nextInt();

        System.out.println("Digite o terceiro número inteiro");
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("O primeiro número é o maior: " + num1);
        }else if (num2 > num1 && num2 > num3) {
            System.out.println("O segundo número é o maior: " + num2);
        }else {
            System.out.println("O terceiro número é o maior: " + num3);
        }
    }
}
