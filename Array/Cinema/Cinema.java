import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        int[] lugares_vagos = {10, 2, 1, 3, 0};
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite o número da sala (1-5) ou 0 para sair: ");
            int sala = scanner.nextInt();

            if (sala == 0) {
                System.out.println("Encerrando programa.");
                break;
            }

            if (sala < 1 || sala > 5) {
                System.out.println("Número de sala inválido. Tente novamente.");
                continue;
            }

            System.out.print("Digite a quantidade de lugares solicitados: ");
            int lugares_solicitados = scanner.nextInt();

            if (lugares_vagos[sala - 1] >= lugares_solicitados) {
                
                lugares_vagos[sala - 1] -= lugares_solicitados;
                System.out.println("Venda realizada! Restam " + lugares_vagos[sala - 1] + " lugares na sala " + sala);
            } else {
                System.out.println("Não há lugares suficientes na sala " + sala);
            }
        }

        scanner.close();
    }
}
