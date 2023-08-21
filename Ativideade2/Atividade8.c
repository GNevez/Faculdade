#include<stdio.h>

int main(){

    float salarioAtual, porcentagemReajuste, novoSalario, reajusteFinal;

    printf("Digite o salario atual");
    scanf("%f", &salarioAtual);

    printf("Digite a porcentagem de rajuste");
    scanf("%f", &porcentagemReajuste);

    reajusteFinal = porcentagemReajuste/100;

    novoSalario = (salarioAtual * reajusteFinal) + salarioAtual;

    printf("Novo salario e: R$%.2f", novoSalario);


}