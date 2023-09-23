#include <stdio.h>
int main()
{
    float x, y;

    printf("Digite um valor para x");
    scanf("%f", &x);

    printf("Digite um valor para y");
    scanf("%f", &y);

    if (y > 0 && x > 0)
    {
        printf("Está no primeiro quadrante");
    }
    if (y > 0 && x < 0)
    {
        printf("Está no segundo quadrante");
    }
    if (y < 0 && x < 0)
    {
        printf("Está no terceiro quadrante");
    }
    if (y < 0 && x > 0)
    {
        printf("Está no quarto quadrante");
    }
    if (y == 0 && x != 0)
    {
        printf("Está no eixo X");
    }
    if (x == 0 && y != 0)
    {
        printf("Está no eixo Y");
    }
    if (x == 0 && y == 0)
    {
        printf("Está na origem");
    }
}