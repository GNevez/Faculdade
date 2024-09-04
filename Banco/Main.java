package Banco;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double saldo = 0;
        int opcao = 1;

        while(opcao == 1 || opcao == 2){

            opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha a operação que deseja realizar: \n 1. Realizar Deposito \n 2. Apresentar Saldo"));

            switch(opcao){
                case 1:
                    double deposito = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantia que queira depositar: "));
                    saldo += deposito;
                    break;
                case 2:
                    int continuar = Integer.parseInt(JOptionPane.showInputDialog("Seu Saldo é de: " + saldo + " \n Deseja continuar? \n 1. Sim \n 2. Não"));

                    if(continuar == 0){
                        System.out.println("Encerrando o programa...");
                        scanner.close(); 
                        System.exit(0);   
                    }
                    break;
                default:
                    opcao = 0;
                    break;
            }
        }

        scanner.close();
    }
}
