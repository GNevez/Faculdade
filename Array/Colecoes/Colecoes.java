import java.util.ArrayList;
import java.util.Arrays;

public class Colecoes {
    public static void main(String[] args) {
        ArrayList<Integer> dados = new ArrayList<>(Arrays.asList(12, -2, 4, 8, 29, 45, 78, 36, -17, 2, 12, 8, 3, 3, -52));

        int maior = dados.get(0);
        for (int num : dados) {
            if (num > maior) {
                maior = num;
            }
        }
        System.out.println("Maior elemento: " + maior);

        int menor = dados.get(0);
        for (int num : dados) {
            if (num < menor) {
                menor = num;
            }
        }
        System.out.println("Menor elemento: " + menor);

        System.out.print("Números pares: ");
        for (int num : dados) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        int primeiroElemento = dados.get(0);
        int ocorrencias = 0;
        for (int num : dados) {
            if (num == primeiroElemento) {
                ocorrencias++;
            }
        }
        System.out.println("Ocorrências do primeiro elemento (" + primeiroElemento + "): " + ocorrencias);

        double soma = 0;
        for (int num : dados) {
            soma += num;
        }
        double media = soma / dados.size();
        System.out.println("Média dos elementos: " + media);

        int somaNegativos = 0;
        for (int num : dados) {
            if (num < 0) {
                somaNegativos += num;
            }
        }
        System.out.println("Soma dos elementos negativos: " + somaNegativos);
    }
}
