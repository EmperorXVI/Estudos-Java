package exercicios2;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o salário do funcionário: ");
        double antigoSal = sc.nextDouble();

        int percentual = 0;

        if (antigoSal <= 280){
            percentual = 20;
        }else if (antigoSal > 280 && antigoSal <= 700){
            percentual = 15;
        }else if (antigoSal > 700 && antigoSal <= 1500){
            percentual = 10;
        }else if(antigoSal > 1500){
            percentual = 5;
        }
        double aumento = (antigoSal / 100) * percentual;
        double novoSal = antigoSal + aumento;

        System.out.println("O antigo salário era: R$" + antigoSal);
        System.out.println("O percentual de aumento foi de: " + percentual + "%");
        System.out.println("O valor do aumento foi de: R$" + aumento);
        System.out.println("O novo salário é: R$" + novoSal);
    }

}
