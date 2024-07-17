package aula13UsandoMetodos;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    void exibirAutonomia(){ //Método simples
        System.out.println("Autonomia do carro é de " + capCombustivel * consumoCombustivel + " KM");
    }
    double obterAutonomia(){ //Método com retorno

        System.out.println("Método Obter Autonomia foi chamado.");
        return capCombustivel * consumoCombustivel;
    }
    double calcularCombustivel(double km){ //Método com parâmetro

        double qtdCombustivel = km / consumoCombustivel;
        return qtdCombustivel;
    }
}
