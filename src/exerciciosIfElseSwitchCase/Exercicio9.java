package exerciciosIfElseSwitchCase;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo número");
        int num2 = sc.nextInt();
        System.out.println("Digite o terceiro número");
        int num3 = sc.nextInt();

        int maior;
        int meio;
        int menor;

        if (num1 >= num2 && num1 >= num3) {
            maior = num1;
            if (num2 >= num3) {
                meio = num2;
                menor = num3;
            } else {
                meio = num3;
                menor = num2;
            }
        } else if (num2 >= num1 && num2 >= num3) {
            maior = num2;
            if (num1 >= num3) {
                meio = num1;
                menor = num3;
            } else {
                meio = num3;
                menor = num1;
            }
        } else {
            maior = num3;
            if (num1 >= num2) {
                meio = num1;
                menor = num2;
            } else {
                meio = num2;
                menor = num1;
            }
        }
        System.out.println("Números em ordem decrescente: " + maior + ", " + meio + ", " + menor);
    }
}
