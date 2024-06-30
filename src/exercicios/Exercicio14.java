package exercicios;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de peixes pescados");
        int peixes = sc.nextInt();
        System.out.println("Digite o peso médio do peixe");
        float pesoPeixes = sc.nextFloat();

        float pesoTotal = peixes * pesoPeixes;
        float pesoMaximo = 50;
        float taxa = 4.0f;


        if (pesoTotal > pesoMaximo) {
            float multa = (pesoTotal - pesoMaximo) * taxa;
            System.out.println("O peso da sua mercadoria foi de: " + pesoTotal + "KG");
            System.out.println("O valor que você deverá pagar de multa é de R$" + multa);
        } else if (pesoTotal <= pesoMaximo){
            System.out.println("Você irá pagar: R$0,00 de multa");
            System.out.println("O peso total foi de: " + pesoTotal + "KG");
        }
    }
}
