package aula15UsandoPrivatePublic;

class Carro {    //A CLASSE SEM NADA ANTES SIGNIFICA DEFAULT, APENAS CLASSES DENTRO DO PACKAGE PODEM VER ELA

    String marca;
    String modelo;
    int numPassageiros;
    public double capCombustivel;   //USANDO PUBLIC TODOS OS PACKAGE PODEM VER
    private double consumoCombustivel;  //USANDO PRIVATE (DEIXA A CLASSE OU VÁRIAVEL VISIVÉL APENAS PARA A CLASSE)


    void exibirAutonomia(){ //Método simples
        System.out.println("Autonomia do carro é de " + capCombustivel * consumoCombustivel + " KM");
    }
    double obterAutonomia(){ //Método com retorno

        System.out.println("Método Obter Autonomia foi chamado.");
        return capCombustivel * consumoCombustivel;
    }
    private double consumoPorKM(double km){     //USANDO UM METODO PARA AUXILIAR O CALCULAR COMBUSTÍVEL
        return km / consumoCombustivel;
    }

    double calcularCombustivel(double km){ //Método com parâmetro
        return this.consumoPorKM(km);
    }
}
