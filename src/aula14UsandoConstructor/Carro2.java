package aula14UsandoConstructor;

public class Carro2 { //USANDO CONSTRUCTOR

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    //CONSTRUCTOR SIMPLES
    Carro2(){
        System.out.println("Classe Carro2 foi instânciada");
        marca = "Fiat";
        modelo = "Doblô";
        numPassageiros = 8;
        capCombustivel = 47;
        consumoCombustivel = 0.20;
    }

    //CONSTRUCTOR COM PARÂMETRO
    public Carro2 (String marca_, String modelo_, int numPassageiros_, double capCombustivel_, double consumoCombustivel_){
        marca = marca_;
        modelo = modelo_;
        numPassageiros = numPassageiros_;
        capCombustivel = capCombustivel_;
        consumoCombustivel = consumoCombustivel_;
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