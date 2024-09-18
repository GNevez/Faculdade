import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in); 
        Juros calculoAtual = new Juros(); 

        System.out.println("--- Calculadora de Juros ---");

        System.out.println("Insira a quantia original investida:");
        double quantia = input.nextDouble();
        calculoAtual.setQuantiaOriginal(quantia);

        System.out.println("Insira a taxa de juros anual em %:");
        double taxa = input.nextDouble();
        calculoAtual.setTaxaAnual(taxa);

        System.out.println("Insira o numero de anos:");
        int anos = input.nextInt();
        calculoAtual.setNumeroAnos(anos);

        System.out.println("--- Resultado ---");
        System.out.printf("A quantia em deposito eh: US$ %.2f", calculoAtual.calcularQuantiaDeposito());
    }
}