import java.util.Scanner;

public class MediaDesvioPadrao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números deseja inserir? ");
        int n = scanner.nextInt();
        double[] numeros = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite o número %d: ", i + 1);
            numeros[i] = scanner.nextDouble();
        }

        double media = calcularMedia(numeros);
        System.out.printf("Média: %.2f%n", media);

        double desvioPadrao = calcularDesvioPadrao(numeros, media);
        System.out.printf("Desvio Padrão: %.2f%n", desvioPadrao);

        scanner.close();
    }

    public static double calcularMedia(double[] numeros) {
        double soma = 0;
        for (double num : numeros) {
            soma += num;
        }
        return soma / numeros.length;
    }

    public static double calcularDesvioPadrao(double[] numeros, double media) {
        double soma = 0;
        for (double num : numeros) {
            soma += Math.pow(num - media, 2);
        }
        return Math.sqrt(soma / (numeros.length - 1));
    }
}
