public class Fatorial {


    public static int calcularFatorial(int numero) throws NegativeNumberException {
        if (numero < 0) {
            throw new NegativeNumberException("Nao eh possível calcular o fatorial de um numero negativo: " + numero);
        } else if (numero == 0 || numero == 1) {
            return 1; 
        } else {
            return numero * calcularFatorial(numero - 1); 
        }
    }

    public static void main(String[] args) {
        try {
            int numero = 5;
            int resultado = calcularFatorial(numero);
            System.out.println("Fatorial de " + numero + " eh: " + resultado);
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}