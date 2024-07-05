package exercicios3;

import java.util.Objects;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        String senha;

        while(true){
            System.out.println("Digite seu nome: ");
            nome = sc.nextLine();
            System.out.println("Digite sua senha: ");
            senha = sc.nextLine();

            if(Objects.equals(nome, senha)){
                System.out.println("A senha não pode ser a mesma que o nome!");
            } else {
                System.out.println("Nome e Senha configurados:");
                System.out.println("Nome: " + nome);
                System.out.println("Senha: " + senha);
                break;
            }
        }
    }
}
