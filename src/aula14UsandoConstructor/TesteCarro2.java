package aula14UsandoConstructor;

public class TesteCarro2 {
    public static void main(String[] args) {

        Carro2 van = new Carro2();

        Carro2 van2 = new Carro2("Volkswagem", "T-Cross", 8, 50, 0.4 );
        System.out.println(van2.marca);
        System.out.println(van2.modelo);
        System.out.println(van2.numPassageiros);
        System.out.println(van2.capCombustivel);
        System.out.println(van2.consumoCombustivel);

    }
}
