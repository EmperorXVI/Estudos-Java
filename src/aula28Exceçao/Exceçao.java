package aula28Exceçao;

public class Exceçao {

    public static void main(String[] args) {

        //NO CASO ESTOU PROVOCANDO UM ERRO EM QUE ELE TENTA ACESSAR UMA POSIÇÃO DO ARRAY QUE NÃO EXISTE
        int[] vetor = new int[4];
        System.out.println("Antes da exception");

        vetor[4] = 1;
        System.out.println("Esse Texto não vai ser impresso");
    }
}
