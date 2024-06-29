package listareg;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a base: ");
        int base = scan.nextInt();
        System.out.println("Digite a altura: ");
        int altura = scan.nextInt();

        int a = (base * altura) /2;
        System.out.println("O resultado é: " + a);
    }
}
