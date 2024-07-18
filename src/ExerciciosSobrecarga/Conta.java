package ExerciciosSobrecarga;

class Conta {

    int numConta;
    double saldo;
    boolean especial;
    double limite;
    boolean chequeEspecial;

    void sacar(int quantia) {
        if (quantia >= 0 && quantia <= limite) {
            saldo -= quantia;
            System.out.println("Saque realizado com sucesso!");
            System.out.println("Saldo atual: " + saldo);
        } else if (quantia>limite){
            System.out.println("Limite Atingido!");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
    void depositar(int quantia) {
        if(quantia > 0){
            saldo += quantia;
            System.out.println("Deposito realizado com sucesso!");
            System.out.println("Saldo atual: " + saldo);
        } else {
            System.out.println("Valor inválido");
        }
    }
    double consultarSaldo(){
        return saldo;
    }
    void consultarLimite(){
        if(limite > 0 && limite < 100000){
            System.out.println("Seu limite é: " + limite);
        } else {
            System.out.println("A conta do cliente não possui limite");
        }
    }
    void consultarChequeEspecial(){
        if(chequeEspecial){
            System.out.println("Cliente está usando cheque especial");
            chequeEspecial = true;
        } else {
            System.out.println("Cliente não utiliza cheque especial");
            chequeEspecial = false;
        }
    }
}
