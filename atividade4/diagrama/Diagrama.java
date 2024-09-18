// Uma aplicação interessante dos computadores é exibir diagramas e gráficos de barras. Escreva um aplicativo que leia cinco números entre 1 e 30. Para cada número que é lido, seu programa deve exibir o mesmo número de asteriscos adjacentes. Por exemplo, se seu programa lê o número 7, ele deve exibir *******. Exiba as barras dos asteriscos depois de ler os cinco números.

import java.util.Scanner;

public class Diagrama{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("--- Diagrama ---");

        System.out.println("Insira o 1o numero: ");
        int num1 = input.nextInt();
        System.out.println("Insira o 2o numero: ");
        int num2 = input.nextInt();
        System.out.println("Insira o 3o numero: ");
        int num3 = input.nextInt();
        System.out.println("Insira o 4o numero: ");
        int num4 = input.nextInt();
        System.out.println("Insira o 5o numero: ");
        int num5 = input.nextInt();

        System.out.println("--- Resultado ---");

        System.out.printf("1o numero: ");
        for(int i = 0; i < num1; i++){
            System.out.printf("*");
        }

        System.out.printf("\n2o numero: ");
        for(int i = 0; i < num2; i++){
            System.out.printf("*");
        }

        System.out.printf("\n3o numero: ");
        for(int i = 0; i < num3; i++){
            System.out.printf("*");
        }

        System.out.printf("\n4o numero: ");
        for(int i = 0; i < num4; i++){
            System.out.printf("*");
        }

        System.out.printf("\n5o numero: ");
        for(int i = 0; i < num5; i++){
            System.out.printf("*");
        }
    }
}