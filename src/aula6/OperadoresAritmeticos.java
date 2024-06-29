package aula6;

public class OperadoresAritmeticos {
    public static void main(String[] args){

        int resultado = 10 + 2;
        System.out.println(resultado);

        resultado = resultado - 2;
        System.out.println(resultado);

        resultado = resultado * 10;
        System.out.println(resultado);

        resultado = resultado / 3;
        System.out.println(resultado);

        //O % pega o resto da divisão, por exemplo 3 dividido por 2 sobraria 1.
        resultado = resultado % 1;
        System.out.println(resultado);

        //Caso eu adicione a sigla ++ na frente da minha variavel, ela adiciona mais 1 no valor, assim como o -- serve para subtrair 1, por exemplo:

        resultado++;
        System.out.println(resultado);
        resultado--;
        System.out.println(resultado);

        //O sinal de + também funciona para concatenar variáveis
        String primeiroNome = "Vinicius";
        String ultimoNome = " Tessari";
        String juntarNome = primeiroNome + ultimoNome;
        System.out.println(juntarNome);


    }
}
