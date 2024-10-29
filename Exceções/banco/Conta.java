public class Conta{

    private int numero_conta;
    private double saldo_total;

    public Conta(int numero, double saldo){ 
        this.numero_conta = numero;
        this.saldo_total = saldo;
    }

    public int getNumero(){ 
        return this.numero_conta;
    }

    public double consultarSaldo(){
        return this.saldo_total;
    }

    public void depositar(double valor){ 
        if (valor > 0){
            this.saldo_total += valor;
            System.out.println("Deposito realizado com sucesso! Saldo atual: R$ " + saldo_total);
        } else {
            System.out.println("Valor de deposito invalido!");
        }
    }

    public void sacar(double valor) throws SaldoInsuficienteException{ 
        if (valor > saldo_total){
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar o saque!");
        } else if (valor > 0){
            this.saldo_total -= valor;
            System.out.println("Saque realizado com sucesso! Saldo atual: R$ " + saldo_total);
        } else {
            System.out.println("Valor de saque invalido!");
        }
    }
}