public class Produto{

    private String nome_produto;
    private int id_produto;
    private double preco_produto;

    public Produto(String nome, int id, double preco){ 
        this.nome_produto = nome;
        this.id_produto = id;
        this.preco_produto = preco;
    }

    public String getNome(){ 
        return this.nome_produto;
    }

    public void setNome(String nome){ 
        this.nome_produto = nome;
    }

    public int getId(){ 
        return this.id_produto;
    }

    public void setId(int id){ 
        this.id_produto = id;
    }

    public double getPreco(){ 
        return this.preco_produto;
    }

    public void setPreco(double preco) throws PrecoInvalidoException{ 
        if (preco <= 0){
            throw new PrecoInvalidoException("Preco de produto invalido!");
        } else {
            this.preco_produto = preco;
        }
    }
}