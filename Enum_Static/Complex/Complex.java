package Enum_Static.Complex;

public class Complex {
    private double parteReal;
    private double parteImaginaria;

    public Complex() {
        this(0.0, 0.0);
    }

    public Complex(double parteReal, double parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }

    public Complex somar(Complex outro) {
        return new Complex(this.parteReal + outro.parteReal, this.parteImaginaria + outro.parteImaginaria);
    }

    public Complex subtrair(Complex outro) {
        return new Complex(this.parteReal - outro.parteReal, this.parteImaginaria - outro.parteImaginaria);
    }

    public void imprimir() {
        System.out.println("(" + parteReal + ", " + parteImaginaria + ")");
    }
}

