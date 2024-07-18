package aula19;

public class TesteRecursivo {
    public static void main(String[] args) {

        int fatorialNR = MetodoRecursivo.fatorialNãoRecursivo(5);
        System.out.println(fatorialNR);
        int fatorialR = MetodoRecursivo.fatorialRecursivo(5);
        System.out.println(fatorialR);
    }
}
