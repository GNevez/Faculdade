// Um método para o cálculo de raiz quadradas de um número N já era conhecido pelos babilônios em... bom, há muito tempo (também é conhecido como Método de Heron, um matemático grego que o descreveu 20 séculos depois, perto do ano 50 DC). A medida em que o processo é repetido, os novos valores de k se aproximam cada vez mais da raiz de N. Faça um programa que leia o valor de N e exiba os primeiros doze valores calculados com essa fórmula, verificando se eles realmente se aproximaram da raiz correta.

import java.util.Scanner;

public class Heron{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("--- Metodo de Heron ---");
        System.out.println("Insira o valor que desja calcular: ");
        int valor_n = input.nextInt();

        double valor_k = 1;

        System.out.println("--- Resultado ---");
        System.out.printf("12 primeiros valores com o metodo de Heron são: ");

        for (int i = 1; i <= 12; i++){
            valor_k = (valor_k + (valor_n / valor_k)) / 2;
            System.out.printf("%.2f ", valor_k);
        }

        System.out.printf("\nLogo a raiz de %d eh igual a %.2f!", valor_n, valor_k);
    }
}