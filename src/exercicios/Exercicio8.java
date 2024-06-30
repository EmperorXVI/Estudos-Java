package exercicios;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quanto você ganha por hora: ");
        float valor = sc.nextFloat();

        System.out.println("Digite quantas horas você trabalha por mês: ");
        float hora = sc.nextFloat();

        float resultado = valor * hora;
        System.out.println("O seu salário por mês é: " + resultado);

    }
}
