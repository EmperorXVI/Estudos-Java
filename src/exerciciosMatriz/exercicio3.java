package exerciciosMatriz;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.println("Digite o valor da posição [" + i + "," + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " - ");
            }
        }
        System.out.println();

        int pares = 0;
        int impar = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] % 2 == 0){
                    pares++;
                } else {
                    impar++;
                }
            }
        }
        System.out.println("Números pares = " + pares);
        System.out.println("Números impares = " + impar);
    }
}
