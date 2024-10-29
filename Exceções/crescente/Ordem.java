import java.util.Scanner;

public class Ordem{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int numero1 = input.nextInt();

        System.out.print("Digite o segundo numero: ");
        int numero2 = input.nextInt();

        System.out.print("Digite o terceiro numero: ");
        int numero3 = input.nextInt();

        assert numero1 <= numero2 && numero2 <= numero3 : "Erro: os numeros nao estao em ordem crescente!";

        System.out.println("Os numeros estao em ordem crescente: " + numero1 + ", " + numero2 + ", " + numero3);
    }
}
