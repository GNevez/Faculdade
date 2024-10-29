import java.util.Scanner;

public class Teste{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in); 
        Produto produto01 = new Produto("000", 0, 0); 

        System.out.println("Insira o nome do produto: ");
        String nome = input.nextLine();

        produto01.setNome(nome);

        System.out.println("Insira o ID do produto: ");
        int id = input.nextInt();

        produto01.setId(id);

        System.out.println("Insira o preco do produto: ");
        double preco = input.nextDouble();

        try {
            produto01.setPreco(preco);
        } catch (PrecoInvalidoException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("--- Infos do Produto ---");
        System.out.println("Nome: " + produto01.getNome());
        System.out.println("ID: " + produto01.getId());
        System.out.println("Preco: R$ " + produto01.getPreco());

    }
}