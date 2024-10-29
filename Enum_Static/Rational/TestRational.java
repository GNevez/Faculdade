package Enum_Static.Rational;

public class TestRational {
    public static void main(String[] args) {
        Rational r1 = new Rational(1, 2);
        Rational r2 = new Rational(3, 4);

        Rational soma = Rational.somar(r1, r2);
        System.out.println("Soma: " + soma);

        Rational diferenca = Rational.subtrair(r1, r2);
        System.out.println("Subtracao: " + diferenca);

        Rational produto = Rational.multiplicar(r1, r2);
        System.out.println("Multiplicacao: " + produto);

        Rational quociente = Rational.dividir(r1, r2);
        System.out.println("Divisao: " + quociente);

        System.out.println("Representacao em ponto flutuante: " + r1.paraDouble());
    }
}
