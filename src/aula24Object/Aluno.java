package aula24Object;

import java.util.Arrays;
import java.util.Objects;

public class Aluno {

    private String curso;
    private double[] notas;

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    /*public String toString() {
        //TOSTRING TRANSFORMA VARIAVEIS EM STRING
        String s = curso + "\n";
        for (double nota : notas) {
            s += nota + " ";
        }
        return s;
    }*/

    public String toString() {
        return "curso = " + curso + '\n' +
                "notas = " + Arrays.toString(notas);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        Aluno other = (Aluno) obj;

        if(curso.equalsIgnoreCase(other.getCurso())) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(curso, Arrays.hashCode(notas));
    }
}