package Enum_Static.Complex;

public class TestaComplex {
    public static void main(String[] args) {
        Complex num1 = new Complex(3.5, 2.0);
        Complex num2 = new Complex(1.5, 4.5);

        System.out.print("Numero complexo 1: ");
        num1.imprimir();

        System.out.print("Numero complexo 2: ");
        num2.imprimir();

        Complex soma = num1.somar(num2);
        System.out.print("Soma: ");
        soma.imprimir();

        Complex subtracao = num1.subtrair(num2);
        System.out.print("Subtracao: ");
        subtracao.imprimir();
    }
}
