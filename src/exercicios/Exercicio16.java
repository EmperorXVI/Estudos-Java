package exercicios;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double areaAPintar, litrosTinta, latasTinta, precoTotal;

        System.out.println("Informe a área a ser pintada (em metros quadrados): ");
        areaAPintar = sc.nextDouble();

        litrosTinta = areaAPintar / 3;

        latasTinta = Math.ceil(litrosTinta / 18);

        precoTotal = latasTinta * 80;

        System.out.println("Quantidade de latas de tinta necessárias: " + latasTinta);
        System.out.println("Preço total: R$ " + precoTotal);
    }
}
