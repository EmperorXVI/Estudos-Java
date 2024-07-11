package ExerciciosOrientaçãoObjeto;

import java.util.Scanner;

public class TesteAlunos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Alunos aluno = new Alunos();

        System.out.println("Digite o nome do aluno: ");
        aluno.nome = sc.next();

        System.out.println("Digite o nome do curso: ");
        aluno.nomeCurso = sc.next();

        System.out.println("Digite a matricula do aluno: ");
        aluno.matricula = sc.next();

        for(int i=0; i<aluno.disciplinas.length;i++){
            System.out.println("Digite o nome do disciplina: " + i);
            aluno.disciplinas[i] = sc.next();
        }
        for(int i=0; i<aluno.notasDisciplinas.length;i++){
            System.out.println("Obtendo notas da disciplina: " + aluno.disciplinas[i]);
            for(int j=0; j<aluno.notasDisciplinas[i].length;j++){
                System.out.println("Entre com a nota " + (j+1));
                aluno.notasDisciplinas[i][j] = sc.nextDouble();
            }
        }
        aluno.mostrarInfo();

        for(int i=0; i<aluno.disciplinas.length;i++){
            if(aluno.verificarAprovado(i)){
                System.out.println("Aluno APROVADO na disciplina: " + aluno.disciplinas[i]);
            } else {
                System.out.println("Aluno REPROVADO na disciplina: " + aluno.disciplinas[i]);
            }
        }
    }
}
