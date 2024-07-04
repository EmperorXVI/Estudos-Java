package exercicios2;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quanto você ganha por hora trabalhada: ");
        double valorHora = sc.nextDouble();
        System.out.println("Digite quantas horas você trabalha por mês: ");
        double valorMes = sc.nextDouble();

        double salarioBruto = valorHora * valorMes;
        int percentual = 0;

        if (salarioBruto <= 900){
            percentual = 0;
        } else if (salarioBruto > 900 && salarioBruto <= 1500){
            percentual = 5;
        } else if (salarioBruto > 1500 && salarioBruto <= 2500){
            percentual = 10;
        } else if (salarioBruto > 2500){
            percentual = 20;
        }
        double ir = (salarioBruto / 100) * percentual;
        double inss = (salarioBruto / 100) * 10;
        double fgts = (salarioBruto / 100) * 11;
        double totalDescontos = ir + inss;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Salário Bruto: (" + valorHora + " * " + valorMes + ") : R$ " + salarioBruto);
        System.out.println("(-) IR " + percentual + "% : R$" + ir);
        System.out.println("(-) INSS (10%) " + inss);
        System.out.println("FGTS (11%) " + fgts);
        System.out.println("Total de descontos: R$" + totalDescontos);
        System.out.println("Salário Liquido: R$" + salarioLiquido);
    }
}
