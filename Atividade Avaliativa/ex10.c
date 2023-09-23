#include <stdio.h>
#include <string.h>

#define MAX_CIDADES 200

struct DadosCidade {
    int codigo;
    char estado[3];
    int veiculos;
    int acidentes;
};

int main() {
    struct DadosCidade cidades[MAX_CIDADES];
    int n;

    printf("Digite o numero de cidades (ate 200): ");
    scanf("%d", &n);

    if (n < 1 || n > MAX_CIDADES) {
        printf("Numero de cidades fora do limite permitido.\n");
        return 1;
    }

    for (int i = 0; i < n; i++) {
        printf("Cidade %d:\n", i + 1);
        printf("Codigo da cidade: ");
        scanf("%d", &cidades[i].codigo);
        printf("Estado: ");
        scanf("%s", cidades[i].estado);
        printf("Numero de veiculos de passeio em 1992: ");
        scanf("%d", &cidades[i].veiculos);
        printf("Numero de acidentes de transito com vitimas em 1992: ");
        scanf("%d", &cidades[i].acidentes);
    }

    int MaiorAcidente = cidades[0].acidentes;
    int MenorAcidente = cidades[0].acidentes;
    int indice_MaiorAcidente = 0;
    int indice_MenorAcidente = 0;
    int TotalVeiculos = 0;
    int total_acidentes_rs = 0;
    int num_cidades_rs = 0;

    for (int i = 0; i < n; i++) {
        if (cidades[i].acidentes > MaiorAcidente) {
            MaiorAcidente = cidades[i].acidentes;
            indice_MaiorAcidente = i;
        }
        if (cidades[i].acidentes < MenorAcidente) {
            MenorAcidente = cidades[i].acidentes;
            indice_MenorAcidente = i;
        }

        TotalVeiculos += cidades[i].veiculos;

        if (strcmp(cidades[i].estado, "RS") == 0) {
            total_acidentes_rs += cidades[i].acidentes;
            num_cidades_rs++;
        }
    }

    printf("\nResultados:\n");
    printf("Maior indice de acidentes de transito: %d na cidade %d\n", MaiorAcidente, cidades[indice_MaiorAcidente].codigo);
    printf("Menor indice de acidentes de transito: %d na cidade %d\n", MenorAcidente, cidades[indice_MenorAcidente].codigo);
    printf("Media de veiculos nas cidades brasileiras: %.2f\n", (float)TotalVeiculos / n);

    if (num_cidades_rs > 0) {
        printf("Media de acidentes com vitimas no Rio Grande do Sul: %.2f\n", (float)total_acidentes_rs / num_cidades_rs);
    } else {
        printf("Nenhuma cidade do Rio Grande do Sul encontrada nos dados.\n");
    }

    return 0;
}
