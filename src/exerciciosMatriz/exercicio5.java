package exerciciosMatriz;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][][] agenda = new String[12][31][24];

        boolean sair = false;
        int opcao;
        while(!sair){

            System.out.println("Digite 1 para agendar compromisso.");
            System.out.println("Digite 2 para verificar compromisso.");
            System.out.println("Digite 0 para sair");
            opcao = sc.nextInt();

            if(opcao == 1){//Adicionar compromisso
                boolean mesValido = false;
                int mes = 0;
                while(!mesValido){
                    System.out.println("Digite mês que deseja agendar o compromisso de 1 á 12.");
                    mes = sc.nextInt();
                    if(mes > 0 && mes <= 12){
                        mesValido = true;
                    } else {
                        System.out.println("Mês inválido, digite novamente.");
                    }
                }
                boolean diaValido = false;
                int dia = 0;
                while(!diaValido){
                    System.out.println("Digite um dia que deseja agendar o compromisso.");
                    dia = sc.nextInt();
                    if(dia > 0 && dia <= 31){
                        diaValido = true;
                    } else {
                        System.out.println("Dia inválido, digite novamente.");
                    }
                }
                boolean horaValida = false;
                int hora = 0;
                while(!horaValida) {
                    System.out.println("Digite a hora que deseja agendar compromisso entre o horario de funcionamento, de 7 até 12 e 14 até 18.");
                    hora = sc.nextInt();
                    if (hora >= 7 && hora <= 12 || hora >= 14 && hora <= 18) {
                        horaValida = true;
                    } else {
                        System.out.println("Hora inválida, digite novamente.");
                    }
                }
                mes--;
                dia--;
                System.out.println("Digite o compromisso:");
                agenda[mes][dia][hora] = sc.next();

            } else if (opcao == 2) {//Verificar comprossimo
                boolean mesValido = false;
                int mes = 0;
                while(!mesValido) {
                    System.out.println("Digite mês que deseja ver o compromisso de 1 á 12.");
                    mes = sc.nextInt();
                    if (mes > 0 && mes <= 12) {
                        mesValido = true;
                    } else {
                        System.out.println("Mês inválido, digite novamente.");
                    }
                }
                boolean diaValido = false;
                int dia = 0;
                while(!diaValido){
                    System.out.println("Digite um dia que deseja ver o compromisso.");
                    dia = sc.nextInt();
                    if(dia > 0 && dia <= 31){
                        diaValido = true;
                    } else {
                        System.out.println("Dia inválido, digite novamente.");
                    }
                }
                boolean horaValida = false;
                int hora = 0;
                while(!horaValida) {
                    System.out.println("Digite a hora que deseja ver o compromisso.");
                    hora = sc.nextInt();
                    if (hora >= 0 && hora <= 24) {
                        horaValida = true;
                    } else {
                        System.out.println("Hora inválida, digite novamente.");
                    }
                }
                mes--;
                dia--;
                System.out.println("O compromisso agendado é");
                System.out.println(agenda[mes][dia][hora]);

            } else if (opcao == 0) {
                sair = true;
            } else {
                System.out.println("Opção inválida, digite novamente");
            }
        }
    }
}
