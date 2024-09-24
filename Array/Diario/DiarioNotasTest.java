import java.util.Scanner;

public class DiarioNotasTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do curso: ");
        String nomeCurso = scanner.nextLine();

        int[] notas = new int[5]; 
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Digite a nota do aluno %d: ", i + 1);
            notas[i] = scanner.nextInt();
        }

        DiarioNotas diario = new DiarioNotas(nomeCurso, notas);

        diario.imprimirRelatorioNotas();
        diario.imprimirGraficoBarras();

        scanner.close();
    }
}
