package aula11;

import java.util.Scanner;

public class matriz {
    public static void main(String[] args) {

        double[][] notasAlunos = new double[3][4];

        notasAlunos[0][0] = 9;
        notasAlunos[0][1] = 8.5;
        notasAlunos[0][2] = 10;
        notasAlunos[0][3] = 7.5;

        notasAlunos[1][0] = 9;
        notasAlunos[1][1] = 8;
        notasAlunos[1][2] = 6;
        notasAlunos[1][3] = 7;

        notasAlunos[2][0] = 7;
        notasAlunos[2][1] = 5;
        notasAlunos[2][2] = 9.5;
        notasAlunos[2][3] = 8;

        for(int i =0; i < notasAlunos.length; i++){
            for(int j = 0; j< notasAlunos[i].length; j++){
                System.out.print(notasAlunos[i][j] + " - ");
            }
            System.out.println();
        }
        double soma;
        for(int i =0; i < notasAlunos.length; i++) {
            soma = 0;
            for (int j = 0; j < notasAlunos[i].length; j++) {
                soma += notasAlunos[i][j];
            }
            System.out.println("A média do aluno " + i + " é = " + (soma / 4));
        }

        double[][] notasAlunos2 = {{8,6,7.5,10}, {10,9,9,8}};

        System.out.println("Output da matriz Alunos");

        for(int i =0; i < notasAlunos2.length; i++){
            for(int j = 0; j< notasAlunos2[i].length; j++){
                System.out.print(notasAlunos2[i][j] + " - ");
            }
            System.out.println();
        }

    }
}
