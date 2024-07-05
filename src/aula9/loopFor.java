package aula9;

public class loopFor {
    public static void main(String[] args) {

        //FOR NORMAL
        for (int i = 0; i < 5; i++){
            System.out.println("O valor de i =: " + i);
        }
        //FOR COM MAIS DE UMA VARIÁVEL
        for (int i = 0, j = 10; i < j; i++, j--){
            System.out.println("I =: " + i + "; J =: " + j);
        }
        //FOR COM PARTES AUSENTES
        int i = 0;
        for (; i < 10; ){
            System.out.println("Valor de I = " + i);
            i += 2;
        }
        //FOR COM LOOP SEM CORPO
        int soma = 0;
        for(i = 1; i < 5; soma += i++) {
            System.out.println("O valor de soma =: " + soma);
        }
    }
}
