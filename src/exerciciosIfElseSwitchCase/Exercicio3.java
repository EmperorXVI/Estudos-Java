package exerciciosIfElseSwitchCase;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite F para Feminino e M para Masculino");
        String letra = sc.nextLine();

        if (letra.equalsIgnoreCase("F")) {
            System.out.println("F - Feminino");
        } else if (letra.equalsIgnoreCase("M")) {
            System.out.println("M - Masculino");
        } else {
            System.out.println("Sexo inválido");
        }
    }
}
