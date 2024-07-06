package exerciciosDoWhileFor;

public class TestandoMatriz {
    public static void main(String[] args) {

        int rows = 3;
        int columns = 3;
        int[][] matriz = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }
}
