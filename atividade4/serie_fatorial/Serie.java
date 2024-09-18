// Faça um programa que leia um valor N qualquer, inteiro e positivo, calcule e mostre o resultado da serie fatorial.

import java.util.Scanner;

public class Serie{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in); 

        System.out.println("--- Calcular Serie Fatorial ---");
        System.out.println("Insira o numero que deseja calcular: ");
        int numero = input.nextInt();

        double resultado = 0;

        for (int i = 1; i <= numero; i++){
            resultado += 1 / calcularFatorial(i);
        }

        System.out.println("--- Resultado ---");
        System.out.printf("A serie fatorial de %d eh %.4f!", numero, resultado);

    }

    public static double calcularFatorial(int num){ 
        double fatorial = 1;
        for (int i = num; i > 0; i--) {
            fatorial *= i;
        }
        return fatorial;
    }
}