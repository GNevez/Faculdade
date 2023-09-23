#include <stdio.h>
#include <math.h>
int main()
{
    int A, B, C;
    double cosseno, anguloDotrianguloemradianos, anguloFinal;
    printf("De um valor para A:");
    scanf("%d", &A);

    printf("De um valor para B:");
    scanf("%d", &B);

    printf("De um valor para C:");
    scanf("%d", &C);

    cosseno = (A * A + B * B - C * C) / (2 * A * B);

    anguloDotrianguloemradianos = acos(cosseno);

    anguloFinal = anguloDotrianguloemradianos * 180.0 / M_PI;

    if (A + B > C && B + C > A && A + C > B)
    {
        if (anguloFinal == 90)
        {
            printf("É um triangulo Retângulo!");
        }
        if (anguloFinal > 90)
        {
            printf("É um triangulo Obtusângulo!");
        }
        if (anguloFinal < 90)
        {
            printf("É um triangulo Acutângulo!");
        }
    }
    else
    {
        printf("Não são valores validos para lados de um triangulo.");
    }
}
