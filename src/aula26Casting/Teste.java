package aula26Casting;

import java.sql.SQLOutput;

public class Teste {

    public static void main(String[] args) {
        /*Aluno aluno = new Aluno();
        Pessoa pessoaAluno = aluno; //UPCASTING

        Pessoa aluno2 = (Pessoa) new Aluno(); //UPCASTING

        //EXEMPLO DE DOWN CASTING, PORÉM DÁ ERRO POIS NÃO PODEMOS FAZER UM DOWN CASTING COM A CLASS PRIMÁRIA
        Pessoa aluno3 = new Pessoa();
        Aluno aluno4 = (Aluno) aluno3;*/


        //O OPERADOR INSTANCEOF SERVE PARA VERIFICAR O TIPO DE CLASSE
        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        if (pessoa instanceof Pessoa) {
            System.out.println("É do tipo Pessoa");
        }
        if (aluno instanceof Aluno) {
            System.out.println("É do tipo Aluno");
        }
        if (professor instanceof Professor) {
            System.out.println("É do tipo Professor");
        }
    }
}
