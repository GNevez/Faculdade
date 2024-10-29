import java.util.Scanner;

public class Conversor{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a conversão:");
        System.out.println("1: Celsius para Fahrenheit");
        System.out.println("2: Fahrenheit para Celsius");
        
        int escolha = scanner.nextInt();
        scanner.nextLine(); 

        try {
            if (escolha == 1) {
                System.out.print("Digite a temperatura em Celsius: ");
                String inputCelsius = scanner.nextLine();
                double celsius = Double.parseDouble(inputCelsius);
                double fahrenheit = (celsius * 9/5) + 32;
                System.out.printf("%.2f Celsius eh igual a %.2f Fahrenheit%n", celsius, fahrenheit);
            } else if (escolha == 2) {
                System.out.print("Digite a temperatura em Fahrenheit: ");
                String inputFahrenheit = scanner.nextLine();
                double fahrenheit = Double.parseDouble(inputFahrenheit);
                double celsius = (fahrenheit - 32) * 5/9;
                System.out.printf("%.2f Fahrenheit eh igual a %.2f Celsius%n", fahrenheit, celsius);
            } else {
                System.out.println("Escolha invalida. Por favor, escolha 1 ou 2.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Erro: Insira um valor numerico valido.");
        }
    }
}

