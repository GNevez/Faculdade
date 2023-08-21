#include<stdio.h>

int main(){


    float reais, valorDolar;

    printf("Digite o valor em reais");
    scanf("%f", &reais);


    valorDolar = reais / 4.98;

    printf("O valor em dolar e: %.2f\n", valorDolar);
    
}