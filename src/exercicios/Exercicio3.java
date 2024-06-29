package exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

      Scanner scarn = new Scanner(System.in);
      System.out.println("Digite um número: ");
      int numero1 = scarn.nextInt();
      System.out.println("Digite o segundo número: ");
      int numero2 = scarn.nextInt();

      int soma = (numero1 + numero2);
      System.out.println("O resultado da soma é: " + soma);
    }
}
