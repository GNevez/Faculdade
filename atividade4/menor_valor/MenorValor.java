/*
Escreva um aplicativo que localiza o menor de vários números inteiros. Suponha que o primeiro valor lido especifica o número de valores a serem inseridos pelo usuário.
*/

import java.util.Scanner;

public class MenorValor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int resultado, numero;

        System.out.println("--- Encontrar Menor Valor ---");
        System.out.println("Quantos valores ira inserir: ");
        int quantidade = input.nextInt();

        System.out.println("Insira o valor 1:");
        resultado = input.nextInt();

        for (int i = 1; i < quantidade; i++) {
            System.out.println("Insira o valor " + (i + 1) + ":");
            numero = input.nextInt();
            if (numero < resultado) {
                resultado = numero;
            }
        }

        System.out.println("--- Resultado ---");
        System.out.println("O menor valor foi o " + resultado);
    }
}