package org.example;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    //Atributos
    private List<Vendavel> cart;

    //Construtor
    public Carrinho() {
        this.cart = new ArrayList<>();
    }

    //Métodos
    public void adicionaVendavel(Vendavel v) {
        cart.add(v);
    }

    public Double calculaTotalVenda() {

        Double saldo = 0.0;

        for (Vendavel v : cart) {
            saldo += v.getValorVenda();
        }

        return saldo;
    }

    public void exibeItensCarrinho() {
        for (Vendavel v : cart) {
            System.out.println(v);
        }
    }


}
