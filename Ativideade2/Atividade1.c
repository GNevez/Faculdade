#include<stdio.h>
int main(){

    int num1, num2, soma, mult, sub;
    float  div;

    printf("Digite o primeiro numero");
    scanf("%d", &num1);

    printf("Digite o segundo numero");
    scanf("%d",&num2);


    soma = num1 + num2;
    mult = num1 *  num2;
    sub = num1 - num2;
    div = (float)num1 / num2;


    printf("Soma: %d\n", soma);

    printf("Multiplicacao: %d\n", mult);

    printf("Subtracao:%d\n", sub);

    printf("Divisao:%f",div);

}