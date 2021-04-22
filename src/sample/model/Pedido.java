package sample.model;

import java.util.Date;

public class Pedido {
    private String descricao;
    private String data;
    private double total;
    private ItensPro itens;

    public Pedido(){
        itens = new ItensPro();
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getTotal() {
        return total;
    }

    public void addProduto(String nomeProduto, double preco){
        itens.setProduto(nomeProduto, preco);
        total += preco;

    }

    @Override
    public String toString() {
        return "Pedido\n" +
                "Descrição:" + descricao +
                ", Data:" + data +
                "\n" + itens +
                 "\ntotal=" + total;
    }
}
