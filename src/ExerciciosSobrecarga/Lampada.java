package ExerciciosSobrecarga;

class Lampada {

    String cor;
    String voltagem;
    String tipoLampada;
    double valor;

    void ligarLampada(){
        System.out.println("Ligando lampada");
    }
    void desligarLampada(){
        System.out.println("Desligando lampada");
    }

    String getCor() {
        return cor;
    }

    void setCor(String cor) {
        this.cor = cor;
    }

    String getVoltagem() {
        return voltagem;
    }

    void setVoltagem(String voltagem) {
        this.voltagem = voltagem;
    }

    String getTipoLampada() {
        return tipoLampada;
    }

    void setTipoLampada(String tipoLampada) {
        this.tipoLampada = tipoLampada;
    }

    double getValor() {
        return valor;
    }

    void setValor(double valor) {
        this.valor = valor;
    }
}
