package ExerciciosSobrecarga;

import java.util.Scanner;

public class TesteConta {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Conta conta = new Conta();

        System.out.println("Digite o numero da conta: ");
        conta.numConta = sc.nextInt();

        conta.saldo = 1000;
        conta.especial = true;
        conta.limite = 10000;
        conta.chequeEspecial = true;

        conta.consultarChequeEspecial();

        double saldo = conta.consultarSaldo();
        System.out.println("Saldo atual: " + saldo);

        conta.consultarLimite();

        conta.depositar(2000);

        conta.sacar(1500);
        System.out.println();
        System.out.println();
    }
}
