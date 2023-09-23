#include <stdio.h>

int main()
{
    int A;
    int B;
    int C;

    printf("De um valor para A:");
    scanf("%d", &A);

    printf("De um valor para B:");
    scanf("%d", &B);

    printf("De um valor para C:");
    scanf("%d", &C);

    if (A + B > C && B + C > A && A + C > B)
    {
        if (A != B != C)
        {
            printf("É um triangulo escaleno!");
        }
        if (A == B == C)
        {
            printf("É um triangulo equilátero!");
        }
        if (A == B != C || A != B == C || A != C == B)
        {
            printf("É um triangulo isósceles!");
        }
    }
    else
    {
        printf("Não são valores validos para lados de um triangulo.");
    }
}