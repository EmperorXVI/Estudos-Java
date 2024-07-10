package aula12;

import java.util.Random;

public class forEach {
    public static void main(String[] args) {

        int[] notas = new int[10];

        Random aleatorio = new Random();

        for(int i=0; i<notas.length; i++) {
            notas[i] = aleatorio.nextInt(10);
        }
        for(int i=0; i<notas.length; i++) {
            System.out.println(notas[i]);
        }
        System.out.println("Usando For Each");

        for(int nota:notas){
            System.out.println(nota);
        }
    }
}
