package aula29MultiplosCatch;

public class MultiplosCatch2 {
    public static void main(String[] args) {

        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] denominadores = {2, 0, 4, 8, 0};

        for( int i = 0; i < numeros.length; i++ ) {
            try{
                System.out.println(numeros[i] + "/" + denominadores[i] + " = " + (numeros[i] / denominadores[i]));
            }
            //QUANDO OS ERROS SÃO PARECIDOS, CONSEGUIMOS COLOCAR OS DOIS EM UM SO CATCH
            catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
                System.out.println("Aconteceu um erro");
            }

        }
    }
}
