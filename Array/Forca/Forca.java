import java.util.ArrayList;
import java.util.Scanner;

public class Forca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palavra = "programacao";  
        ArrayList<Character> letrasCorretas = new ArrayList<>();
        ArrayList<Character> letrasErradas = new ArrayList<>();
        int tentativas = 6;

        for (int i = 0; i < palavra.length(); i++) {
            letrasCorretas.add('_');
        }

        while (tentativas > 0) {
            System.out.println("Palavra: " + mostrarPalavra(letrasCorretas));
            System.out.println("Letras erradas: " + letrasErradas);
            System.out.println("Tentativas restantes: " + tentativas);
            System.out.print("Digite uma letra: ");
            char letra = scanner.next().toLowerCase().charAt(0);

            if (palavra.indexOf(letra) >= 0) {
                for (int i = 0; i < palavra.length(); i++) {
                    if (palavra.charAt(i) == letra) {
                        letrasCorretas.set(i, letra);
                    }
                }
            } else {
                if (!letrasErradas.contains(letra)) {
                    letrasErradas.add(letra);
                    tentativas--;
                }
            }

            if (!letrasCorretas.contains('_')) {
                System.out.println("Você ganhou! a palavra era: " + palavra);
                break;
            }
        }

        if (tentativas == 0) {
            System.out.println("Você perdeu! A palavra era: " + palavra);
        }

        scanner.close();
    }

    public static String mostrarPalavra(ArrayList<Character> letrasCorretas) {
        StringBuilder palavraMostrada = new StringBuilder();
        for (char letra : letrasCorretas) {
            palavraMostrada.append(letra).append(' ');
        }
        return palavraMostrada.toString();
    }
}
