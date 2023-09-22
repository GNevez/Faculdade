#include <stdio.h>

int main()
{
    int numeroControle, quantidadeABACAXI = 0, quantidadeMACA = 0, quantidadePERA = 0, total;

    do
    {
        printf("Digite o numero para selecionar a fruta desejada\n1 => ABACAXI – 5,00 a unidade\n2 => MACA – 1,00 a unidade\n3 => PERA – 4,00 a unidade\n4 => Finalizar compras\n");
        scanf("%d", &numeroControle);
        
        switch (numeroControle)
        {
        case 1:
            quantidadeABACAXI++;
            break;
        case 2:
            quantidadeMACA++;
            break;
        case 3:
            quantidadePERA++;
            break;
        case 4:
            break;

        default:
            printf("Você selecionou uma opCão invalida");
            break;
        }
    } while (numeroControle != 4);

    total = (quantidadeABACAXI * 5) + (quantidadeMACA) + (quantidadePERA * 4);

    printf("O total da sua compra é:%d\n", total);
}