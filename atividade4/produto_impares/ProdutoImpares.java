// Escreva um aplicativo que calcula o produto dos números inteiros ímpares de 1 a 15.

import java.util.Scanner;

public class ProdutoImpares{

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        int total = 1;

        System.out.println("--- Produto de Numeros Impares ---");
        System.out.println("Insira um numero impar: ");
        int numero = input.nextInt();

        System.out.println("--- Resultado ---");

        for (int i = 1; i <= numero; i += 2){
            if (i < numero){
                System.out.printf("%d * ", i);
            } else {
                System.out.printf("%d ", i);
            }
            total *= i;
        }

        System.out.printf("= %d", total);
    }
}