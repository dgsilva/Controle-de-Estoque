
package modelo;


public class Produto {
    private int codigo;
    private String nome,fornecedor,quantidade,preco,descricao;

    public int getcodigo() {
        return codigo;
    }

    public void setcodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String getnome() {
        return nome;
    }

    public String getfornecedor() {
        return fornecedor;
    }

    public String getquantidade() {
        return quantidade;
    }

    public String getpreco() {
        return preco;
    }

    public String getdescricao() {
        return descricao;
    }
    
    

    public void setnome(String nome) {
        this.nome = nome;
    }
    public void setfornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }
    public void setquantidade(String quantidade) {
        this.quantidade = quantidade;
    }
    public void setpreco(String preco) {
        this.preco = preco;
    }
    public void setdescricao(String descricao) {
        this.descricao = descricao;
    }
    
    }



