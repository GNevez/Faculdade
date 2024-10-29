import java.util.Scanner;

public class Teste{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Verificacao verificacao = new Verificacao(); 

        System.out.println("Insira um numero para realizar a verificacao: ");
        int numero = input.nextInt();

        try {
            verificacao.verificarNumero(numero);
        } catch (NumeroInvalidoException e){
            System.out.println(e.getMessage());
        }
    }
}