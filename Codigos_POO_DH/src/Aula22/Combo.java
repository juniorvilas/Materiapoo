package Aula22;

import java.util.ArrayList;

public class Combo implements Carrinho{

    ArrayList<Carrinho> listaprodutos;

    public Combo() {
        this.listaprodutos = new ArrayList<>();
    }

    @Override
    public double calcularPreco() {
        double valorTotal = 0;

        for (Carrinho carrinho : listaprodutos) {
            valorTotal += carrinho.calcularPreco();
        }
        return valorTotal;
    }

    public void addProduto(Carrinho c){
        listaprodutos.add(c);

    }
}
