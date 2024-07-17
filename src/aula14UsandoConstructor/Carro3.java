package aula14UsandoConstructor;

public class Carro3 {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    public Carro3() {}

    //CONSTRUCTOR COM PARÂMETRO USANDO O THIS
    public Carro3(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    public Carro3(String marca, String modelo, int numPassageiros) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        System.out.println("Chamando o construtor com 3 parâmetros");
    }

    public Carro3(String marca, String modelo) {
        this(marca, modelo, 4);
        System.out.println("Chamando o construtor com 2 parâmetros");
    }

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
