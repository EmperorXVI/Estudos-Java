package exerciciosDoWhileFor;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número que deseja a tabuada:");
        int n = sc.nextInt();

        int mult;

        for(int i = 1; i <= 10; i++) {
            mult = i * n;
            System.out.println(n + " x " + i + " = " + mult);
        }

    }
}
