package exercicios;

import java.util.Scanner;

public class Exercicio15 {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual valor em reais você ganha por hora?");
        double valorHora = sc.nextDouble();
        System.out.println("Quantas horas você trabalha no mês?");
        double hora = sc.nextDouble();

        double salarioBruto = valorHora * hora;

        double descontoINSS = salarioBruto * 0.08;
        double descontoIR = salarioBruto * 0.11;
        double descontoSindicato = salarioBruto * 0.05;

        double salarioLiquido = salarioBruto - descontoSindicato - descontoIR - descontoINSS;

        System.out.println("Seu salário bruto é: " + salarioBruto);
        System.out.println("INSS (8%): " + descontoINSS);
        System.out.println("IR (11%): " + descontoIR);
        System.out.println("Sindicato (5%): " + descontoSindicato);
        System.out.println("Seu salário liquido é: " + salarioLiquido);
    }
}
