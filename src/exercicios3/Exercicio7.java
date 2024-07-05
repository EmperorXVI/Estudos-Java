package exercicios3;

public class Exercicio7 {
    public static void main(String[] args) {

        int mult;

        for(int i = 1; i <= 10; i++) {
            for(int g = 1; g <= 10; g++) {
                mult = i * g;
                System.out.println(i + " x " + g + " = " + mult + " | ");
            }
            System.out.println("---------------");
        }

    }
}
