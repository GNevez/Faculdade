#include <stdio.h>

int main() {
    float soma_salarios = 0;
    float soma_numero_filhos = 0;
    float maior_salario = -1;
    int pessoas_com_salario_ate_100 = 0;
    int contador = 0;
    float salario;

    do {
        printf("Digite o salário (ou -1 para encerrar): ");
        scanf("%f", &salario);

        if (salario < 0) {
            break;
        }

        float numero_filhos;
        printf("Digite o número de filhos: ");
        scanf("%f", &numero_filhos);

        soma_salarios += salario;
        soma_numero_filhos += numero_filhos;
        contador++;

        if (salario > maior_salario) {
            maior_salario = salario;
        }

        if (salario <= 100) {
            pessoas_com_salario_ate_100++;
        }

    } while (1);

    float media_salario = soma_salarios / contador;

    float media_numero_filhos = soma_numero_filhos / contador;

    float percentual_salario_ate_100 = (float)pessoas_com_salario_ate_100 / contador * 100;

    printf("Média do salário da população: %.2f\n", media_salario);
    printf("Média do número de filhos: %.2f\n", media_numero_filhos);
    printf("Maior salário: %.2f\n", maior_salario);
    printf("Percentual de pessoas com salário até R$100,00: %.2f%%\n", percentual_salario_ate_100);

    return 0;
}
