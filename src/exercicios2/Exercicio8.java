package exercicios2;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double menor = Integer.MAX_VALUE;

        for (int i = 0; i < 3; i++){
            System.out.println("Digite o valor do " + (i + 1) + "º produto");
            double valor = sc.nextDouble();

            if (valor < menor){
                menor = valor;
            }
        }

        System.out.println("O produto que você deve comprar é o " + menor);
    }
}
