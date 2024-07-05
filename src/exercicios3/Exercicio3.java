package exercicios3;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Digite seu nome:");
            String nome = sc.nextLine();

            if (nome.length() > 3) {
                System.out.println("Nome válido: " + nome);
                break;
            } else {
                System.out.println("Nome inválido, o nome deve conter mais de 3 caracteres");
            }
        }
        while (true) {
            System.out.println("Digite sua idade:");
            int idade = sc.nextInt();

            if (idade > 0 && idade < 150) {
                System.out.println("Idade válida: " + idade);
                break;
            } else {
                System.out.println("Idade inválida, digite uma idade entre 0 e 150");
            }
        }
        while (true) {
            System.out.println("Digite seu salário:");
            double salario = sc.nextDouble();

            if (salario > 0) {
                System.out.println("Salario válido: " + salario);
                break;
            } else {
                System.out.println("Salário inválido, digite um valor acima de 0");
            }
        }
        while (true) {
            System.out.println("Digite seu sexo sendo 'm' para masculino, ou 'f' para feminino:");
            String sexo = sc.nextLine();

            if (sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f")) {
                System.out.println("Sexo selecionado: " + sexo);
                break;
            } else {
                System.out.println("Sexo inválido!");
            }
        }
        while (true) {
            System.out.println("Digite seu estado civil sendo 'c' para casado, 's' para solteiro, 'v' para viuvo e 'd' para divorciado:");
            String estadoCivil = sc.nextLine();

            if (estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")) {
                System.out.println("Estado civil é: " + estadoCivil);
                break;
            } else {
                System.out.println("Estado civil inválido!");
            }
        }
    }
}
