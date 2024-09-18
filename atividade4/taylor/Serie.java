// Faça um programa que calcule o valor aproximado de cos(x) pela série de Taylor.

import java.util.Scanner;

public class Serie{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in); 

        System.out.println("--- Calcular Serie Taylor ---");
        System.out.println("Insira o valor de x (em radianos): ");
        double valor_x = input.nextDouble();

        System.out.println("Insira o numero de termos para calcular: ");
        int numero = input.nextInt();

        double resultado = 1;
        int sinal = -1; 

        for (int i = 1; i <= numero; i++){
            double termo = Math.pow(valor_x, 2* i) / calcularFatorial(2 * i);
            resultado += sinal * termo;
            sinal *= -1; 
        }

        System.out.println("--- Resultado ---");
        System.out.printf("A serie Taylor para cos(%.2f) com %d termos eh aproximadamente %.4f!", valor_x, numero, resultado);
    }

    public static double calcularFatorial(int num){ 
        double fatorial = 1;
        for (int i = num; i > 0; i--) {
            fatorial *= i;
        }
        return fatorial;
    }
}