package com.company;

import artigo.Artigo;

public class Main {

    public static void main(String[] args) {

        Artigo artigo = new Artigo(“Artigo 1”,100,1100.00);

        if (artigo.temEstoque()){

            System.out.println(“Tem estoque disponível”);
        }
        System.out.println(“O preço de venda é“ + artigo.consultarPreco());

    }

}

