package ExerciciosOrientaçãoObjeto;

public class TesteLampada {
    public static void main(String[] args) {


        Lampada lampadaAzul = new Lampada();

        lampadaAzul.cor = "Azul";
        lampadaAzul.volts = 12;

        lampadaAzul.ligarLampada();
        System.out.println("Na cor: " + lampadaAzul.cor);
        lampadaAzul.desligarLampada();
        System.out.println("Na cor: " + lampadaAzul.cor);


    }
}
