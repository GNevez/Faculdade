#include <stdio.h>

int main()
{
    int voto, candidato1 = 0, candidato2 = 0, candidato3 = 0, candidato4 = 0, votoNulo = 0, votoBranco = 0;

    do
    {
        
        printf("Digite o codigo para seu candidato: \n(1) Para candidato 1 \n(2) Para candidato 2 \n(3) Para candidato 3 \n(4) Para candidato 4 \n(5) Para voto nulo \n(6) Para voto em branco \n(0) Para finalizar \nInsira: ");
        scanf(" %d", &voto);

        if (voto == 1) {
            candidato1++;
        } else if (voto == 2) {
            candidato2++;
        } else if (voto == 3) {
            candidato3++;
        } else if (voto == 4) {
            candidato4++;
        } else if (voto == 5) {
            votoNulo++;
        } else if (voto == 6) {
            votoBranco++;
        }
    } while (voto != 0);

    printf("O total de votos do candidato 1 :%d\n", candidato1);
    printf("O total de votos do candidato 2 :%d\n", candidato2);
    printf("O total de votos do candidato 3 :%d\n", candidato3);
    printf("O total de votos do candidato 4 :%d\n", candidato4);
    printf("O total de votos nulos :%d\n", votoNulo);
    printf("O total de votos brancos :%d\n", votoBranco);
}