import java.util.Scanner;

public class Digitos{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um numero de cinco digitos: ");
        int numero = scanner.nextInt();
        
        if (numero < 10000 || numero > 99999) {
            System.out.println("O numero deve ter cinco digitos.");
        } else {
            String numeroStr = Integer.toString(numero);
            for (int i = 0; i < numeroStr.length(); i++) {
                System.out.print(numeroStr.charAt(i) + "   ");
            }
            System.out.println();
        }
    }
}
