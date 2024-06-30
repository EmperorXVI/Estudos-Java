package exercicios;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do lado do quadrado: ");
        double lado = sc.nextDouble();

        double area = Math.pow(lado, 2);

        double dobroDaArea = area * 2;

        System.out.println("A área do quadrado é: " + area);
        System.out.println("O dobro da área do quadrado é: " + dobroDaArea);
    }
}
