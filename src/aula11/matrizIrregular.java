package aula11;

import java.util.Scanner;

public class matrizIrregular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de pessoas entrevistadas");
        int numEntrevistadas = sc.nextInt();

        String[][] nomesFilhos = new String[numEntrevistadas][];

        for(int i=0; i<nomesFilhos.length; i++) {
            System.out.println("Digite a quantidade de filhos");
            int qtdFilhos = sc.nextInt();

            nomesFilhos[i] = new String[qtdFilhos];

            for(int j=0; j<nomesFilhos[i].length; j++) {
                System.out.println("Digite o nome do filho - " + (j+1));

                nomesFilhos[i][j] = sc.next();
            }
        }
        for(int i=0; i<nomesFilhos.length; i++) {
            System.out.println("A pessoa " + i + " tem " + nomesFilhos[i].length + " filhos");
            for(int j=0; j<nomesFilhos[i].length; j++) {
                System.out.println(nomesFilhos[i][j]);
            }
        }
    }
}
