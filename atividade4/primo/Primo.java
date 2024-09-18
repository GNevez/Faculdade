// Faça um aplicativo que verifique se o número digitado n é um número primo. Lembrando que todo número primeiro é divisível apenas por 1 ou por ele mesmo.

import java.util.Scanner;

public class Primo{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in); 

        System.out.println("--- Verificar Numero Primo ---");
        System.out.println("Insira um numero para verificar se eh primo ou nao: ");
        int num = input.nextInt();

        boolean eh_primo = true;

        for(int i = 2; i < num; i++){
            if(num % i == 0){ 
                eh_primo = false;
                break;
            }
        }

        System.out.println("--- Resultado ---");
        if (eh_primo == true){ 
            System.out.printf("O numero %d eh primo!", num);
        } else {
            System.out.printf("O numero %d nao eh primo!", num);
        }
    }
}