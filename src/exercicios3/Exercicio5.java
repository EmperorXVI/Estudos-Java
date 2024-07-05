package exercicios3;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a população da cidade A:");
        double populationA = sc.nextDouble();
        System.out.println("Digite o percentual de crescimento:");
        double percentA = sc.nextDouble();
        System.out.println("Digite a população da cidade B:");
        double populationB = sc.nextDouble();
        System.out.println("Digite o percentual de crescimento:");
        double percentB = sc.nextDouble();

        int anos = 0;

        while(populationA < populationB || populationB > populationA){
            populationA = populationA + (populationA/100) * percentA;
            populationB = populationB + (populationB/100) * percentB;
            anos++;
        }

        System.out.println("População A: " + populationA);
        System.out.println("População B: " + populationB);
        System.out.println("Quantidade de anos:   " + anos);
    }
}
