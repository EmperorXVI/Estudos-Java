package aula31tStacktraceThrows;

import java.util.Scanner;

public class Throws {
    public static void main(String[] args) {

        System.out.println("Entre com um número decimal");
        try{
            double num = lerNumeros();
            System.out.println("Você digitou " + num);
        } catch (Exception e){
            System.out.println("Entrada inválida");
            e.printStackTrace();
        }
    }
    public static double lerNumeros() throws Exception {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        return num;
    }
}
