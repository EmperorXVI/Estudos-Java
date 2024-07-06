package exerciciosIfElseSwitchCase;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma letra");
        String letra = sc.nextLine();

        if("AEIOUaeiou".contains(letra)) {
            System.out.println("Sua letra é uma vogal");
        } else {
            System.out.println("Sua letra é uma consoante");
        }
    }
}
