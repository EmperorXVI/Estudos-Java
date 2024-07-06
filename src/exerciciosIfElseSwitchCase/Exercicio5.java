package exerciciosIfElseSwitchCase;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite sua segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.println("Digite sua terceira nota: ");
        double nota3 = sc.nextDouble();
        System.out.println("Digite sua quarta nota: ");
        double nota4 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 7) {
            if (media == 10) {
                System.out.println("Voce foi APROVADO com DISTINÇÃO com a nota " + media);
            } else {
                System.out.println("Você foi APROVADO com a nota: " + media);
            }
        } else if (media < 7) {
            System.out.println("Você foi REPROVADO com a nota: " + media);
        } else {
            System.out.println("Nota inválida");
        }
    }
}
