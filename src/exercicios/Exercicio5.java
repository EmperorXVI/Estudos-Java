package exercicios;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        float num = sc.nextFloat();

        float operacao = num * 100;

        System.out.println("O numero em centimetros é: " + operacao);
    }
}
