package aula26Casting;

public class Teste2 {
    public static void main(String[] args) {

        //EXEMPLOS DE DOWN CASTING COM REFERÊNCIA DE STRINGS, DOWN CASTING SÓ FUNCIONA COM TIPOS IGUAIS
        Object obj1 = obterSting();
        String str1 = (String) obj1;

        Object obj2 = "Minha String";
        String str2 = (String) obj2;

        //DOWN CASTING, ESSE EXEMPLO ABAIXO DÁ ERRO PORQUE O OBJECT NÃO REFERÊNCIA UMA STRING
        Object obj3 = new Object();
        String str3 = (String) obj3;

        //ESSE EXEMPLO NÃO FUNCIONA PORQUE A FUNÇÃO É DO TIPO INTEIRO
        Object obj4 = obterInteiro();
        String str4 = (String) obj4;
    }
    public static String obterSting(){
        return "Minha String";
    }

    public static int obterInteiro(){
        return 1;
    }
}
