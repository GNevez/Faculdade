import java.util.Scanner;
import java.util.Stack;

public class Parenteses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma expressão com parênteses: ");
        String expressao = scanner.nextLine();

        if (verificaParenteses(expressao)) {
            System.out.println("OK");
        } else {
            System.out.println("Erro");
        }

        scanner.close();
    }

    public static boolean verificaParenteses(String expressao) {
        Stack<Character> pilha = new Stack<>();

        for (int i = 0; i < expressao.length(); i++) {
            char c = expressao.charAt(i);

            if (c == '(') {
                pilha.push(c);
            }
            else if (c == ')') {
                if (pilha.isEmpty()) {
                    return false;
                }
                pilha.pop();
            }
        }

        return pilha.isEmpty();
    }
}
