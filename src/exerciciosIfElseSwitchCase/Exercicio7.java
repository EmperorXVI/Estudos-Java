package exerciciosIfElseSwitchCase;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o " + (i + 1) + "º número: ");
            int numero = sc.nextInt();

            if (numero > maior){
                maior = numero;
            } if (numero < menor) {
                menor = numero;
            }
        }
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);

        /*if (num1 > num2 && num1 > num3) {
            System.out.println("O primeiro número é o maior: " + num1);
            if (num2 > num3) {
                System.out.println("O menor número é: " + num3);
            } else {
                System.out.println("O menor número é: " + num2);
            }
        } else if (num2 > num1 && num2 > num3){
            System.out.println("O segundo número é o maior: " + num2);
            if (num1 > num3) {
                System.out.println("O menor número é: " + num3);
            } else {
                System.out.println("O menor número é: " + num1);
            }
        } else if (num3 > num1 && num3 > num2){
            System.out.println("O terceiro número é o maior: " + num3);
            if (num1 > num2) {
                System.out.println("O menor número é: " + num2);
            } else {
                System.out.println("O menor número é: " + num1);
            }*/
        }
    }

