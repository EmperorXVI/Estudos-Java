package ExerciciosOrientaçãoObjeto;

public class TesteConta {
    public static void main(String[] args) {
        Conta conta1 = new Conta();

        conta1.numConta = 123456;
        conta1.saldo = 1000;
        conta1.especial = true;
        conta1.limite = 10000;
        conta1.chequeEspecial = true;

        conta1.consultarChequeEspecial();

        double saldo = conta1.consultarSaldo();
        System.out.println("Saldo atual: " + saldo);

        conta1.consultarLimite();

        conta1.depositar(2000);

        conta1.sacar(1500);
        System.out.println();
        System.out.println();

        Conta conta2 = new Conta();

        conta2.numConta = 56789;
        conta2.saldo = 1000;
        conta2.especial = false;
        conta2.limite = Integer.MAX_VALUE;
        conta2.chequeEspecial = false;

        conta2.consultarChequeEspecial();
        double saldo2 = conta2.consultarSaldo();
        System.out.println("Saldo atual: " + saldo2);

        conta2.consultarLimite();
        conta2.depositar(5000);
        conta2.sacar(2000);
    }
}
