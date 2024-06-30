package exercicios;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo número inteiro: ");
        int num2 = sc.nextInt();
        System.out.println("Digite um número real: ");
        float num3 = sc.nextFloat();

        float a = (num1 * 2) * (num2 / 2.0f);
        float b = (num1 * 3) + num3;
        float c = (float) Math.pow(num3, 3);

        System.out.println("O produto do dobro do primeiro número multiplicado por metade do segundo número: " + a);
        System.out.println("A soma do triplo do primeiro número com o terceiro número: " + b);
        System.out.println("O terceiro número elevado ao cubo: " + c);
    }
}
