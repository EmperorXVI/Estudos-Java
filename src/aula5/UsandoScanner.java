package aula5;

import java.util.Scanner;

public class UsandoScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scan.nextLine(); //nextLine lê a linha inteira
        System.out.println("Seu nome completo é: " + nomeCompleto);

        System.out.println("Digite seu primeiro nome: ");
        String nome = scan.next(); // Lê apenas a primeira informação
        System.out.println("Seu primeiro nome é: " + nome);

        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt(); //Lê apenas numeros inteiros
        System.out.println("Sua idade é: " + idade);

        System.out.println("Digite sua altura: ");
        double altura = scan.nextDouble(); //Lê apenas numeros
        System.out.println("Sua altura é: " + altura);*/

        System.out.println("Digite o seu primeiro nome, sua idade, sua altura, e se possui filhos:");
        String nome = scan.next();
        int idade = scan.nextInt();
        float altura = scan.nextFloat();
        boolean filhos = scan.nextBoolean();

        System.out.println("Seu nome é: " + nome);
        System.out.println("Você tem " + idade + " anos");
        System.out.println("Sua altura é: " + altura);
        System.out.println("Possui filhos? " + filhos);

    }
}
