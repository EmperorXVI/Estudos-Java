package exerciciosMatriz;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] agenda = new String[31][24];

        boolean sair = false;
        int opcao;
        while(!sair){

            System.out.println("Digite 1 para agendar compromisso.");
            System.out.println("Digite 2 para verificar compromisso.");
            System.out.println("Digite 0 para sair");
            opcao = sc.nextInt();

            if(opcao == 1){//Adicionar compromisso
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
                    System.out.println("Digite a hora que deseja agendar compromisso.");
                    hora = sc.nextInt();
                    if (hora >= 0 && hora <= 24) {
                        horaValida = true;
                    } else {
                        System.out.println("Hora inválida, digite novamente.");
                    }
                }
                dia--;
                System.out.println("Digite o compromisso:");
                agenda[dia][hora] = sc.next();

            } else if (opcao == 2) {//Verificar comprossimo
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
                dia--;
                System.out.println("O compromisso agendado é");
                System.out.println(agenda[dia][hora]);

            } else if (opcao == 0) {
                sair = true;
            } else {
                System.out.println("Opção inválida, digite novamente");
            }
        }
    }
}
