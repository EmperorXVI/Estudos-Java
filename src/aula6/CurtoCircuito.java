package aula6;

public class CurtoCircuito {
    public static void main(String[] args) {

        boolean verdadeiro = true;
        boolean falso = false;
        boolean resultado1 = falso & verdadeiro; //Sem Curto Circuito, ele analisa as duas variaveis, no caso como ja começou com falso, o resultado já é falso, mas ele ainda sim analisa a segunda parte
        boolean resultado2 = falso && verdadeiro; //Com Curto Circuito, ele já sabe que vai dar falso, então não precisa gastar tempo analisando a segunda parte da variavel

        System.out.println(resultado1);
        System.out.println(resultado2);
    }
}
