package aula13;

public class TesteCarro {
    public static void main(String[] args) {

        Carro van = new Carro();

        van.marca = "Fiat";
        van.modelo = "Doblô";
        van.numPassageiros = 8;
        van.capCombustivel = 47;
        van.consumoCombustivel = 0.20;

        System.out.println(van.marca);
        System.out.println(van.modelo);
        van.exibirAutonomia();

        Carro fusca = new Carro();

        fusca.marca = "Volkswagem";
        fusca.modelo = "Fusca";
        fusca.numPassageiros = 4;
        fusca.capCombustivel = 40;
        fusca.consumoCombustivel = 0.15;

        System.out.println(fusca.marca);
        System.out.println(fusca.modelo);

        double autonomia = fusca.obterAutonomia();
        System.out.println("A autonomia do carro é " + autonomia);

        Carro golf = new Carro();

        golf.marca = "Volkswagem";
        golf.modelo = "Golf";
        golf.numPassageiros = 4;
        golf.capCombustivel = 50;
        golf.consumoCombustivel = 0.5;

        System.out.println("O carro da marca: " + golf.marca);
        System.out.println("Modelo: " + golf.modelo);

        double qtdCombustivel10 = golf.calcularCombustivel(10);
        System.out.println("Com 10 litros de gasolina roda " + qtdCombustivel10 + "KM");
    }
}
