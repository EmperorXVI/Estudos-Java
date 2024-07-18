package aula18MetodosEstaticos;

public class TesteCalculadora {
    public static void main(String[] args) {

        int soma1 = MinhaCalculadora.soma(1,2);
        System.out.println(soma1);
        int soma2 = MinhaCalculadora.soma(1,2,3);
        System.out.println(soma2);
    }
}
