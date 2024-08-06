package aula29MultiplosCatch;

public class ErroGenerico {
    public static void main(String[] args) {

        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] denominadores = {2, 0, 4, 8, 0};

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(numeros[i] + "/" + denominadores[i] + " = " + (numeros[i] / denominadores[i]));
            } catch (ArithmeticException e1) {
                System.out.println("Erro ao dividir por 0");
            }
            //Capturando um erro genérico não especificado
            //Throwable é a superclasse das exceptions
            catch (Throwable e3) {
                System.out.println("Aconteceu um erro");
            }
        }
    }
}
