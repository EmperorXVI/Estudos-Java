package aula5;

import java.util.Scanner;

public class TestandoScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Coloque o primeiro numero: ");
        int num1 = scan.nextInt();
        System.out.println("Coloque o segundo numero: ");
        int num2 = scan.nextInt();
        System.out.println("O valor da soma dos dois números é: ");
        System.out.println(num1 + num2);
    }
}
