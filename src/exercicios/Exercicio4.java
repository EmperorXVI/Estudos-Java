package exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma nota do primeiro bimestre: ");
        float nota1 = scan.nextFloat();
        System.out.println("Digite a nota do segundo bimestre: ");
        float nota2 = scan.nextFloat();
        System.out.println("Digite a nota do terceiro bimestre: ");
        float nota3 = scan.nextFloat();
        System.out.println("Digite a nota do quarto bimestre: ");
        float nota4 = scan.nextFloat();

        float resultado = (nota1 + nota2 + nota3 + nota4)/4;
        System.out.println("Sua média é: " + resultado);
    }
}