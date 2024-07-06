package exerciciosIfElseSwitchCase;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número:");
        double num = sc.nextDouble();

        if (num > 0){
            System.out.println("O número é positivo " + num);
        } else {
            System.out.println("O número é negativo " + num);
        }

    }
}
