#include <stdio.h>
int main()
{
    int numAlunos = 3;
    float notas1[numAlunos], notas2[numAlunos], notas3[numAlunos], medias[numAlunos], mediaGeral = 0.0 ;

    
    for (int i = 0; i < numAlunos; i++)
    {
        printf("Digite as notas do aluno %d:\n", i + 1);
        printf("Nota 1: ");
        scanf("%f", &notas1[i]);
        printf("Nota 2: ");
        scanf("%f", &notas2[i]);
        printf("Nota 3: ");
        scanf("%f", &notas3[i]);

        medias[i] = (notas1[i] * 2 + notas2[i] * 4 + notas3[i] * 3) / 10;
        mediaGeral += medias[i];
    }

    mediaGeral = mediaGeral / numAlunos;

    printf("\nResultados:\n");
    for (int i = 0; i < numAlunos; i++)
    {
        printf("Aluno %d - Média: %.2f - ", i + 1, medias[i]);
        if (medias[i] >= 7.0)
        {
            printf("Aprovado\n");
        }
        else
        {
            printf("Reprovado\n");
        }
    }

    printf("\nMédia Geral da Turma: %.2f\n", mediaGeral);

    return 0;
}
