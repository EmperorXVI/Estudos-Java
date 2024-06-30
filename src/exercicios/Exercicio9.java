package exercicios;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em Farenheit: ");
        float farenheitTemp = sc.nextFloat();

        float celsius = (5 * (farenheitTemp - 32)) / 9;
        System.out.println("A temperatura em Celsius: " + celsius);
    }
}
