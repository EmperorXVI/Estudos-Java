package exercicios;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a altura (em metros): ");
        double altura = sc.nextDouble();
        sc.nextLine();

        System.out.println("Digite o sexo (M para masculino, F para feminino): ");
        String sexo = sc.nextLine();

        double pesoIdeal;
        if (sexo.equalsIgnoreCase("M")) {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo.equalsIgnoreCase("F")) {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Sexo inválido. Por favor, insira M para masculino ou F para feminino.");
            sc.close();
            return;
        }

        System.out.println("Seu peso ideal seria: " + pesoIdeal);
        System.out.println(" ");

        System.out.println("Digite o seu peso atual (em kg): ");
        double pesoAtual = sc.nextDouble();

        if (pesoAtual < pesoIdeal) {
            System.out.println("Você está abaixo do peso ideal.");
        } else if (pesoAtual > pesoIdeal) {
            System.out.println("Você está acima do peso ideal.");
        } else {
            System.out.println("Você está no peso ideal.");
        }
    }
}