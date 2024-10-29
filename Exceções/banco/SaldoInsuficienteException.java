public class SaldoInsuficienteException extends Exception{ // excecao para saldo insuficiente
    
    // mensagem de erro
    public SaldoInsuficienteException(String mensagem){
        super(mensagem);
    }
}