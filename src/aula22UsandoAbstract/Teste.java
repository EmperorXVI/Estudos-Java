package aula22UsandoAbstract;

public class Teste {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();

        pessoa.setEndereco("Rua 1, Num1");
        aluno.setEndereco("Rua 2, Num2");
        professor.setEndereco("Rua 3, Num3");
    }
}
