package sample;

import sample.model.ItensPro;
import sample.model.Pedido;
import sample.model.Produto;

public class Main  {

    public static void main(String[] args){

//        ItensPro itensPro = new ItensPro();
//
//        itensPro.setProduto("uva", 1.3);
//
//        itensPro.setProduto("Melancia", 2.5);
//        System.out.println(itensPro);

        Pedido pedido = new Pedido();
        pedido.setDescricao("Pedidinho");
        pedido.setData("09/09/2003");
        pedido.addProduto("laranja", 2.5);
        pedido.addProduto("Melancia", 5.4);
        pedido.addProduto("Uva", 1.3);

        System.out.println(pedido);

    }
}
