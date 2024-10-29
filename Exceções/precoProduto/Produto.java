import java.util.Scanner;

public class Produto{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in); 

        System.out.println("Insira o nome do produto: ");
        String nome = input.nextLine();

        System.out.println("Insira o ID do produto: ");
        int id = input.nextInt();

        System.out.println("Insira o preco do produto: ");
        double preco = input.nextDouble();

        assert preco > 0 : "Preco invalido! O valor deve ser maior que zero!";

        System.out.println("--- Infos do Produto ---");
        System.out.println("Nome: " + nome);
        System.out.println("ID: " + id);
        System.out.println("Preco: R$ " + preco);

    }
}