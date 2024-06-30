package exercicios;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o raio do circulo: ");
        double raio = sc.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);

        double perimetro = 2 * Math.PI * raio * area;

        System.out.println("A área do circulo é:" + area);
        System.out.println("A circunferência do circulo é:" + perimetro);
    }
}
