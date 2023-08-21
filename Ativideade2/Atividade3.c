#include<stdio.h>
int main(){

    float largura, comprimento, area;

    printf("Entre com a largura da sua sala");
    scanf("%f",&largura);

    printf("Entre agora com o comprimento");
    scanf("%f", &comprimento);

    area = largura * comprimento;

    printf("A area da sua sama e: %.2fm2\n",area);


}