// Fatoriais costumam ser utilizados em problemas de probabilidade. O fatorial de um inteiro positivo n (escrito como n! e pronunciado como “fatorial de n”) é igual ao produto dos números inteiros positivos de 1 a n. Escreva um aplicativo que calcula os fatoriais de 1 a 20. Utilize o tipo long. Exiba os resultados em formato tabular. Que dificuldade poderia impedir você de calcular o fatorial de 100?

import java.util.Scanner;

public class Fatorial{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("--- Calculadora Fatorial ---");
        System.out.println("Insira o numero que deseja calcular: ");
        int numero = input.nextInt();

        System.out.printf("%s \t %s\n", "n", "n!");

        for (int i = 1; i <= numero; i++) {
            
            long resultado = 1; 
            
            for (int j = i; j > 0; j--) {
                resultado *= j;
            }

            System.out.printf("%d \t %d\n", i, resultado);
        }
    }
}