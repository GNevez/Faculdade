#include<stdio.h>
#include<math.h>


int main(){

    double raio, area, PI = 3.14;

    printf("Digite o valor do raio");
    scanf("%lf", &raio);

    area = PI *(pow(raio, 2));

    printf("A area do circulo e: %lf\n", area);
    

}