#include <stdio.h>
#include <math.h>

int main()
{
    int x;
    float f;
    printf("Digite um valor para x para a funcao f(x) = 5x+3:\n /√x²-16 ");
    scanf("%d", &x);

    f = (float)(5 * x + 3) / sqrt(x * x - 16);

    printf("O resultado da funcao f(x) é: %.5f", f);
}