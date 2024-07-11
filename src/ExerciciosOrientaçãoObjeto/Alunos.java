package ExerciciosOrientaçãoObjeto;

import java.util.Arrays;

public class Alunos {

    String nome;
    String matricula;
    String nomeCurso;
    String[] disciplinas = new String[3];
    Double[][] notasDisciplinas = new Double[3][4];

    void mostrarInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Nome do Curso: " + nomeCurso);

        for(int i=0; i<notasDisciplinas.length; i++){
            System.out.println("Notas da Disciplina: " + disciplinas[i]);
            for(int j=0; j<notasDisciplinas[i].length; j++){
                System.out.print(notasDisciplinas[i][j] + " ");
            }
            System.out.println();
        }
    }

    boolean verificarAprovado(int indice){

        double soma = 0;
        for(int i=0; i<notasDisciplinas[indice].length; i++){
            soma += notasDisciplinas[indice][i];
        }
        double media = soma/4;

        if(media >= 7){
            return true;
        }
        return false;
    }
}
