package listareg;

public class Exercicio4 {
    public static void main(String[] args) {

        float giga = 1;
        float bytes = 1024;
        float conversao;

        conversao = giga * (float) Math.pow(bytes, 3);
        System.out.println(conversao);
    }
}
