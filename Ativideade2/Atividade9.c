#include<stdio.h>

int main(){

    float custoCarro, valorFinal;

    printf("Digite o custo de fabrica do carro");
    scanf("%f", &custoCarro);

    valorFinal = (custoCarro * 28/100) + (custoCarro * 45/100) + (custoCarro);

    printf("O custo final do carro e: R$%.2f", valorFinal);


}