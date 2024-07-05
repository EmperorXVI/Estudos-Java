package exercicios3;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero inteiro:");
        int num = sc.nextInt();

        int fatorial = 1;

        for(int i = 1; i <= num; i++) {
            fatorial = i * fatorial;
            System.out.println(fatorial);
        }

    }
}
