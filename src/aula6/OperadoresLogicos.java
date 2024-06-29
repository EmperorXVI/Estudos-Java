package aula6;

public class OperadoresLogicos {
    public static void main(String[] args) {

        int valor1 = 1;
        int valor2 = 2;

        boolean resultado1 = (valor1 == 1) && (valor2 == 2);
        boolean resultado2 = (valor1 == 1) || (valor2 == 2);

        System.out.println("Valor1 é 1 AND Valor2 é 2 - resultado: " + resultado1);
        System.out.println("Valor1 é 1 OR Valor2 é 2 - resultado: " + resultado2);

        boolean verdadeiro = true;
        boolean falso = false;

        System.out.println(verdadeiro && falso); //Com o && para dar verdadeiro os dois tem que ser verdadeiros
        System.out.println(verdadeiro || falso); //Com o || dá verdadeiro porque precisa que um dos dois sejam verdadeiros
        System.out.println(verdadeiro ^ falso); //Com o ^ para dar falso os dois tem que ser falsos ou os dois verdadeiros
        System.out.println(!verdadeiro && falso); //Com o ! ele está negando o verdadeiro, portanto falso com falso = falso

    }
}
