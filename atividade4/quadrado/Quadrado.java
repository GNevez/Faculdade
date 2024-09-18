// O quadrado de um número natural n é dado pela soma dos n primeiros números ímpares consecutivos. Por exemplo, 1^2=1,2^2=1+3,3^2=1+3+5, Dado um número n, calcule seu quadrado usando a soma de ímpares ao invés de produto.

import java.util.Scanner;

public class Quadrado{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in); 

        System.out.println("--- Calcular Quadrado ---");

        System.out.println("Insira um numero para calcular o seu quadrado: ");
        int numero = input.nextInt();

        int resultado = 0; 

        for (int i = 1; i <= numero * 2; i += 2){
            resultado += i;
        }

        System.out.println("--- Resultado ---");
        System.out.printf("O quadrado de %d eh %d!", numero, resultado);
    }
}