package exerciciosIfElseSwitchCase;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite Sua primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite Sua segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.println("Digite Sua terceira nota: ");
        double nota3 = sc.nextDouble();
        System.out.println("Digite Sua quarta nota: ");
        double nota4 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        String aproveitamento = "";

        if (media >= 9 && media <= 10){
            aproveitamento = "A";
        } else if (media >= 7.5 && media <= 9){
            aproveitamento = "B";
        } else if (media >= 6 && media <= 7.5){
            aproveitamento = "C";
        } else if (media >= 4 && media <= 6){
            aproveitamento = "D";
        } else if (media < 4 && media >= 0){
            aproveitamento = "E";
        }
        System.out.println("Sua primeira nota foi: " + nota1);
        System.out.println("Sua segunda nota foi: " + nota2);
        System.out.println("Sua terceira nota foi: " + nota3);
        System.out.println("Sua quarta nota foi: " + nota4);
        System.out.println("Sua média foi de: " + media);
        System.out.println("Seu aproveitamento foi: " + aproveitamento);

        switch (aproveitamento){
            case "A":
            case "B":
            case "C":
                System.out.println("APROVADO");break;
            case "D":
            case "E":
                System.out.println("REPROVADO");break;
        }
    }
}
