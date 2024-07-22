package exerciciosRelecionamento;

import java.util.Scanner;

public class TesteCurso {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o nome do curso");
        String nome = sc.nextLine();

        System.out.println("Entre com o horário do curso");
        String horario = sc.nextLine();

        System.out.println("Digite o nome do professor");
        String nomeProf = sc.nextLine();

        System.out.println("Digite o departamento do professor");
        String departamento = sc.nextLine();

        System.out.println("Digite o email do professor");
        String emailProf = sc.nextLine();

        Curso curso = new Curso();
        curso.setNome(nome);
        curso.setHorario(horario);

        Professor prof = new Professor();
        prof.setNome(nomeProf);
        prof.setDepartamento(departamento);
        prof.setEmail(emailProf);

        curso.setProfessor(prof);

        System.out.println("----Alunos----");

        Aluno[] alunos = new Aluno[5];
        for(int i=0; i<5; i++){

            System.out.println("Entre com o nome do aluno: " + (i+1));
            String nomeAluno = sc.nextLine();

            System.out.println("Entre com a matricula do aluno: ");
            String matricula = sc.nextLine();

            double[] notas = new double[4];

            for(int j=0; j<4; j++){
                System.out.println("Entre com a nota " + (j+1));
                notas[j] = sc.nextDouble();
            }

            Aluno aluno = new Aluno();
            aluno.setNome(nomeAluno);
            aluno.setMatricula(matricula);
            aluno.setNotas(notas);

            alunos[i] = aluno;
        }

        curso.setAlunos(alunos);

        System.out.println(curso.obterInfo());

    }
}
