package sample.model;

import java.util.ArrayList;
import java.util.List;

/** Classes */

public class ItensPro {
private List<Produto> produtos;

    /** Getter e Setter */

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produto) {
        this.produtos = produto;
    }
    public void setProduto(String nome, double preco){
        if (this.produtos == null){
            this.produtos = new ArrayList<>();
        }

        Produto produto = new Produto();
        produto.setNome(nome);
        produto.setPreco(preco);
        produtos.add(produto);

    }

    /** ToString */

    @Override
    public String toString() {
        return "ItensPro\n" +
                "Produtos=" + produtos;
    }
}

