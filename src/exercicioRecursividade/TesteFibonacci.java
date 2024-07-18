package exercicioRecursividade;

public class TesteFibonacci {
    public static void main(String[] args) {
        for (int i = 0; i < 30; i++) {
            System.out.print("(" + i + "):" + SequenciaFibonacci.fibonacci(i) + "\t");
        }
    }
}
