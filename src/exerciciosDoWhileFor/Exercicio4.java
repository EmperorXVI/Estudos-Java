package exerciciosDoWhileFor;

public class Exercicio4 {
    public static void main(String[] args) {

        double a = 80000;
        double b = 200000;
        int anos = 0;

        while(a < b){
            a = a + (a/100) * 3;
            b = b + (b/100) * 1.5;
            anos++;
        }

        System.out.println("População A: " + a);
        System.out.println("População B: " + b);
        System.out.println("Quantidade de anos:   " + anos);
    }
}
