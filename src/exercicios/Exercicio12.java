package exercicios;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua altura");
        double altura = sc.nextDouble();

        double peso = ((72.7 * altura) - 58);

        System.out.println("Seu peso ideal é: " + peso);
    }
}
