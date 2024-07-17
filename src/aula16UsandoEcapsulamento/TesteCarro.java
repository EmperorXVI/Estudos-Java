package aula16UsandoEcapsulamento;

public class TesteCarro {
    public static void main(String[] args) {

        Carro van = new Carro();

        van.setMarca("Volkswagem");
        System.out.println(van.getMarca());
    }
}
