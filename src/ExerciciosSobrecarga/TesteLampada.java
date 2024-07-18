package ExerciciosSobrecarga;

class TesteLampada {
    public static void main(String[] args) {

        Lampada lamp = new Lampada();

        lamp.ligarLampada();
        lamp.setCor("Vermelha");
        System.out.println(lamp.getCor());
        lamp.setVoltagem("12v");
        System.out.println(lamp.getVoltagem());
        lamp.setTipoLampada("Lampada de teto");
        System.out.println(lamp.getTipoLampada());
        lamp.setValor(5.99);
        System.out.println(lamp.getValor());
        lamp.desligarLampada();
    }
}
