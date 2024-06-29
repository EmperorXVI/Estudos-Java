package listareg;

import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float num1 = 0.4f;
        float num2 = 0.6f;
        System.out.println("Digite o número A1: ");
        int a1 = scan.nextInt();
        System.out.println("Digite o número A2: ");
        int a2 = scan.nextInt();

        float resultado = (num1 * a1) + (num2 * a2);


        System.out.println("O resultado da equação é: " + resultado);

    }
}
