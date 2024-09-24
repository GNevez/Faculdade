public class DiarioNotas {
    private String nomeCurso;
    private int[] notas;

    public DiarioNotas(String nomeCurso, int[] notas) {
        this.nomeCurso = nomeCurso;
        this.notas = notas;
    }

    public int getMaiorNota() {
        int maior = notas[0];
        for (int nota : notas) {
            if (nota > maior) {
                maior = nota;
            }
        }
        return maior;
    }

    public int getMenorNota() {
        int menor = notas[0];
        for (int nota : notas) {
            if (nota < menor) {
                menor = nota;
            }
        }
        return menor;
    }

    public double getMedia() {
        int soma = 0;
        for (int nota : notas) {
            soma += nota;
        }
        return (double) soma / notas.length;
    }

    public void imprimirGraficoBarras() {
        System.out.println("Distribuição de notas:");
        int[] frequencia = new int[11];
        for (int nota : notas) {
            frequencia[nota / 10]++;
        }
        for (int i = 0; i < frequencia.length; i++) {
            if (i == 10) {
                System.out.printf("%5d: ", 100);
            } else {
                System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);
            }
            for (int j = 0; j < frequencia[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void imprimirRelatorioNotas() {
        System.out.println("Relatório de Notas do curso: " + nomeCurso);
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Estudante %d: %d%n", i + 1, notas[i]);
        }
        System.out.printf("Maior nota: %d%n", getMaiorNota());
        System.out.printf("Menor nota: %d%n", getMenorNota());
        System.out.printf("Média das notas: %.2f%n", getMedia());
    }
}
