import java.util.Scanner;

public class Teste{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in); 
        Conta conta01 = new Conta(12345, 500.0); 

        System.out.println("--- Conta Bancaria ---");
        System.out.println("Numero da conta: " + conta01.getNumero());
        System.out.println("Saldo atual: R$ " + conta01.consultarSaldo());

        System.out.println("Insira um valor para deposito: ");
        double deposito = input.nextDouble();
        conta01.depositar(deposito);

        System.out.println("Saldo atual: R$ " + conta01.consultarSaldo());

        System.out.println("Insira um valor para saque: ");
        double saque = input.nextDouble();

        try {
            conta01.sacar(saque);
        } catch (SaldoInsuficienteException e){
            System.out.println(e.getMessage());
        }
    }
}