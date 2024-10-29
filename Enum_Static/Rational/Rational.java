package Enum_Static.Rational;

public class Rational {
    private int numerator;
    private int denominator;

    public Rational(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominador nao pode ser zero.");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        reduzir();
    }

    public Rational() {
        this.numerator = 0;
        this.denominator = 1;
    }

    private void reduzir() {
        int mdc = mdc(numerator, denominator);
        numerator /= mdc;
        denominator /= mdc;

        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    private int mdc(int a, int b) {
        if (b == 0) {
            return Math.abs(a);
        }
        return mdc(b, a % b);
    }

    public static Rational somar(Rational r1, Rational r2) {
        int num = r1.numerator * r2.denominator + r2.numerator * r1.denominator;
        int denom = r1.denominator * r2.denominator;
        return new Rational(num, denom);
    }

    public static Rational subtrair(Rational r1, Rational r2) {
        int num = r1.numerator * r2.denominator - r2.numerator * r1.denominator;
        int denom = r1.denominator * r2.denominator;
        return new Rational(num, denom);
    }

    public static Rational multiplicar(Rational r1, Rational r2) {
        int num = r1.numerator * r2.numerator;
        int denom = r1.denominator * r2.denominator;
        return new Rational(num, denom);
    }

    public static Rational dividir(Rational r1, Rational r2) {
        if (r2.numerator == 0) {
            throw new IllegalArgumentException("Não e possivel dividir por zero.");
        }
        int num = r1.numerator * r2.denominator;
        int denom = r1.denominator * r2.numerator;
        return new Rational(num, denom);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public double paraDouble() {
        return (double) numerator / denominator;
    }
}

