package aula10;

public class arrays {
    public static void main(String[] args) {

        double[] temperaturas = new double[365];
        temperaturas[0] = 23;
        temperaturas[1] = 28;
        temperaturas[2] = 29;
        temperaturas[3] = 25;

        System.out.println("A temperatura do dia 1 é: " + temperaturas[0]);//Puxar a informação armazenada no array
        System.out.println("Tamanho do armazenato Array: " + temperaturas.length);//Puxa o tamanho total de armazenamento do seu array

        //usei o for normal para preencher o resto do espaço da memória do array
        for(int i =0; i<temperaturas.length;i++){
            System.out.println("O valor da temperatura do dia " + i + " é " + temperaturas[i]);
        }
        //for melhorado com array, ele printa os 365 espaços do array, mas não tem como ver qual dia está
        for(double temp: temperaturas){
            System.out.println(temp);
        }
    }
}
