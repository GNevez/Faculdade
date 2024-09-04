import java.util.Scanner;

public class Criptografia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um numero de quatro digitos: ");
        int numero = scanner.nextInt();
        
        if (numero < 1000 || numero > 9999) {
            System.out.println("O numero deve ter quatro digitos.");
            return;
        }
        
        int d1 = (numero / 1000) % 10;
        int d2 = (numero / 100) % 10;
        int d3 = (numero / 10) % 10;
        int d4 = numero % 10;
        
        d1 = (d1 + 7) % 10;
        d2 = (d2 + 7) % 10;
        d3 = (d3 + 7) % 10;
        d4 = (d4 + 7) % 10;
        
        int temp = d1;
        d1 = d3;
        d3 = temp;
        
        temp = d2;
        d2 = d4;
        d4 = temp;
        
        int cripto = d1 * 1000 + d2 * 100 + d3 * 10 + d4;
        System.out.println("Numero criptografado: " + cripto);
    }
}
