import java.util.Scanner;

public class NumerosUnicos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numerosUnicos = new int[5];
        int quantidadeUnicos = 0; 

        for (int i = 0; i < 5; i++) {
            System.out.print("Insira um número entre 10 e 100: ");
            int numero = scanner.nextInt();

            if (numero < 10 || numero > 100) {
                System.out.println("Número fora do intervalo permitido. Tente novamente.");
                i--; 
                continue;
            }

            boolean duplicado = false;
            for (int j = 0; j < quantidadeUnicos; j++) {
                if (numerosUnicos[j] == numero) {
                    duplicado = true;
                    break;
                }
            }

            if (!duplicado) {
                numerosUnicos[quantidadeUnicos] = numero;
                quantidadeUnicos++;
            } else {
                System.out.println("Número duplicado. Não será inserido.");
            }

            System.out.print("Valores únicos inseridos até agora: ");
            for (int j = 0; j < quantidadeUnicos; j++) {
                System.out.print(numerosUnicos[j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
