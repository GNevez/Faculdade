#include <stdio.h>

int main()
{
    float Chico = 1.50;
    float Ze = 1.10;
    int anos = 0;
    
    while (Chico > Ze)
    {
        Chico += 0.02;
        Ze += 0.03;
        anos++;
    }

    printf("Daqui a %d anos Chico e Zé terão a mesma altura.", anos);
}
