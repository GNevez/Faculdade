#include<stdio.h>
int main(){

    float salarioFixo, numeroVendas, valorVendas, valorPorCarro, salarioFinal;

    printf("Quantos carros foram vendidos:");
    scanf("%f", &numeroVendas);

    printf("Quanto em R$ vendeu:");
    scanf("%f", &valorVendas);

    printf("Insira o salario:");
    scanf("%f", &salarioFixo);

    printf("Digite o valor que recebe por carro vendido:");
    scanf("%f", &valorPorCarro);

    salarioFinal = salarioFixo + (valorPorCarro * numeroVendas) + (valorVendas * 5/100);

    printf("O salario final deste funcionario e : R$%.2f", salarioFinal);

}