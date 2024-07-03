package aula7;

import java.util.Scanner;

public class SwitchCase2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double n1 = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        double n2 = sc.nextDouble();

        System.out.println("Digite a operação que deseja realizar");
        System.out.println("------------------------");
        System.out.println(" 1 Para Somar");
        System.out.println(" 2 Para Subtrair");
        System.out.println(" 3 Para Multiplicar");
        System.out.println(" 4 Para Dividir");
        int op = sc.nextInt();


        switch (op) {
            case 1:
                double soma = n1 + n2;
                System.out.println("O resultado da soma é: " + soma);
                break;
            case 2:
                double subtracao = n1 - n2;
                System.out.println("O resultado da subtração é: " + subtracao);
                break;
            case 3:
                double multiplicacao = n1 * n2;
                System.out.println("O rtesultado da sua multiplicação é: " + multiplicacao);
                break;
            case 4:
                double divisao = n1 / n2;
                System.out.println("O resultado da divisão é: " + divisao);
                break;
            default:
                System.out.println("Operação inválida!");
        }
    }
}
