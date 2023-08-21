#include<stdio.h>
int main(){


    int anos, meses, dias, idadeDias;

    printf("Digite a sua idade em anos, meses e dias\n");
    scanf("%d %d %d", &anos, &meses, &dias);

    idadeDias = (anos * 365) + (meses * 30) + (dias);

    printf("Voce ja viveu %d dias", idadeDias);


}