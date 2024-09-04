import java.util.Scanner;

public class Combustivel {

    public static int continuar = 1;

    public static void main(String args[]){
        while(continuar == 1){
            CombustivelViagem viagem = new CombustivelViagem();
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Informe a quantidade de Km's percorridos: ");
            viagem.setKm(scanner.nextDouble());
            
            System.out.println("Informe a quantidade de gasolina abastecida: ");
            viagem.setGas(scanner.nextInt());
            
            
            viagem.CombustivelViagem();
            
            System.out.println("Deseja continuar? 1. Sim / 2. Nao");
            continuar = scanner.nextInt();
        }
    }
}