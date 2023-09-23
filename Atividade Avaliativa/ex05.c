#include <stdio.h>
#include <math.h>
int main()
{
    int x1, x2, y1, y2;
    double distancia;

    printf("Digite o  valor para x1:");
    scanf("%d", &x1);
    printf("Digite o  valor para y1:");
    scanf("%d", &y1);
    printf("Digite o  valor para x2:");
    scanf("%d", &x2);
    printf("Digite o  valor para y2:");
    scanf("%d", &y2);

    distancia = (double)sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

    printf("A distancia entre os pontos (x1,y1) e (x2,y2) é %.4lf", distancia);
}