public class Verificacao{

    public void verificarNumero(int numero) throws NumeroInvalidoException{
        if (numero >= 1 && numero <= 100){ 
            System.out.println("O numero eh valido! Esta entre 1 e 100."); 
        } else{
            throw new NumeroInvalidoException("O numero deve estar entre 1 e 100");
        }
    }
}