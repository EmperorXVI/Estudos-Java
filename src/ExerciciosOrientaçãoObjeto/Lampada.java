package ExerciciosOrientaçãoObjeto;

public class Lampada {

    boolean ligada;
    String cor;
    int volts;

    void ligarLampada(){
        ligada = true;
        System.out.println("Lampada ligada");
    }
    void desligarLampada(){
        ligada = false;
        System.out.println("Lampada desligada");
    }
}
